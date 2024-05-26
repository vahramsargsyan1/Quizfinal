package com.example.quizfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.currectAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct",0);
        final int getInorrectAnswers = getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswers.setText(String.valueOf(getInorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}