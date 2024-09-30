package com.juaracoding;
import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {

        if (false) {
            System.out.println("statement");
        }
        System.out.println("next statement");

        int suhu = 36;
        if (suhu > 36) {
            System.out.println("Cuaca Sangat Panas");
        } else {
            System.out.println("Cuaca Normal");
        }

        int angka = 4;
        if (angka % 2 == 0) {
            System.out.println(angka + " Angka genap");
        } else {
            System.out.println(angka + " Angka ganjil");
        }

        // if majemuk
        //size s = 50000, M = 60000, L = 70000
        String size = "M";
        int qty = 10;
        int price = 0;

        if (size.equalsIgnoreCase("S")) {
            price = 50000;
        } else if (size.equalsIgnoreCase("M")) {
            price = 60000;
        } else if (size.equalsIgnoreCase("l")) {
            price = 70000;
        } else {
            System.out.println("Invalid size. Please enter S, M, or L.");
            return;
        }
        // menghitung total harga
        int totalPrice = price * qty;
        System.out.println("Size: " + size.toUpperCase() + " Total Harga Rp" + totalPrice);

        // Username dan password yang benar
        String Username = "admin";
        String Password = "password123";

        // Pengkondisian untuk mengecek apakah username dan password sesuai
        if (Username.equalsIgnoreCase("admin") && Password.equals("password123")) {
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal!");
        }

        int platNomor = 1234;
        int tanggal = 1;

        if ((platNomor % 2 == 0 && tanggal % 2 == 0) || (platNomor % 2 == 1 && tanggal % 2 == 1)) {
            // true OR false
            System.out.println("bisa melewati jalan Soekarno Hatta");
        } else if (platNomor % 2 == 1 && tanggal % 2 == 0) {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor ganjil tanggal genap");
        } else {
            System.out.println("tidak bisa melewati jalan Soekarno Hatta, karena plat nomor genap tanggal ganjil");
        }

            }
        }


