package com.example.claudia.valentinesdayquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice1;
    // Question 2
    RadioButton question2_choice2;
    // Question 3
    RadioButton question3_choice3;
    // Question 4
    EditText question4_answer;
    // Question 5
    RadioButton question5_choice4;
    // Question 6
    RadioButton question6_choice2;
    // Question 7
    RadioButton question7_choice2;
    // Question 8
    RadioButton question8_choice1;
    // Question 9
    CheckBox question9_choice1;
    CheckBox question9_choice2;
    CheckBox question9_choice3;
    CheckBox question9_choice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #1 (red roses)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        answer1 = question1_choice1.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is #2 "Romeo and Juliet"
        //------------------------------------------------------------------------------------------
        Boolean answer2;

        question2_choice2 = (RadioButton) this.findViewById(R.id.question2_choice2);
        answer2 = question2_choice2.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
//------------------------------------------------------------------------------------------
        // Question 3 - Correct Answer is #3 "Jennifer Rush"
        //------------------------------------------------------------------------------------------
        Boolean answer3;

        question3_choice3 = (RadioButton) this.findViewById(R.id.question3_choice3);
        answer3 = question3_choice3.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "14 February"
        //------------------------------------------------------------------------------------------
        String answer4;
        question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString();
        if (answer4.equals("14 February")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
//------------------------------------------------------------------------------------------
        // Question 5 - Correct Answer is #4 "Empire State Building"
        //------------------------------------------------------------------------------------------
        Boolean answer5;

        question5_choice4 = (RadioButton) this.findViewById(R.id.question5_choice4);
        answer5 = question5_choice4.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }
//------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is #2 "Edmund Spenser"
        //------------------------------------------------------------------------------------------
        Boolean answer6;

        question6_choice2 = (RadioButton) this.findViewById(R.id.question6_choice2);
        answer6 = question6_choice2.isChecked();
        if (answer6) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
//------------------------------------------------------------------------------------------
        // Question 7 - Correct Answer is #2 "Never kiss on the mouth."
        //------------------------------------------------------------------------------------------
        Boolean answer7;

        question7_choice2 = (RadioButton) this.findViewById(R.id.question7_choice2);
        answer7 = question7_choice2.isChecked();
        if (answer7) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
//------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is #1 "Dom Perignon"
        //------------------------------------------------------------------------------------------
        Boolean answer8;

        question8_choice1 = (RadioButton) this.findViewById(R.id.question8_choice1);
        answer8 = question8_choice1.isChecked();
        if (answer8) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers are #1 (They are high in zinc, which is necessary for sperm production.)
        // and #4 (They are rich in amino acids that trigger increased levels of sex hormones.)
        //------------------------------------------------------------------------------------------
        Boolean answer9_choice1;
        Boolean answer9_choice2;
        Boolean answer9_choice3;
        Boolean answer9_choice4;
        question9_choice1 = (CheckBox) this.findViewById(R.id.question9_choice1);
        question9_choice2 = (CheckBox) this.findViewById(R.id.question9_choice2);
        question9_choice3 = (CheckBox) this.findViewById(R.id.question9_choice3);
        question9_choice4 = (CheckBox) this.findViewById(R.id.question9_choice4);
        answer9_choice1 = question9_choice1.isChecked();
        answer9_choice2 = question9_choice2.isChecked();
        answer9_choice3 = question9_choice3.isChecked();
        answer9_choice4 = question9_choice4.isChecked();
        if (answer9_choice1 && !answer9_choice2 && !answer9_choice3 && answer9_choice4) {
            answer9_score = 2;
        } else {
            answer9_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10!!! \n And you got the chocolate and champagne \n for Valentine's Day :)";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
