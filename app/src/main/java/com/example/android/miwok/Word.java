package com.example.android.miwok;

/**
 * Created by Al Badr on 3/2/2017.
 */

public class Word {

    private String mDeafaultTranslation;
    private String mMikowTranslation;
    private int mImgResourceId = notImageProvided;
    private static final int notImageProvided = -1;


    public Word(String defaultTranslation, String MikowTranslition){
        mDeafaultTranslation = defaultTranslation;
        mMikowTranslation= MikowTranslition;
    }

    public Word(String deafaultLanguage, String mikowLanguage, int imgResourceId){
        mDeafaultTranslation = deafaultLanguage;
        mMikowTranslation = mikowLanguage;
        mImgResourceId = imgResourceId;

    }

    public String getDeafaultTranslation() {
        return mDeafaultTranslation;
    }

    public String getMikowTranslation(){
        return mMikowTranslation;
    }

    public int getImgResourceId(){
        return mImgResourceId;
    }

    public boolean hasImage(){

        return mImgResourceId != notImageProvided;
    }



}


