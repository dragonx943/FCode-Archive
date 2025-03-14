/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class QuanLyNokia {
    ArrayList<SanPham> listDS = new ArrayList();
    Scanner scan = new Scanner(System.in);
    SanPham info = new SanPham();
    
    void them() {
        SanPham newNokia = new SanPham();
        newNokia.nhap();
        listDS.add(newNokia);
    }
    
    void timKiem(String hang) {
        int check = 0;
        for (SanPham x : listDS) {
            if (x.getHangSP().equalsIgnoreCase(hang)) {
                x.xuat();
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay san pham thuoc hang: " + hang);
        }
    }
}
