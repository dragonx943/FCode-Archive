package bai6;

import java.util.Scanner;

public class DemoChuoi {
    public static void main(String[] args) {
        String hoTen;
        String ho, dem, ten;
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap ho ten cua ban: ");
        hoTen = scan.nextLine();
        // hoTen = Nguyen Thi Nhu Trang
        // hoTen = Le Ha Hung
        // hoTen = Tran Anh
        // Tách họ, đệm và tên
        hoTen.trim();
        ho = hoTen.substring(0, hoTen.indexOf(" "));
        System.out.println("Ho = " + ho);
        ten = hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length());
        System.out.println("Ten =" + ten);
        dem = hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" "));
        System.out.println("Ten diem = " + dem);
    }
}
