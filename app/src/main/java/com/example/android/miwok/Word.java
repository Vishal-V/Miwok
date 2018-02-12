package com.example.android.miwok;

public class Word {
    private String mEnglishWord, mMiwokWord;
    private static final int mNoImage = -1;
    private int mResourceId = mNoImage;

    public Word (String miwok, String english){
        mEnglishWord = english;
        mMiwokWord = miwok;
    }

    public Word(String miwok, String english, int resource) {
        mMiwokWord = miwok;
        mEnglishWord = english;
        mResourceId = resource;
    }



    public String getMiwokTranslation() {
        return mMiwokWord;
    }

    public String getDefaultTranslation() {
        return mEnglishWord;
    }

    public int getResourceId(){
        return mResourceId;
    }
}
