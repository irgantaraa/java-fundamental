package com.juaracoding;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih menu (1-5): ");
        int chooseMenu = scanner.nextInt(); // Memanggil metode nextInt() untuk membaca input integer
        switch (chooseMenu) {
            case 1:
                System.out.println("Menu Ke-1");
                break;

            case 2:
                System.out.println("Menu Ke-2");
                break;

            case 3:
                System.out.println("Menu Ke-3");
                break;

            case 4:
                System.out.println("Menu Ke-4");
                break;

            case 5:
                System.out.println("Menu Ke-5");
                break;

            default:
                System.out.println("Tidak Ada Daftar Menu");
                break;

            // Bagian Ternary Operator
            //System.out.println("Masukan nilai: ");
            //int nilai = scanner.nextInt();
            //String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
            //System.out.println(keterangan);
        }
    }
}
