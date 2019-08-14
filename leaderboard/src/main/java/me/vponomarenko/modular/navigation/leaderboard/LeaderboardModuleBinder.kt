package me.vponomarenko.modular.navigation.leaderboard

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import me.vponomarenko.modular.navigation.common.BaseNavigator
import me.vponomarenko.modular.navigation.leaderboard.api.ModuleBinder

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

@Suppress("unused")
class LeaderboardModuleBinder : ModuleBinder {

    companion object {
        internal val navigator = Navigator()
    }

    private val navHost by lazy {
        NavHostFragment.create(R.navigation.leaderboard_nav)
    }

    override fun provideRootFragment(): Fragment = navHost

    override fun provideNavigator(): BaseNavigator = navigator
}