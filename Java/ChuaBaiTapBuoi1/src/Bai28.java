public class Bai28 {
    int h;

    void nhap(int giaTriChieuCao){
        h = giaTriChieuCao;
    }

    void ve(){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0  || j == i || i == h-1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
