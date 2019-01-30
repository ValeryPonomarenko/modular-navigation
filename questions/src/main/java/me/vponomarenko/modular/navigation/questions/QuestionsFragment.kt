package me.vponomarenko.modular.navigation.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_questions.*
import me.vponomarenko.injectionmanager.x.XInjectionManager

/**
 * Author: Valery Ponomarenko
 * Date: 30/01/2019
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class QuestionsFragment : Fragment() {

    private val navigation: QuestionsNavigation by lazy {
        XInjectionManager.findComponent<QuestionsNavigation>()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_questions, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_first_question.setOnClickListener {
            navigation.openQuestion(1)
        }
        button_second_question.setOnClickListener {
            navigation.openQuestion(2)
        }
        button_third_question.setOnClickListener {
            navigation.openQuestion(3)
        }
    }
}