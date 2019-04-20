public class HienThi {
    public static void main(String[] args) {

        //bai 1
        Bai1 bai1 = new Bai1();
        System.out.println("chay bai 1:");
        bai1.nhap(10);
        bai1.tinhTong();


        //bai 2
        Bai2 bai2 = new Bai2();
        System.out.println("chay bai 2:");
        bai2.nhap(10);
        bai2.tinhTongBinhPhuong();


        //bai 3
        Bai3 bai3 = new Bai3();
        System.out.println("chay bai 3:");
        bai3.nhap(10);
        bai3.tinhTong();

        // Bai 17
        Bai17 bai17 = new Bai17();
        bai17.nhap(24);
        System.out.println("Chai bai 17:");
        bai17.tinh();
        //bai 21
        Bai21 bai21 = new Bai21();
        System.out.println("Chai bai 21:");
        bai21.nhap(10, 15);
        bai21.timKiem();
        // bai 22
        Bai22 bai22 = new Bai22();
        System.out.println("Chai bai 22:");
        bai22.nhap(11, 12);
        bai22.timKiem();
    }
}
