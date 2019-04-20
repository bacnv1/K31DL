public class Bai17 {
    int soN;

    void nhap(int giaTriN) {
        soN = giaTriN;
    }

    void tinh() {
        int tong = 0;
        int tich = 1;

        for (int i = 1; i <= soN; i++) {
            if (soN % i == 0) {
                tong += i;
                tich *= i;
            }
        }
        System.out.println("Tong la: " + tong);
        System.out.println("Tich la: " + tich);
    }
}
