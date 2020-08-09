package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Move to QuizModel and uncomment to create question bank
    // Create question bank using the Question class for each item in the array
//    private Question[] mQuestionBank = new Question[] {
//            new Question(R.string.question_1, true),
//            new Question(R.string.question_2, true),
//            new Question(R.string.question_3, true),
//            new Question(R.string.question_4, true),
//            new Question(R.string.question_5, true),
//            new Question(R.string.question_6, false),
//            new Question(R.string.question_7, true),
//            new Question(R.string.question_8, false),
//            new Question(R.string.question_9, true),
//            new Question(R.string.question_10, true),
//            new Question(R.string.question_11, false),
//            new Question(R.string.question_12, false),
//    };

    // TODO: Declare member variables here:
    Button mTrueButton;
    Button mFalseButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTrueButton = findViewById(R.id.true_button);

        // Creating onClickListeners long way v1
        View.OnClickListener myListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Quizzler", "Button pressed");

                // Making Toast v1 - anonymous
                Toast.makeText(getApplicationContext(), "True Button Pressed", Toast.LENGTH_SHORT).show();
            }
        };
        mTrueButton.setOnClickListener(myListener);


        mFalseButton = findViewById(R.id.false_button);

        // Creating onClickListeners v2 - anonymous
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


    // TODO: Add feedbackOnAnswer() method:



    // TODO: Add goToNextQuestion() method:



    // TODO: Add updateScreen() method:



    // TODO: Save state during rotation

}
