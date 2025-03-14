/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class Lab2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        // Bai 1
        int selection;
        int n, i;
        int tong = 0;
        
        // Bai 2
        int soSV = 0;
        int trungBinh = 0;
        int min;
        int max;
        int count = 0;
        int bienAo;
        
        System.out.println("========= Menu ========");
        System.out.println("1. Kiem tra so hoan hao");
        System.out.println("2. Nhap mang can nang cac thanh vien trong lop");
        System.out.println("3. Thoat chuong trinh");
        System.out.println("=======================");
        System.out.printf("Moi chon: ");
        
        selection = nhap.nextInt();
        
        switch (selection) {
            case 1:
                do {
                    System.out.printf("Moi nhap so n: ");
                    n = nhap.nextInt();
                    if (n <= 0) {
                        System.out.println("n phai lon hon so 0, vui long nhap lai!");
                    }
                } while (n <= 0);
                
                for (i=1; i<=n-1; i++) {
                    if (n%i==0) {
                        tong += i;
                    }
                }
                if (tong == n) {
                    System.out.println(n + " la so hoan hao!");
                } else {
                    System.out.println(n + " khong phai la so hoan hao!");
                }
                break;
            case 2:
                do {
                    System.out.printf("Nhap so luong sinh vien: ");
                    soSV = nhap.nextInt();
                    if (soSV < 20 || soSV > 40) {
                        System.out.println("So luong sinh vien khong dat yeu cau, vui long nhap lai!");
                    }
                } while (soSV < 20 || soSV > 40);
                
                int[] canNang = new int[soSV];
                System.out.println("Nhap can nang cua tung sinh vien:");
                
                for (i=0; i < soSV; i++) {
                    System.out.printf("Can nang cua sinh vien " + (i +1) + ": ");
                    canNang[i] = nhap.nextInt();
                }
                
                for (i=0; i < soSV; i++) {
                    tong += canNang[i];
                }
                trungBinh = tong / soSV;
                System.out.println("Can nang trung binh la: " + trungBinh);
                
                max = canNang[0];
                min = canNang[0];
                
                for (i=1; i < soSV; i++) {                
                    if (canNang[i] > max) {
                        max = canNang[i];
                    }
                }
                
                for (i=1; i < soSV; i++) {                
                    if (canNang[i] < min) {
                        min = canNang[i];
                    }
                }
                
                System.out.println("Can nang lon nhat la: " + max);
                System.out.println("Can nang nho nhat la: " + min);
                
                for (i=1; i < soSV; i++) {
                    if (canNang[i] > 50) {
                        count++;
                    }
                }
                
                System.out.println("So can nang > 50: " + count);
                
                // Need Debugging
                for (i=0; i < soSV - 1; i++) {
                    for (int j = 0; j < soSV - i - 1; j++) {
                        if (canNang[j] < canNang[j+1]) {
                            bienAo = canNang[j];
                            canNang[j] = canNang[j + 1];
                            canNang[j + 1] = bienAo;
                        }
                    }
                }
                
                System.out.printf("---> Can nang duoc sap xep tu lon den be: ");
                
                for (i=0; i < soSV; i++) {
                    System.out.printf(canNang[i] + " ");
                }
                System.out.println("");
                break; // End
            case 3:
                System.out.println("Dang thoat chuong trinh...");
                break;
            default:
                System.out.println("Lua chon sai, thoat chuong trinh");
                break;
        }
    }
}
