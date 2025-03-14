/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class VongLap2 {
    public static void main(String[] args) {
        // Nhap so nguyen n
        // Tinh tong cac so chia het cho 3 tu 1 -> n
        // vd: n=15;
        // Tong=3+6+9+12+15
        
        int n, i;
        int tong = 0;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhap so n: ");
        n = nhap.nextInt();
        
        for (i=3; i<=n; i++) {
            if (i % 3 == 0) {
                tong += i;
            }
        }
        System.out.println("Tong la: " +tong);
    }
}