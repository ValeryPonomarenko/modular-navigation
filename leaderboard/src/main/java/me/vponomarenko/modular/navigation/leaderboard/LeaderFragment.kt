package me.vponomarenko.modular.navigation.leaderboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_leader.*

/**
 * Author: Valery Ponomarenko
 * Date: 2019-08-07
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class LeaderFragment : Fragment() {

    companion object {
        private const val EXTRA_QUESTION_ID = "me.vponomarenko.modular.navigation.leaderboard.name"

        fun createBundle(name: String) =
            Bundle().apply {
                putString(EXTRA_QUESTION_ID, name)
            }
    }

    private val leaderName by lazy {
        arguments?.getString(EXTRA_QUESTION_ID) ?: throw IllegalStateException("no name")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_leader, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_leader_name.text = leaderName
    }
}