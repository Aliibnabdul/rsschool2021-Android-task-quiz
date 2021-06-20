package com.rsschool.quiz.ui

interface MainActivityInterface {
    fun moveToNextFragment(checkedAnswer: Int)
    fun moveToPreviousFragment()

    fun shareResult()
    fun finishQuiz()
    fun restartQuiz()
}