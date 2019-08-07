package me.vponomarenko.modular.navigation.leaderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class LeaderboardFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_leaderboard, container, false)
}