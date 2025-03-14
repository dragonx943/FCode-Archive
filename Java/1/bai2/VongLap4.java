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
public class VongLap4 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        // Cách 1: do...while
//        do {
//            System.out.println("Moi nhap so n: ");
//            n = nhap.nextInt();
//            
//        } while(n<=5); // mong muon n>5
        
        // Cách 2: while
        System.out.println("Moi nhap so n: ");
        n = nhap.nextInt();
        while(n<=5) { // mong muon n>5
            System.out.println("Moi nhap lai so n: ");
            n = nhap.nextInt();
        }
    }
}
