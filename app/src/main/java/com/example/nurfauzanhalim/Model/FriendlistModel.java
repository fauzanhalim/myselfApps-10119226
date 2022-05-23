package com.example.nurfauzanhalim.Model;

/*
    Dikerjakan pada tanggal : 6 mei 2022
    Dibuat oleh : Nur Fauzan Halim
    NIM   : 10119226
    Nama  : Nur Fauzan Halim
    Kelas : IF-6
*/

public class FriendlistModel {

    int image;
    String nama;

    public FriendlistModel(int image, String nama) {
        this.image = image;
        this.nama = nama;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
