package me.vponomarenko.modular.navigation.leaderboard.api

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LeaderboardFeatureFragment : Fragment() {

    companion object {
        private const val MODULE_BINDER = "me.vponomarenko.modular.navigation.leaderboard.LeaderboardModuleBinder"
    }

    private val binder by lazy { Class.forName(MODULE_BINDER).newInstance() as ModuleBinder }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_feature, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            val navHost = binder.provideNavHost()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.nav_host_feature_fragment, navHost)
                .setPrimaryNavigationFragment(navHost)
                .commit()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBundle("123", findNavController().saveState())
    }
}