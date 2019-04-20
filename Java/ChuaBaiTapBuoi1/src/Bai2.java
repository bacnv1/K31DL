public class Bai2 {
    int soN;
    void nhap(int giaTriN){
        soN = giaTriN;
    }

    void tinhTongBinhPhuong(){
        if(soN <5 ){
            System.out.println("qua nho");
            return;
        }
        if(soN >20){
            System.out.println("so qua lon");
            return;
        }
        int tong =0;
        for (int i = 1; i <=soN ; i++) {
            tong+=Math.pow(soN,2);
        }
        System.out.println("tong="+tong);
    }
}
