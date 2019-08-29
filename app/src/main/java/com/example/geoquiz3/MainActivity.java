package com.example.geoquiz3;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.example.geoquiz3.model.Question;

public class MainActivity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private Button mButtonTrue;
    private Button mButtonFalse;
    private Button mButtonNext;
    private Button mButtonPrevious;

    private Question[] mQuestionBank = {
            new Question(R.string.question_australia, false),
            new Question(R.string.question_oceans, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, true),
            new Question(R.string.question_americas, false),
            new Question(R.string.question_asia, false)
    };

    private int mQuestionIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionTextView = findViewById(R.id.textview_question);
        mButtonTrue = findViewById(R.id.button_True);
        mButtonFalse = findViewById(R.id.Button_False);
        mButtonNext = findViewById(R.id.button_next);
        mButtonPrevious = findViewById(R.id.button_previous);

        mQuestionTextView.setText(mQuestionBank[mQuestionIndex].getTextResId());
// ButtonOnClickTrue buttonOnClickTrue=new ButtonOnClickTrue();///اگر بخواهیم کلاس برای هر دکمه بسازیم که واویلا میشه
// ButtonTrue.setOnClickListener(buttonOnClickTrue);  //باید انانمس کلاس بسازیم
        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
            }
        });
///////////E:\java class\MyHomeWorks\Android\GeoQuiz\app\build.gradle
        mButtonFalse .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_LONG).show();
            }
        });


        mButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionIndex++;
                mQuestionTextView.setText(mQuestionBank[mQuestionIndex].getTextResId());

            }
        });
        mButtonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mQuestionIndex--;
                mQuestionTextView.setText(mQuestionBank[mQuestionIndex].getTextResId());

            }
        });
    }
}