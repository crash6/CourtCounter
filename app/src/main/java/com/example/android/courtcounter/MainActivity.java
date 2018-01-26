package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int THREE_POINTS_SCORE = 3; //Value for a three points throw
    static final int TWO_POINTS_SCORE = 2; //Value for a two points throw
    static final int FREE_THROW = 1; //Value for a one point throw

    static final int INITIAL_SCORE = 0; //Initial value for the scoreboard

    int scoreTeamA; //Keeps the score for the Team A
    int scoreTeamB; //Keeps the score for the Team B

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initScoreTeamA();
        initScoreTeamB();

        displayForTeamA();
        displayForTeamB();
    }

    /**
     * Display the given score for Team A
     */
    public void displayForTeamA(){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
    *   Method called when the 'three_points_to_a' button is clicked
     */
    public void addThreeForTeamA(View view){
        updateScoreTeamA(THREE_POINTS_SCORE);
        displayForTeamA();
    }

    /**
     *   Method called when the 'two_points_to_a' button is clicked
     */
    public void addTwoForTeamA(View view){
        updateScoreTeamA(TWO_POINTS_SCORE);
        displayForTeamA();
    }

    /**
     *   Method called when the 'free_throw_to_a' button is clicked
     */
    public void addOneForTeamA(View view){
        updateScoreTeamA(FREE_THROW);
        displayForTeamA();
    }

    /**
     *  This methods initializes the score for the Team A
     */
    private void initScoreTeamA(){
        scoreTeamA = INITIAL_SCORE;
    }

    /**
     *  This method updates the score for the Team A
     */
    private void updateScoreTeamA(int score){
        scoreTeamA += score;
    }

    /**
     * Display the given score for Team B
     */
    public void displayForTeamB(){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     *   Method called when the 'three_points_to_b' button is clicked
     */
    public void addThreeForTeamB(View view){
        updateScoreTeamB(THREE_POINTS_SCORE);
        displayForTeamB();
    }

    /**
     *   Method called when the 'two_points_to_b' button is clicked
     */
    public void addTwoForTeamB(View view){
        updateScoreTeamB(TWO_POINTS_SCORE);
        displayForTeamB();
    }

    /**
     *   Method called when the 'free_throw_to_b' button is clicked
     */
    public void addOneForTeamB(View view){
        updateScoreTeamB(FREE_THROW);
        displayForTeamB();
    }

    /**
     *  Method called when the 'reset_score' button is clicked
     */
    public void resetScore(View view){
        reset();
        displayForTeamA();
        displayForTeamB();
    }

    /**
     *  This methods initializes the score for the Team B
     */
    private void initScoreTeamB(){
        scoreTeamB = INITIAL_SCORE;
    }

    /**
     *  This method updates the score for the Team B
     */
    private void updateScoreTeamB(int score){
        scoreTeamB += score;
    }

    /**
     *  This method resetScore the score for both teams
     */
    private void reset(){
        initScoreTeamB();
        initScoreTeamA();
    }

}
