package com.juaracoding;

import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.println("Input angka berapapun (masukkan 0 untuk keluar):");


        while (true) {
            angka = scanner.nextInt();

            if (angka == 0) {
                System.out.println("Program selesai.");
                break; // Exit the loop
            }


            System.out.println("Anda memasukkan: " + angka);
        }

        scanner.close();
    }
}

