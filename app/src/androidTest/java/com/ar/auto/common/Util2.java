package com.ar.auto.common;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Util2 {
    public static boolean sameAs (String path1, String path2) throws FileNotFoundException {
        boolean res = false;
        FileInputStream fis1 = new FileInputStream(path1);
        Bitmap bitmap1  = BitmapFactory.decodeStream(fis1);

        FileInputStream fis2 = new FileInputStream(path2);
        Bitmap bitmap2  = BitmapFactory.decodeStream(fis2);

        res = sameAs(bitmap1,bitmap2);

        return res;

    }

    public static boolean sameAs (String path1, String path2,double percent) throws FileNotFoundException {
        FileInputStream fis1 = new FileInputStream(path1);
        Bitmap bitmap1  = BitmapFactory.decodeStream(fis1);

        FileInputStream fis2 = new FileInputStream(path2);
        Bitmap bitmap2  = BitmapFactory.decodeStream(fis2);

        return sameAs(bitmap1,bitmap2,percent);

    }

    public static boolean sameAs2(String path1, Bitmap bitmap2, double percent) throws FileNotFoundException {
        FileInputStream fis1 = new FileInputStream(path1);
        Bitmap bitmap1  = BitmapFactory.decodeStream(fis1);

        return sameAs(bitmap1, bitmap2, percent);
    }

    public static boolean sameAs (Bitmap bitmap1, Bitmap bitmap2, double percent) {
        if(bitmap1.getHeight() != bitmap2.getHeight())
            return false;

        if(bitmap1.getWidth() != bitmap2.getWidth())
            return false;

        if(bitmap1.getConfig() != bitmap2.getConfig())
            return false;

        int width = bitmap1.getWidth();
        int height = bitmap2.getHeight();
        int numDiffPixels = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (bitmap1.getPixel(x, y) != bitmap2.getPixel(x, y)) {
                    numDiffPixels++;
                }
            }
        }
        double numberPixels = height * width;//总像素值
        double diffPercent = numDiffPixels / numberPixels;//不相等的百分比
        return percent <= 1.0D - diffPercent;//返回相似度
    }

    public static boolean sameAs (Bitmap bmp1, Bitmap bmp2) throws FileNotFoundException {
        boolean res = false;
        return bmp1.sameAs(bmp2);
    }

    public static Bitmap getSubImage(String path,int x,int y,int width,int height) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        Bitmap bitmap  = BitmapFactory.decodeStream(fis);
        return Bitmap.createBitmap(bitmap, x, y, width, height);
    }

    public static void saveBitMapFile(Bitmap bitmap, String fileName) {
        String filePath = Environment.getExternalStorageDirectory().getPath() + fileName + ".PNG";
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream out = null;
        try {
            out=new FileOutputStream(filePath);
            if (out != null) {
                //三个参数分别为格式、保存的文件质量、文件流
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
                out.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
