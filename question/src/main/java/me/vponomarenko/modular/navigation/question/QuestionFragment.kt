package me.vponomarenko.modular.navigation.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_question.*
import me.vponomarenko.injectionmanager.x.XInjectionManager

/**
 * Author: Valery Ponomarenko
 * Date: 30/01/2019
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class QuestionFragment : Fragment() {

    companion object {
        private const val EXTRA_QUESTION_ID = "me.vponomarenko.modular.navigation.question.id"

        fun createBundle(questionId: Long) =
            Bundle().apply {
                putLong(EXTRA_QUESTION_ID, questionId)
            }
    }

    private val navigation: QuestionNavigation by lazy {
        XInjectionManager.findComponent<QuestionNavigation>()
    }

    private val questionId: Long by lazy {
        arguments?.getLong(EXTRA_QUESTION_ID) ?: throw IllegalStateException("no questionId")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_question, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_question.text = getString(R.string.question, questionId)
        button_right_answer.setOnClickListener {
            navigation.openRightAnswer()
        }
        button_wrong_answer.setOnClickListener {
            navigation.openWrongAnswer()
        }
    }
}