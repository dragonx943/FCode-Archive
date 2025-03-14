/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Dra
 */
public class Main_NhanVien {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        System.out.println("Nhan vien 1: " + nv1.toString());
        
        NhanVien nv2 = new NhanVien("PH61418", "Nguyen Xuan Bac");
        System.out.println("Nhan vien 2: " + nv2.toString());
        
        NhanVien nv3 = new NhanVien("PH61418", "Draken", 16.0);
        System.out.println("Nhan vien 3: " + nv3.toString());
    }
}