package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

    }

    /**
     * Displays the given score for Team A.
     */
    public void display3(View view) {
        scoreTeamA = (scoreTeamA + 3);
        display( scoreTeamA );
    }

    public void display2(View view) {
        scoreTeamA = (scoreTeamA + 2);
        display( scoreTeamA );
    }

    public void display1(View view) {
        scoreTeamA = (scoreTeamA + 1);
        display( scoreTeamA );
    }


    public void displayForTeamB3(View v) {
        scoreTeamB = (scoreTeamB + 3);
        displayForTeamB( scoreTeamB );
    }

    public void displayForTeamB2(View v) {
        scoreTeamB = (scoreTeamB + 2);
        displayForTeamB( scoreTeamB );
    }

    public void displayForTeamB1(View v) {
        scoreTeamB = (scoreTeamB + 1);
        displayForTeamB( scoreTeamB );
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById( R.id.team_a_score );
        quantityTextView.setText( "" + number );

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById( R.id.team_b_score );
        scoreView.setText( String.valueOf( score ) );
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB( scoreTeamB );
        display( scoreTeamA );
    }

}




