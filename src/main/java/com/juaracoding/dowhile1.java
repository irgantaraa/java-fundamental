package com.juaracoding;

public class dowhile1 {
    public static void main(String[] args) {

        // break / continue
        int x = 0;
        while (x < 6) {
            System.out.println("Looping ke-" + x);
            x++;
            if (x == 3) break;
        }
    }
}


    // input angka berapapun, tapi ketika input angka 0 keluar looping
