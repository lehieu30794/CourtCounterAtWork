package com.example.android.courtcounteratwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    public void addOnePointForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    //    Display score of team A
    public void displayTeamA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.scoreTeamA);
        scoreTeamA.setText(String.valueOf(score));
    }


    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    public void addTwoPointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    public void addOnePointForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    public void resetScore (View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

    //    Display score of team B
    public void displayTeamB(int score) {
        TextView scoreTeamB = (TextView) findViewById(R.id.score_team_b);
        scoreTeamB.setText(String.valueOf(score));
    }
}
