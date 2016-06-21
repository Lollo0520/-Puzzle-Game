package com.nanosic.puzzlegame;

import android.graphics.Bitmap;

/**
 * Created by Administrator on 2016/6/21.
 */
public class imagePiece {
    private int index;
    private Bitmap bitmap;

    public imagePiece() {
    }

    public imagePiece(Bitmap bitmap, int index) {
        this.bitmap = bitmap;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
