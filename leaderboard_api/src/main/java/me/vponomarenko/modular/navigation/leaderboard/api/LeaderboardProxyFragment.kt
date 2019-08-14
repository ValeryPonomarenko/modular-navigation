package me.vponomarenko.modular.navigation.leaderboard.api

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import me.vponomarenko.injectionmanager.IHasComponent
import me.vponomarenko.injectionmanager.x.XInjectionManager

class LeaderboardProxyFragment : Fragment(), IHasComponent<ModuleBinder> by BinderInitializer() {

    private val binder by lazy { XInjectionManager.bindComponent(this) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_leaderboard_proxy, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) {
            val root = binder.provideRootFragment()
            childFragmentManager
                .beginTransaction()
                .replace(R.id.leaderboardFeatureContainer, root)
                .setPrimaryNavigationFragment(root)
                .commit()
        }
    }

    override fun onResume() {
        super.onResume()
        binder.provideNavigator().bind(binder.provideRootFragment().findNavController())
    }

    override fun onPause() {
        super.onPause()
        binder.provideNavigator().unbind()
    }
}