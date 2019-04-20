public class Bai20 {
    int soN;

    void nhap(int giaTriN){
        soN = giaTriN;
    }

    void kiemTra(){
        double can = Math.sqrt(soN);
        if (can % 1 == 0){
            System.out.println("So chinh phuong");
        }else{
            System.out.println("k phai so chinh phuong");
        }
    }
}
