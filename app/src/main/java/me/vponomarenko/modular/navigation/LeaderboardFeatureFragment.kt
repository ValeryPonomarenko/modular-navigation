package me.vponomarenko.modular.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class LeaderboardFeatureFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_feature, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val manager = SplitInstallManagerFactory.create(context)
        if (savedInstanceState == null) {
            childFragmentManager
                .beginTransaction()
                .replace(R.id.featureFragmentContainer, createLeaderboardFragment())
                .commit()
        }
    }

    private fun createLeaderboardFragment(): Fragment =
        Class.forName("me.vponomarenko.modular.navigation.leaderboard.LeaderboardFragment")
            .newInstance() as Fragment
}