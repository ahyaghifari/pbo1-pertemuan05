package com.ahyaghifari.pisang;
public class Pisang {
    String nama;
    float harga;
    String warnaMatang;
    String deskripsi;
    
    void tampilkanPisang(){
        System.out.println("===============");
        System.out.println("Nama Pisang : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Warna Matang : " + warnaMatang);
        deskripsiPisang();
        System.out.println("===============");
    }
    
    void caraMakanPisang(){
        System.out.println("1. Ambil Pisang");
        System.out.println("2. Kupas Pisang");
        System.out.println("3. Tinggal AMMMMM");
    }
    
    void deskripsiPisang(){
        System.out.println("Deskripsi : " + deskripsi);
    }
    
}
