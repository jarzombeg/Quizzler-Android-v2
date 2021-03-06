package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare member variables here:
    Button mTrueButton;
    Button mFalseButton;
    TextView mQuestionTextView;
    int mIndex;
    int mQuestion;

    // TODO: Move to QuizModel and uncomment to create question bank
    // Create question bank using the Question class for each item in the array
    private TrueFalse[] mQuestionBank = new TrueFalse[]{
            new TrueFalse(R.string.question_1, true),
            new TrueFalse(R.string.question_2, true),
            new TrueFalse(R.string.question_3, true),
            new TrueFalse(R.string.question_4, true),
            new TrueFalse(R.string.question_5, true),
            new TrueFalse(R.string.question_6, false),
            new TrueFalse(R.string.question_7, true),
            new TrueFalse(R.string.question_8, false),
            new TrueFalse(R.string.question_9, true),
            new TrueFalse(R.string.question_10, true),
            new TrueFalse(R.string.question_11, false),
            new TrueFalse(R.string.question_12, false),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTrueButton = findViewById(R.id.true_button);
        mFalseButton = findViewById(R.id.false_button);
        mQuestionTextView = findViewById(R.id.question_text_view);

        mQuestion = mQuestionBank[mIndex].getQuestionID();

        mQuestionTextView.setText(mQuestion);


        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quizzler", "Button pressed");

                // Making Toast v1 - anonymous
                Toast.makeText(getApplicationContext(), "True Button Pressed", Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quizzler", "Button pressed");

                // Making Toast v2 - long, unnecessary way
                Toast myToast = Toast.makeText(getApplicationContext(), "False Button Pressed", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

        //TODO: Configure buttons here:


    }

    private void updateQuestion() {
        mIndex = (mIndex +1);
        mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);
    }


    // TODO: Add feedbackOnAnswer() method:


    // TODO: Add goToNextQuestion() method:


    // TODO: Add updateScreen() method:


    // TODO: Save state during rotation

}
