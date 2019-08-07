package me.vponomarenko.modular.navigation.leaderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_leaderboard.*

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class LeaderboardFragment : Fragment() {

    private val navigation = Navigator()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_leaderboard, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_john.setOnClickListener {
            navigation.openLeader("John Doe")
        }
    }

    override fun onResume() {
        super.onResume()
        navigation.bind(findNavController())
    }

    override fun onPause() {
        super.onPause()
        navigation.unbind()
    }
}