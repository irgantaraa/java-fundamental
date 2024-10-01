package com.juaracoding;

public class Perulangan {
    public static void main(String[] args) {

        //for
        for (int i = 1; i <= 10; i++) {
            // Cek apakah angka ganjil
            if (i % 2 != 0) {
                System.out.print(i + " ");
                i++;
            }
        }
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int tinggi = 5;
        for (int i = tinggi; i >= 1; i--) { // 5-1 mengontrol jumlah baris segitiga dari tinggi ke 1.
            for (int j = 1; j <= i; j++) { // mencetak bintang pada setiap baris. Jumlah bintang yang dicetak menurun seiring bertambahnya baris.
                System.out.print("*"); //mencetak bintang tanpa berpindah ke baris baru.
            }
            System.out.println();
        }
        int segitiga = 5;
        for (int i = 1; i <= segitiga; i++) { //1+1 mengontrol jumlah baris segitiga.
            for (int j = 1; j <= i; j++) { //mencetak bintang pada setiap baris. Jumlah bintang yang dicetak meningkat seiring bertambahnya baris
                System.out.print("*"); //mencetak bintang tanpa berpindah ke baris baru.
            }
            System.out.println();
        }

    }
}