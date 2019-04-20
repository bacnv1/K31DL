public class Bai22 {
    int soN;
    int soM;

    void nhap(int giaTriN, int giaTriM){
        soM = giaTriM;
        soN = giaTriN;
    }

    void timKiem(){
        int max = Math.max(soM, soN);
        for (int i = max;; i++) {
            if (i % soN == 0 && i % soM == 0){
                System.out.println("Boi chung nho nha la: "+ i);
                return;
            }
        }
    }
}
