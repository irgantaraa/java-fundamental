package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        //aritmatik
        double result = 5.0 / 2;
        System.out.println(result);
        int modulus = 11 % 3;
        System.out.println(modulus);

        int x = 2;
        int hasil = 10 * --x;
        System.out.println(hasil);

        int total = (10+2)*5;
        System.out.println(total);

        int a = 10;
        int b = 12; a += b;
        System.out.println(a);

        // relational operators
        boolean isResult = 5 > 10;
        System.out.println(isResult);


// bitwise
        int bitwise = 10 | 12;
        // 1010 10 OR
        // 1100 = 12
        // 1110 = 14
        System.out.println(bitwise);

    }
}
