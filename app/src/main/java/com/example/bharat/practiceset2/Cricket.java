package com.example.bharat.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Cricket extends AppCompatActivity {
    /*score for team a and team b*/
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outTeamA = 0;
    int outTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
    }
    /**
     * Add 1 For Team A.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 4 For Team A.
     */
    public void addFourForTeamA(View v) {
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add 6 For Team A.
     */
    public void addSixForTeamA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Add out For Team A.
     */
    public void outTeamA(View view) {
        outTeamA = outTeamA + 1;
        outForTeamA(outTeamA);
    }
    /**
     * Add 1 For Team B.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Add 4 For Team B.
     */
    public void addFourForTeamB(View v) {
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Add 6 For Team B.
     */
    public void addSixForTeamB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Add out For Team B.
     */
    public void outTeamB(View view) {
        outTeamB = outTeamB + 1;
        outForTeamB(outTeamB);
    }
    /**
     * Reset score for both team to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        outTeamA = 0;
        outTeamB = 0;
        outForTeamA(outTeamA);
        outForTeamB(outTeamB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given out for Team A.
     */
    public void outForTeamA(int out) {
        TextView outView = (TextView) findViewById(R.id.team_a_out);
        outView.setText(String.valueOf(out));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given out for Team B.
     */
    public void outForTeamB(int out) {
        TextView outView = (TextView) findViewById(R.id.team_b_out);
        outView.setText(String.valueOf(out));
    }
}
