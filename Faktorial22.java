package minggu5;

public class Faktorial22 {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        }
        else
        {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
