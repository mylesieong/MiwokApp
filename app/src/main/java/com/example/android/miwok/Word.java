package com.example.android.miwok;

/**
 * Created by asus on 12/11/2016.
 */

public class Word {
    private String mTextMiwok="";
    private String mTextEng="";
    public Word(String miwok, String english){
        this.mTextEng = english==null?"":english;
        this.mTextMiwok = miwok==null?"":miwok;
    }
    public void setTextMiwok(String s){
        this.mTextMiwok = s;
    }
    public String getTextMiwok(){
        return this.mTextMiwok==null?"":this.mTextMiwok;
    }
    public void setTextEng(String s){
        this.mTextEng = s;
    }
    public String getTextEng(){
        return this.mTextEng==null?"":this.mTextEng;
    }
}
