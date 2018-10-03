package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int s = 0;
    int sb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    /**
     * Displays the given score for Team A.
     */

    protected void onCreate1(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamB(sb);
    }
    public void increment3(View v){
        s = s + 3;
        displayForTeamA(s);


    }
    public void increment2(View v){
        s = s + 2;
        displayForTeamA(s);


    }
    public void increment1(View v){
        s = s + 1;
        displayForTeamA(s);


    }
    public void increment3b(View v){
        sb = sb + 3;
        displayForTeamB(sb);


    }
    public void increment2b(View v){
        sb = sb + 2;
        displayForTeamB(sb);


    }
    public void increment1b(View v){
        sb = sb + 1;
        displayForTeamB(sb);


    }
    public void reset(View v){
        s = 0;
        sb = 0;
        displayForTeamA(s);
        displayForTeamB(sb);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
