/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class QuanLySinhVien { // Các chức năng trên Sinh viên
    // Toàn bộ sinh viên được quản lý bằng List
    // 1. Thêm đối tượng SV vào danh sách
    ArrayList<SinhVien> listSV = new ArrayList(); // Khai báo 1 danh sách tên là listSV có kiểu là SinhVien
    Scanner scan = new Scanner(System.in);
    
    void them() {
        while (true) {
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);
            System.out.print("Ban co muon nhap tiep khong? (y/n): ");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        } // dong white
    }
    
    void xuatDS() {
        for (SinhVien x: listSV) {
            x.inThongTin();
        }
    }
    
    void sapXep() {        
        // Com + Ctrl 2 times = Comparator
        Comparator<SinhVien> com1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getNamSinh() > o2.getNamSinh()) {
                    return -1; // o1 đứng trước o2
                } else if (o1.getNamSinh() == o2.getNamSinh()) {
                    return 0; // không thay đổi vị trí
                } else {
                    return 1; // o1 đứng sau o2
                }
            }
        }; // đóng com1
        Collections.sort(listSV, com1); // sắp xếp theo tiêu chí com1
        
        Comparator<SinhVien> com2 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSv().compareTo(o2.getMaSv());
            }
        };
        Collections.sort(listSV, com2);
    }
    
    void timKiem(int ns) { // có tham số truyền vào
        int check=0;
        for (SinhVien x: listSV) {
            if (x.getNamSinh() == ns) { // tìm đc
                x.inThongTin();
                check = 1; // đánh dấu đã tìm thấy
            } // đóng if
        } // Đóng for
        if (check == 0) {
            System.out.println("Khong tim thay thong tin!");
        }
    }
}
