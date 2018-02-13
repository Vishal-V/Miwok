package com.example.android.miwok;

public class Word {
    private String mEnglishWord, mMiwokWord;
    private static final int mNoImage = -1;
    private int mResourceId = mNoImage;
    private int mMediaResourceId;

    public Word (String miwok, String english, int mediaResource){
        mEnglishWord = english;
        mMiwokWord = miwok;
        mMediaResourceId = mediaResource;
    }

    public Word(String miwok, String english, int resource, int mediaResource) {
        mMiwokWord = miwok;
        mEnglishWord = english;
        mResourceId = resource;
        mMediaResourceId = mediaResource;
    }

    public int playThisResource() {
        return mMediaResourceId;
    }

    public boolean hasImage() {
        if(this.mResourceId == -1){
            return false;
        }
        return true;
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
