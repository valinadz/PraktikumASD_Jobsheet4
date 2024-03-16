package minggu5;

public class Pangkat22 {
    int nilai;
    int pangkat;

    // Konstruktor untuk inisialisasi nilai dan pangkat
    public Pangkat22(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // Metode pangkatBF() dan pangkatDC() tetap sama seperti sebelumnya

    public int pangkatBF(int a, int b) {
        int hasil = 1;
        for (int i = 1; i <= b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            int temp = pangkatDC(a, b / 2);
            if (b % 2 == 0) {
                return temp * temp;
            } else {
                return a * temp * temp;
            }
        }
    }
}
