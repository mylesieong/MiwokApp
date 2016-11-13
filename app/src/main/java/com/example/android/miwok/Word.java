package com.example.android.miwok;

/**
 * Created by asus on 12/11/2016.
 */

public class Word {

    private String mTextMiwok = "";
    private String mTextEng = "";
    private int mImageResourceId = Word.NO_IMAGE_RESOURCE;

    private final static int NO_IMAGE_RESOURCE = -1;

    /**
     * Contructor to receive 2 input of text,assume that there is no image resource
     *
     * @param miwok
     * @param english
     */
    public Word(String miwok, String english) {
        this.mTextEng = english == null ? "" : english;
        this.mTextMiwok = miwok == null ? "" : miwok;
        this.mImageResourceId = Word.NO_IMAGE_RESOURCE;
    }

    /**
     * Contructor to receive 2 input of text,assume that there is no image resource
     *
     * @param miwok
     * @param english
     */
    public Word(String miwok, String english, int imageId) {
        this.mTextEng = english == null ? "" : english;
        this.mTextMiwok = miwok == null ? "" : miwok;
        this.mImageResourceId = imageId > 0 ? imageId : Word.NO_IMAGE_RESOURCE;
    }

    public void setTextMiwok(String s) {
        this.mTextMiwok = s;
    }

    public String getTextMiwok() {
        return this.mTextMiwok == null ? "" : this.mTextMiwok;
    }

    public void setTextEng(String s) {
        this.mTextEng = s;
    }

    public String getTextEng() {
        return this.mTextEng == null ? "" : this.mTextEng;
    }

    /**
     * Return these is no image resource for this word object
     * p.s. no image resource setter so far beside the contructor
     * @return
     */
    public boolean hasImageResource() {
        return this.mImageResourceId != Word.NO_IMAGE_RESOURCE;
    }

    public int getImageResourceId() {
        return this.mImageResourceId;
    }
}
