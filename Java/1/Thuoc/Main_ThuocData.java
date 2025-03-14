/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thuoc;

import java.util.Scanner;


/**
 *
 * @author Dra
 */
public class Main_ThuocData {
    public static void main(String[] args) {
        String a;
        Double b;
        
        ThuocData thuoc3 = new ThuocData();
        System.out.println("Thong tin thuoc 3: " + thuoc3.toString());
        
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten thuoc: ");
        a = nhap.nextLine();
        System.out.println("Nhap gia tien: ");
        b = nhap.nextDouble();
        ThuocData thuoc2 = new ThuocData(a, 15.0);
        System.out.println("Thong tin thuoc 2: " + thuoc2.toString());
        
        ThuocData thuoc1 = new ThuocData("Paradol", 50.0, "VN", "VN", "VN");
        System.out.println("Thong tin thuoc 1: " + thuoc1.toString());
        
        
    }
}
