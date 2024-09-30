import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        // Status pengguna
        boolean isMember = true; // Apakah pengguna adalah member
        boolean isFirstTimeBuyer = false; // Apakah pengguna adalah pembeli pertama
        boolean hasCoupon = false; // Apakah pengguna memiliki kupon

        double discount = 0.0; // Persentase diskon
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan total bayar = ");
        double totalAmount = scanner.nextDouble(); // Input total yang harus dibayar

        // Menghitung diskon
        if (totalAmount > 500000) {
            if (isMember) {
                discount = 0.1; // 10% diskon untuk member
            } else if (isFirstTimeBuyer) {
                discount = 0.05; // 5% diskon untuk pembeli pertama
            } else if (hasCoupon) {
                discount = 0.02; // 2% diskon untuk pemegang kupon
            }
        }

        // Menampilkan hasil
        System.out.println("Diskon = " + (discount * 100) + "%");
        System.out.println("Total bayar Rp. " + (totalAmount - totalAmount * discount));

        scanner.close(); // Menutup scanner
    }
}
