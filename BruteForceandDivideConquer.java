import java.util.Scanner;

public class BruteForceandDivideConquer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Program Menghitung Akar Bilangan");
        System.out.println("===========================================");
        System.out.print("Masukkan bilangan yang ingin dihitung akarnya : ");
        double bilangan = sc.nextDouble();

        System.out.println("===========================================");
        System.out.println("Menu:");
        System.out.println("1. Menghitung Akar dengan Brute Force");
        System.out.println("2. Menghitung Akar dengan Divide and Conquer");
        System.out.print("Pilih metode yang ingin digunakan (1/2) : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                double akarBF = akarBruteForce(bilangan);
                System.out.println("Akar dari " + bilangan + " (Brute Force) adalah : " + akarBF);
                break;
            case 2:
                double akarDC = akarDivideConquer(bilangan);
                System.out.println("Akar dari " + bilangan + " (Divide and Conquer) adalah : " + akarDC);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("===========================================");
        sc.close();
    }

    // Menghitung akar dengan algoritma Brute Force
    public static double akarBruteForce(double bilangan) {
        if (bilangan < 0) {
            return -1; // Mengembalikan -1 untuk bilangan negatif
        }

        double akar = 0;
        while (akar * akar <= bilangan) {
            akar++;
        }
        return Math.floor(akar - 1); // Bulatkan ke bawah
    }

    // Menghitung akar dengan algoritma Divide and Conquer
    public static double akarDivideConquer(double bilangan) {
        if (bilangan < 0) {
            return -1; // Mengembalikan -1 untuk bilangan negatif
        }

        double awal = 0;
        double akhir = bilangan;
        double epsilon = 0.00001; // Tingkat presisi

        while (akhir - awal > epsilon) {
            double tengah = (awal + akhir) / 2;
            double kuadratTengah = tengah * tengah;

            if (kuadratTengah > bilangan) {
                akhir = tengah;
            } else {
                awal = tengah;
            }
        }
        return Math.floor(awal); // Bulatkan ke bawah
    }
}
