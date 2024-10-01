package com.juaracoding;

public class while1 {
    public static void main(String[] args) {
        // while loop
        int x = 0;
        while (x < 5) {
            System.out.print(x);
            x++;
        }
        System.out.println();
        System.out.println("Next statement");

        // do while loop
        int y = 0; // Move the declaration of y outside the comment
        System.out.println("Y");
        do {
            System.out.print(y);
            y++;
        } while (y < 5); // Change condition to allow some iteration


    }
}
