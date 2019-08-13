package me.vponomarenko.modular.navigation.leaderboard

import androidx.navigation.fragment.NavHostFragment
import me.vponomarenko.modular.navigation.leaderboard.api.ModuleBinder

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

@Suppress("unused")
class LeaderboardModuleBinder : ModuleBinder {

    companion object {
        val navigator = Navigator()
    }

    private val navHost by lazy {
        NavHostFragment.create(R.navigation.leaderboard_nav)
    }

    override fun provideNavHost(): NavHostFragment = navHost
}