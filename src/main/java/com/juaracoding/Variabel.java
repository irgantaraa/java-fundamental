package com.juaracoding;


public class Variable {

    public static void main(String[] args) {
        //numeric
        byte countCart = 100;
        short stock = 10000;
        int price = 1000000;
        long saldo= 3000000000L;
        float grade = 95.5f;
        double salary = 10000000.95;
        // char
        char akreditasi = 'A';

        //boolean
        boolean isResult = true;

        // C:\MyTools\apache-maven-3.9.6
        String path = "C:\\MyTools\\apache-maven-3.9.6";
        System.out.println(path);

        // buatkan tampilan ke console user profile gunakan variabel dan tipe data yang tepat
        String name = "Irga";                     // Nama
        int age = 25;                             // Usia
        char golonganDarah = 'B';                 // Golongan Darah
        String address = "Bekasi";                // Alamat
        String email = "irgantaraa@gmail.com";    // Email
        long phoneNumber = 81291801655L;          // Nomor telepon
        float ipk = 3.37f;                        // IPK
        boolean hasJob = false;                   // status pekerjaan

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GolonganDarah: " + golonganDarah);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("IPK: " + ipk);
        System.out.println("hasJob: " + hasJob);

        //automatic casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        // Automatic casting char to long
        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong); // Outputs: 90 (ASCII/Unicode value of 'Z')

        //manual casting
        long data = 9223372036854775000l;
        int dataInt = (int) data;
        System.out.println(dataInt);

    }
}
