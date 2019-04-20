public class Bai1 {
    int soN;

    void nhap(int giaTriN){
        soN = giaTriN;
    }

    void tinhTong(){
        if(soN<=3){
            System.out.println("so qua nho");
            return;
        }else if(soN>=50){
            System.out.println("so qua lon");
            return;
        }
        int tong = 0;
        for (int i = 1; i <= soN; i++) {
            tong+=i;
        }
        System.out.println("tong ="+tong);
    }
}
