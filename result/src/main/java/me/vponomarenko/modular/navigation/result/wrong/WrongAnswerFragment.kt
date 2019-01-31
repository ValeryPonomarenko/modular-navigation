package me.vponomarenko.modular.navigation.result.wrong

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_wrong.*
import me.vponomarenko.injectionmanager.x.XInjectionManager
import me.vponomarenko.modular.navigation.result.R

/**
 * Author: Valery Ponomarenko
 * Date: 30/01/2019
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class WrongAnswerFragment : Fragment() {

    private val navigation: WrongAnswerNavigation by lazy {
        XInjectionManager.findComponent<WrongAnswerNavigation>()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_wrong, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_try_again.setOnClickListener {
            navigation.tryAgain()
        }
    }
}