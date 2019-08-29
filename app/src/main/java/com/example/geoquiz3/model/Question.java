package com.example.geoquiz3.model;



public class Question {
    private int mTextResId; /////چرا int چون ما می خواهیم در کلاس مین اکتیویتی R.string.question_australia صداش کنیم که ای دی داخل ار را می دهذ
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public boolean checkAnswer(boolean userPressed) {
        return userPressed == mAnswerTrue;
    }
}