package com.juaracoding;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        //cara 1
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(angka[3]);

        //cara 2
        int[] grades = new int[5];
        grades[0] = 80;
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        System.out.println(grades[3]);
        System.out.println(grades.length);

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        String[] cars = {"BMW", "Mercedes", "Ferrari", "Mclaren", "Audi"};
        for (String car : cars) {
            System.out.println(car.toUpperCase());
        }

        // array multidimensi
        int[][] angkaKu = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println(angkaKu[1][2]);

        System.out.println("Jumlah Baris = " + angkaKu.length);
        System.out.println("Jumlah Kolom baris ke-1 = " + angkaKu[0].length);
        System.out.println("Jumlah Kolom baris ke-2 = " + angkaKu[1].length);

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.println(angkaKu[i][j]);
            }
        }
        // mencari kota
        Scanner scanner = new Scanner(System.in);
        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Bali", "Makassar"};
        System.out.println("Masukkan nama kota (Jakarta, Bandung, Surabaya, Bali, Makassar): ");
        String inputCity = scanner.nextLine();
        boolean cityFound = false;// Cek input sesuai dengan salah satu kota dalam array
        for (String city : cities) {
            if (city.equalsIgnoreCase(inputCity)) {
                cityFound = true;
                break;
            }
        }
        // Menampilkan hasil
        if (cityFound) {
            System.out.println("Anda memilih kota: " + inputCity);
        } else {
            System.out.println("Kota tidak ditemukan. Silakan coba lagi.");
        }
        scanner.close();

        // menjumlahkan harga dalam array
        double[] prices = {20000, 30000, 40000, 50000, 60000, 70000, 80000};
        double total = 0;

        // Menampilkan daftar harga
        System.out.println("Daftar Harga:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Harga " + (i + 1) + ": " + prices[i]);
            total += prices[i];  // Menghitung total harga
        }
        // Menampilkan total harga
        System.out.println("Total Harga: " + total);
    }
}




