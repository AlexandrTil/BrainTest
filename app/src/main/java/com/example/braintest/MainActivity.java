package com.example.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAnswA, btnAnswB, btnAnswC, btnAnswD;
    private TextView tvQuestion;
    private Questions questions;
    private List<Questions> list;
    private int pos;
    private int j;
    private int correctAnsw, incorrectAnsw = 0;
    public static final String KEY1 = "true_answers";
    public static final String KEY2 = "false_answers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        nextQuestion();

        btnAnswA.setOnClickListener(this);
        btnAnswB.setOnClickListener(this);
        btnAnswC.setOnClickListener(this);
        btnAnswD.setOnClickListener(this);
    }

    private void init() {
        questions = new Questions();
        list = questions.addQuest();
        btnAnswA = findViewById(R.id.btnAnswA);
        btnAnswB = findViewById(R.id.btnAnswB);
        btnAnswC = findViewById(R.id.btnAnswC);
        btnAnswD = findViewById(R.id.btnAnswD);
        tvQuestion = findViewById(R.id.tvQuestion);
    }

    public void nextQuestion() {       Random r = new Random();
        if (list.size() > 0) {
            pos = r.nextInt(list.size());
            tvQuestion.setText(list.get(pos).getQuestion());
            btnAnswA.setText(list.get(pos).getAnswer1());
            btnAnswB.setText(list.get(pos).getAnswer2());
            btnAnswC.setText(list.get(pos).getAnswer3());
            btnAnswD.setText(list.get(pos).getAnswer4());
            Log.d("MyLog", "list size " + list.size());
        }
        if (j == 10) {
            Intent i = new Intent(this, FinishActivity.class);
            i.putExtra(KEY1, correctAnsw);
            i.putExtra(KEY2, incorrectAnsw);
            startActivity(i);
            finish();
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btnAnswA:
                if (list.get(pos).getTrueAnswer().equals(list.get(pos).getAnswer1())) {
                    correctAnsw++;
                } else {
                    incorrectAnsw++;
                }
                break;
            case R.id.btnAnswB:
                if (list.get(pos).getTrueAnswer().equals(list.get(pos).getAnswer2())) {
                    correctAnsw++;
                } else {
                    incorrectAnsw++;
                }
                break;
            case R.id.btnAnswC:
                if (list.get(pos).getTrueAnswer().equals(list.get(pos).getAnswer3())) {
                    correctAnsw++;
                } else {
                    incorrectAnsw++;
                }
                break;
            case R.id.btnAnswD:
                if (list.get(pos).getTrueAnswer().equals(list.get(pos).getAnswer4())) {
                    correctAnsw++;
                } else {
                    incorrectAnsw++;
                }
                break;
        }
        Log.d("MyLog", "tr " + correctAnsw + " fs " + incorrectAnsw);
        j++;
        list.remove(pos);
        nextQuestion();
    }
}
