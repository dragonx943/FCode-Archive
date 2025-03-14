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
public class VongLap1 {

    public static void main(String[] args) {
        // Nhap so nguyen n
        // Tinh n!; n=4; gt=1*2*3*4
        Scanner nhap = new Scanner(System.in);
        int n, i;
        int gt = 1;
        System.out.println("Moi nhap so n: ");
        n = nhap.nextInt();
        for (i=1; i<=n; i++) {
            gt=gt*i;
        }
        System.out.println(n+"!"+" = " +gt);
    }
}
