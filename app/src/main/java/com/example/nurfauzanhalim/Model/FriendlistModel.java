package com.example.nurfauzanhalim.Model;

/*
    Dikerjakan pada tanggal : 26 Mei 2021
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
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
