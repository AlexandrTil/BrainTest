package com.example.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import info.hoang8f.widget.FButton;

public class FinishActivity extends AppCompatActivity {

    private FButton btnNewGame;
    private TextView tvFinish;
    private int correctAnsw, incorrectAnsw;
    private String textWin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        tvFinish = findViewById(R.id.tvFinish);
        btnNewGame = findViewById(R.id.btnNewGame);
        btnNewGame.setButtonColor(getResources().getColor(R.color.fbutton_color_sun_flower));
        btnNewGame.setShadowColor(getResources().getColor(R.color.fbutton_color_belize_hole));
        btnNewGame.setShadowEnabled(true);
        btnNewGame.setShadowHeight(15);
        btnNewGame.setCornerRadius(90);

        end();
    }

    private void end() {
        Intent intent = getIntent();
        correctAnsw = intent.getIntExtra(MainActivity.KEY1, 0);
        incorrectAnsw = intent.getIntExtra(MainActivity.KEY2, 0);
        textWin = FinishActivity.this.getResources().getString(R.string.win);
        tvFinish.setText(textWin + " " + correctAnsw);
        Log.d("MyLog", "True: " + correctAnsw + " False: " + incorrectAnsw);
    }

    public void onClickNewGame(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}