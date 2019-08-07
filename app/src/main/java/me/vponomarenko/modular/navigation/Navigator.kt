package me.vponomarenko.modular.navigation

import androidx.navigation.NavController
import me.vponomarenko.modular.navigation.question.QuestionFragment
import me.vponomarenko.modular.navigation.question.QuestionNavigation
import me.vponomarenko.modular.navigation.questions.QuestionsNavigation
import me.vponomarenko.modular.navigation.result.right.RightAnswerNavigation
import me.vponomarenko.modular.navigation.result.wrong.WrongAnswerNavigation

/**
 * Author: Valery Ponomarenko
 * Date: 30/01/2019
 * LinkedIn: https://www.linkedin.com/in/ponomarenkovalery
 */

class Navigator : QuestionsNavigation, QuestionNavigation, RightAnswerNavigation, WrongAnswerNavigation {

    private var navController: NavController? = null

    override fun openQuestion(questionId: Long) {
        navController?.navigate(
            R.id.action_questionsFragment_to_questionFragment,
            QuestionFragment.createBundle(questionId)
        )
    }

    override fun openLeaderboard() {
        navController?.navigate(R.id.action_questionsFragment_to_leaderboardFeatureFragment)
    }

    override fun openWrongAnswer() {
        navController?.navigate(R.id.action_questionFragment_to_wrongAnswerFragment)
    }

    override fun openRightAnswer() {
        navController?.navigate(R.id.action_questionFragment_to_rightAnswerFragment)
    }

    override fun openAllQuestions() {
        navController?.popBackStack()
    }

    override fun tryAgain() {
        navController?.popBackStack()
    }

    fun bind(navController: NavController) {
        this.navController = navController
    }

    fun unbind() {
        navController = null
    }
}