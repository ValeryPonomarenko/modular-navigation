package me.vponomarenko.modular.navigation.leaderboard

import androidx.navigation.fragment.NavHostFragment
import me.vponomarenko.modular.navigation.leaderboard.api.NavHostProvider

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

@Suppress("unused")
class NavProvider : NavHostProvider {
    override fun provideNavHost(): NavHostFragment = NavHostFragment.create(R.navigation.leaderboard_nav)
}