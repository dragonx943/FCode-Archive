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
public class Main_Nokia {
    
    public static void main(String[] args) {
        String hang = "Nokia";
        Scanner scan = new Scanner(System.in);
        QuanLyNokia add = new QuanLyNokia();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhap thong tin san pham thu " + (i + 1) + ":");
            SanPham nokia = new SanPham();
            add.them();
        }
        
        add.timKiem(hang);
    }
}
