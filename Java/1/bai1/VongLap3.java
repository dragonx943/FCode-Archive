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
public class VongLap3 {
    public static void main(String[] args) {
        // Nhap 4 so nguyen a,b,c,d
        // Tim min, max
        Scanner nhap = new Scanner(System.in);
        int a,b,c,d;
        int i;
        int min=0;
        int max;
        
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        System.out.println("Nhap so c: ");
        c = nhap.nextInt();
        System.out.println("Nhap so d: ");
        d = nhap.nextInt();
        
        // Tim ra max
        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        
        // Tim ra min
        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;    
        }
        if (d < min) {
            min = d;
        }
        System.out.println("So lon nhat la: " +max);
        System.out.println("So nho nhat la: " +min);
        
        // cach 2
        min = a<b?a:b;
        // Neu a<b = true: min=a;
        // else: min=b
        min = min<c?min:c;
        min = min<d?min:d;
    }
}