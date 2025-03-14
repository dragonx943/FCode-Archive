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
public class VongLap6 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int i;
        int iMax = 0;
        int sMin = 0;
        // Nhap 2 so nguyen a,b dam bao a>1, b>1
        // Tim uoc so chung lon nhat, boi so chung nho nhat cua a va b
        int a,b;
        int s;
        int min;
        
        System.out.print("Nhap so a: ");
        a = nhap.nextInt();
                
        System.out.print("Nhap so b: ");
        b = nhap.nextInt();
            
        min = a<b?a:b;
        for (i=1; i<=min; i++) {
            if (a%i == 0 && b%i == 0) {
                iMax = i;
            }
        }
        System.out.println("Uoc chung lon nhat la: " +iMax);
        
        for (i=a*b; i>=1; i--) {
            if (i%a == 0 && i%b == 0) {
                sMin = i;
            }
        }
        System.out.println("Boi chung nho nhat la: " + sMin);
    }
}
