/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class MainSinhVien {
    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        int chon;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("--------- Menu QLSV ---------");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Sap xep danh sach");
            System.out.println("4. Tim kiem sinh vien");
            System.out.println("0. Thoát");
            chon = scan.nextInt();
            scan.nextLine();
            switch (chon) {
                case 1:
                    qlsv.them();
                    break;
                case 2:
                    qlsv.xuatDS();
                    break;
                case 3:
                    qlsv.sapXep();
                    break;
                case 4:
                    int ns;
                    System.out.println("Moi nhap nam sinh can tim: ");
                    ns = scan.nextInt();
                    qlsv.timKiem(ns);
                case 0:
                    break;
                default:
                    System.out.println("Sai so, vui long chon lai!");
            } // Đóng switch
            if (chon == 0) {
                break;
            }
        } // Đóng của while
    }
}
