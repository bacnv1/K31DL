public class SoNguyenTo {
    int so;
    int gioiHan;

    void nhap(int giaTriSo){
        so = giaTriSo;
    }

    void kiemTra(){
        for (int i = 2; i <= Math.sqrt(so); i++) {
            if (so % i == 0){
                System.out.println("Khong phai la so nguyen to");
                return;
            }
        }
        System.out.println("La so nguyen to");
    }

}
