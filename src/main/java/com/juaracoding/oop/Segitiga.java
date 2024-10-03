package com.juaracoding.oop;

public class Segitiga {
        int sisi = 5;

        Segitiga(int sisi) {
           this.sisi=sisi;
       }

       void draw() {
           for (int i = 1; i <= sisi; i++) { //1+1 mengontrol jumlah baris segitiga.
               for (int j = 1; j <= i; j++) { //mencetak bintang pada setiap baris. Jumlah bintang yang dicetak meningkat seiring bertambahnya baris
                   System.out.print("*"); //mencetak bintang tanpa berpindah ke baris baru.
               }
               System.out.println();
           }
       }
}
