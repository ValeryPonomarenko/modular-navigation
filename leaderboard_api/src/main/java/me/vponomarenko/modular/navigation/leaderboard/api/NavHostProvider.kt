package me.vponomarenko.modular.navigation.leaderboard.api

import androidx.navigation.fragment.NavHostFragment

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

interface NavHostProvider {
    fun provideNavHost(): NavHostFragment
}