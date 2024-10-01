package com.juaracoding;
import java.util.Scanner;

public class challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.println("Input angka berapapun (masukkan 0 untuk keluar):");

        // While loop to continuously accept input until 0 is entered
        while (true) {
            angka = scanner.nextInt(); // Read user input

            if (angka == 0) { // Check if the input is 0
                System.out.println("Program selesai.");
                break; // Exit the loop
            }

            // You can process the number here if needed
            System.out.println("Anda memasukkan: " + angka);
        }

        scanner.close(); // Close the scanner
    }
}

