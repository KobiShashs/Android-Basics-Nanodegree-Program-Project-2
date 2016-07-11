package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    TextView textViewScoreA;
    TextView textViewScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewScoreA = (TextView) findViewById(R.id.textViewTeamA);
        textViewScoreB = (TextView) findViewById(R.id.textViewTeamB);
    }

    public void resetScore(View v) {
        textViewScoreA.setText(R.string.zero_value);
        textViewScoreB.setText(R.string.zero_value);
        scoreTeamA = 0;
        scoreTeamB = 0;
        Toast.makeText(MainActivity.this, "Reset...", Toast.LENGTH_SHORT).show();
    }


    public void score3TeamA(View v) {
        updateScore(true, 3);
    }

    public void score2TeamA(View v) {
        updateScore(true, 2);
    }

    public void score1TeamA(View v) {
        updateScore(true, 1);
    }

    public void score3TeamB(View v) {
        updateScore(false, 3);
    }

    public void score2TeamB(View v) {
        updateScore(false, 2);
    }

    public void score1TeamB(View v) {
        updateScore(false, 1);
    }

    public void updateScore(boolean isTeamA, int value) {
        if (isTeamA) {
            textViewScoreA = (TextView) findViewById(R.id.textViewTeamA);
            scoreTeamA += value;
            textViewScoreA.setText(String.valueOf(scoreTeamA));
        } else {
            textViewScoreB = (TextView) findViewById(R.id.textViewTeamB);
            scoreTeamB += value;
            textViewScoreB.setText(String.valueOf(scoreTeamB));
        }

    }

}
