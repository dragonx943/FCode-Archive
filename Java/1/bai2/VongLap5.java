/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class VongLap5 {

    public static void main(String[] args) {
        int i;
        int n;
        float tong = 0;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Moi nhap so n: ");
        n = nhap.nextInt();
        while (n < 5 || n > 20) { // 5<=n<=20
            System.out.println("Moi nhap lai so n: ");
            n = nhap.nextInt();
        }

        for (i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }
        System.out.println(tong);
    }
}
