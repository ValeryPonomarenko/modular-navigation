package me.vponomarenko.modular.navigation.leaderboard.api

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment

class LeaderboardFeatureFragment : Fragment() {

    companion object {
        private const val NAV_PROVIDER_PATH = "me.vponomarenko.modular.navigation.leaderboard.NavProvider"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_feature, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            val nav = createLeaderboardNav()
            val fragmentManager = fragmentManager ?: throw IllegalStateException("FM cannot be null")
            fragmentManager
                .beginTransaction()
                .replace(R.id.nav_host_feature_fragment, nav)
                .setPrimaryNavigationFragment(nav)
                .commit()
        }
    }

    private fun createLeaderboardNav(): NavHostFragment =
        (Class.forName(NAV_PROVIDER_PATH).newInstance() as NavHostProvider)
            .provideNavHost()
}