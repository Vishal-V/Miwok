package com.example.android.miwok;

public class Word {
    private String mEnglishWord, mMiwokWord;

    public Word (String miwok, String english){
        mEnglishWord = english;
        mMiwokWord = miwok;
    }

    public String getMiwokTranslation() {
        return mMiwokWord;
    }

    public String getDefaultTranslation() {
        return mEnglishWord;
    }
}
