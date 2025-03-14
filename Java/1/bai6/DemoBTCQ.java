package bai6;

import java.util.Scanner;

public class DemoBTCQ {
    public static void main(String[] args) {
        String sdt; // vì sđt có số 0 đầu tiên -> String
        String hoTen;
        int tuoi;
        Scanner scan = new Scanner(System.in);
        String rTen = "[a-zA-Z ]+";
        String rSDT = "0[0-9]{9}";
        System.out.println("Moi nhap ho ten: ");
        hoTen = scan.nextLine();
        if (hoTen.matches(rTen) == false) {
            System.out.println("Khong phai ten VN chuan!");
        } 
        
        System.out.println("Moi nhap so dien thoai: ");
        sdt = scan.nextLine();
        if (!sdt.matches(rSDT)) {
            System.out.println("Khong phai sdt VN chuan!");
        }
        
        System.out.println("Moi nhap tuoi: ");
        try { // cố gắng thực hiện == true
            tuoi = scan.nextInt();
            if (tuoi < 0) {
                System.out.println("Tuoi khong hop le!");
            }
        } catch (Exception e) { // không thực hiện được == false
            e.printStackTrace(); // dua ra loi
            System.out.println("Ban nhap tuoi khong phai so!");
        }
        
        
    }
}
