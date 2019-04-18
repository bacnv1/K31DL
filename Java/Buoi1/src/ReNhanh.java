public class ReNhanh {


    void hanhDong(int thu){
        if (thu == 2){
            System.out.println("Hom nay di hoc");
        }else if (thu == 3){
            System.out.println("Hom nay di boi");
        }else if (thu == 4){
            System.out.println("Hom nay di da bong");
        }else if (thu == 5){
            System.out.println("Hom nay o nha");
        }else if (thu == 6){
            System.out.println("Hom nay hoc bai");
        }else if (thu == 7){
            System.out.println("Hom nay nghi hoc");
        }else if (thu == 8){
            System.out.println("Hom nay ve que");
        }else{
            System.out.println("Khong phai la thu");
        }
    }

    void hanhDongSwitchCase(int thu){
        switch (thu){
            case 2:
                System.out.println("Hom nay di hoc");
                break;
            case 3:
                System.out.println("Hom nay di boi");
                break;
            case 4:
                System.out.println("Hom nay di da bong");
                break;
            case 5:
                System.out.println("Hom nay o nha");
                break;
            case 6:
                System.out.println("Hom nay hoc bai");
                break;
            case 7:
                System.out.println("Hom nay nghi hoc");
                break;
            case 8:
                System.out.println("Hom nay ve que");
                break;
            default:
                System.out.println("Khong phai la thu");
                break;
        }
    }

}
