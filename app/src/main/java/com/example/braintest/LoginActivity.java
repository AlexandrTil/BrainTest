package com.example.braintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import info.hoang8f.widget.FButton;

public class LoginActivity extends AppCompatActivity {

    private FButton btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnStart = findViewById(R.id.btnStart);
        btnStart.setButtonColor(getResources().getColor(R.color.fbutton_color_sun_flower));
        btnStart.setShadowColor(getResources().getColor(R.color.fbutton_color_belize_hole));
        btnStart.setShadowEnabled(true);
        btnStart.setShadowHeight(15);
        btnStart.setCornerRadius(90);
    }

    public void onClickStart(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}