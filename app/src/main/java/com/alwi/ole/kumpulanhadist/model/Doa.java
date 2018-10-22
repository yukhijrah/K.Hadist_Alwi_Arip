package com.alwi.ole.kumpulanhadist.model;

/**
 * Created by ole on 10/8/18.
 */

public class Doa {

    private int img;
    private String judul;
    private String ayat;
    private String arti;

    public Doa(int img, String judul, String ayat, String arti) {
        this.img = img ;
        this.judul = judul;
        this.ayat = ayat;
        this.arti = arti;
    }

    public int getImg() {
        return img;
    }

    public String getNama() {
        return judul;
    }

    public String getSurah() {
        return ayat;
    }

    public String getArti() {
        return arti;
    }
}

