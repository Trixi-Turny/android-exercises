package com.example.trixiturny.geoquiz;

import android.widget.Button;
import android.widget.TextView;

public class Question {

    private int mTextResId;
    private Button mNextButton;
    private TextView mQuestionTextView;

    protected int getTextResId() {
        return mTextResId;
    }

    private int mCurrentIndex = 0;
    protected Question setTextResId(int textResId) {
        mTextResId = textResId;
        return this;
    }

    protected boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    protected Question setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
        return this;
    }

    private boolean mAnswerTrue;

    public Question(int mTextResId, boolean mAnswerTrue){
        this.mTextResId = mTextResId;
        this.mAnswerTrue = mAnswerTrue;
    }

}
