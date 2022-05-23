package com.example.nurfauzanhalim.Model;

/*
     Dikerjakan pada tanggal : 5 mei 2022
    Dibuat oleh : Nur Fauzan Halim
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

public class MusicModel {

    int image;
    String title;
    String penyanyi;

    public MusicModel(int image, String title, String penyanyi) {
        this.image = image;
        this.title = title;
        this.penyanyi = penyanyi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }
}
