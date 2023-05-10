package com.ahyaghifari.pisang;

public class Main {
    public static void main(String[] args) {
        
        Pisang pisangRaja = new Pisang();
        pisangRaja.nama = "Pisang Raja";
        pisangRaja.harga = 30000;
        pisangRaja.warnaMatang = "Kuning Orange";
        pisangRaja.deskripsi = "Jenis pisang yang memiliki rasa yang sangat manis dan memiliki ukuran yang sedang";
        
        Pisang pisangAmbon = new Pisang();
        pisangAmbon.nama = "Pisang Ambon";
        pisangAmbon.harga = 12000;
        pisangAmbon.warnaMatang = "Hijau";
        
        System.out.println("");
        
        pisangRaja.tampilkanPisang();
        pisangAmbon.tampilkanPisang();
        
    }
}
