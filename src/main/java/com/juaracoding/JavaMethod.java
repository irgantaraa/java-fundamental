package com.juaracoding;

public class JavaMethod {
    public static void main(String[] args) {
        drawKotak(5);
        drawKotak(10);

        // Memanggil method luasKotak
        double sisi = 10;
        double luas = luasKotak(sisi);
        System.out.println(luas);
        System.out.println(luasKotak(12));

        System.out.println(setName("JuaraCoding"));
        System.out.println(setText("Indonesia"));

        // Menguji method login
        System.out.println(login("username", "password")); // mengembalikan false
        System.out.println(login("admin", "password123")); // mengembalikan true

        // Call calculateTax directly since it's now a static method of JavaMethod
        calculateTax(7000, 'L');  // Male, 10% tax
        calculateTax(7000, 'P');  // Female, 5% tax
        calculateTax(6000, 'P');  // Female, no tax


        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Kalimantan", "Bati", "Makassar"};
        cariKataTerpanjang(cities);
    }

    // Method drawKotak berada di luar main method
    public static void drawKotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println(); // menambahkan baris baru setelah setiap baris
        }
    }

    // Method untuk menghitung luas kotak
    static double luasKotak(double sisi) {
        return sisi * sisi;
    }

    static String setName(String name) {
        return name;
    }

    static boolean setText(String text) {
        return text.equals("Code");
    }

    // Method login baru yang mengembalikan boolean
    static boolean login(String username, String password) {
        // Kredensial default yang di-hardcode untuk keperluan demonstrasi
        String defaultUsername = "admin";
        String defaultPassword = "password123";

        return username.equals(defaultUsername) && password.equals(defaultPassword);
    }

    // Move calculateTax method here
    static void calculateTax(double salary, char gender) {
        if (salary >= 7000) {
            if (gender == 'P') {  // 'P' for female
                System.out.println("Pajak Untuk Gaji " + salary + " dan kelamin " + gender + ": " + (salary * 0.05));  // 5% tax for females
            } else {
                System.out.println("Pajak Untuk Gaji " + salary + " dan kelamin " + gender + ": " + (salary * 0.1));  // 10% tax for males
            }
        } else {
            System.out.println("Pajak Untuk Gaji " + salary + " dan kelamin " + gender + ": " + (salary * 0.0));  // No tax for salary less than 7000
        }
    }

    static void cariKataTerpanjang(String[] cities) {
        int kataTerpanjang = 0;
        int index = 0;

        for (int i = 0; i < cities.length; i++) {
            if (kataTerpanjang < cities[i].length()) {
                kataTerpanjang = cities[i].length();
                index = i;
            }
        }
        System.out.println("Kata terpanjang berada pada index ke-" + index + ": " + cities[index]);
    }
}
