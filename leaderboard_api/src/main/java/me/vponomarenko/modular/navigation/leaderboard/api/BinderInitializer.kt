package me.vponomarenko.modular.navigation.leaderboard.api

import me.vponomarenko.injectionmanager.IHasComponent

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-13
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

internal class BinderInitializer : IHasComponent<ModuleBinder> {

    companion object {
        private const val MODULE_BINDER = "me.vponomarenko.modular.navigation.leaderboard.LeaderboardModuleBinder"
    }

    override fun getComponent(): ModuleBinder = Class.forName(MODULE_BINDER).newInstance() as ModuleBinder
}