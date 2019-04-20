import java.text.DecimalFormat;

public class Bai3 {
    int soN;
    void nhap(int giaTriN){
        soN = giaTriN;
    }

    void tinhTong(){
        if(soN < 7 ){
            System.out.println("qua nho");
            return;
        }
        float tong =0;
        for (int i = 1; i <=soN ; i++) {
            tong+=1.0/i;
        }
        System.out.printf("tong="+ String.format("%.2f", tong));
    }
}
