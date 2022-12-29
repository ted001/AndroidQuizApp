package com.ted.quiz

import android.os.Bundle
import android.provider.SyncStateContract
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {
    private val TAG = "QuizQuestionsActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        val questionsList = Constants.getQuestions()
        Log.d(TAG, "${questionsList.size}")
        for (i in questionsList) {
            Log.d(TAG, i.question)
        }
    }
}
