public class Bai21 {
    int n;
    int m;

    void nhap(int giaTriN, int giaTriM) {
        n = giaTriN;
        m = giaTriM;
    }

    void timKiem() {
        int min = Math.min(n, m);
        for (int i = min; i >= 0; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("Uoc chung lon nhat " + i);
                return;
            }
        }
    }
}
