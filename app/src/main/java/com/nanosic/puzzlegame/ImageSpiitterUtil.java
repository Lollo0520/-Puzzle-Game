package com.nanosic.puzzlegame;

import android.graphics.Bitmap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/21.
 */
public class ImageSpiitterUtil {


    /**
     *
     * @param bitmap
     * @param piece
     * @return
     */
    public static List<imagePiece> splitImage(Bitmap bitmap, int piece){
        List<imagePiece> imagePieces = new ArrayList<>();

        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        int pieceWidth = Math.min(width, height) / piece;

        for (int i = 0; i < piece; i++) {
            for(int j = 0; j < piece; j++){
                imagePiece imagePiece = new imagePiece();
                imagePiece.setIndex(j + i * piece);

                imagePiece.setBitmap(Bitmap.createBitmap(bitmap, width * j, width * i, pieceWidth, pieceWidth));

                imagePieces.add(imagePiece);
            }
        }


        return imagePieces;
    }
}
