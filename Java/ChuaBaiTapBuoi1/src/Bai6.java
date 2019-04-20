public class Bai6 {
    int soN;

    void nhap(int giaTriN) {
        soN = giaTriN;
    }

    void tinh() {
        if (soN <= 6) {
            System.out.println("N phai > 6");
            return;
        }
        float tong = 0;
        for (int i = 1; i <= soN; i++) {
            tong += 1.0 / (i * (i + 1));
        }
        System.out.println("Tong la: " + String.format("%.2f", tong));
    }
}
