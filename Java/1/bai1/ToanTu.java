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
public class ToanTu {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a,b;
        String toanTu;
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        nhap.nextLine();
        System.out.println("Nhap toan tu: ");
        toanTu = nhap.nextLine();
        switch (toanTu) {
            case "+": System.out.println(a+"+"+b+"="+(a+b)); break;
            case "-": System.out.println(a+"-"+b+"="+(a-b)); break;
            case "*": System.out.println(a+"*"+b+"="+(a*b)); break;
            case "/": System.out.println(a+"/"+b+"="+(a/b)); break;
            case "%": System.out.println(a+"%"+b+"="+(a%b)); break;
            default: System.out.println("Toan tu khong hop le!");
        }
    }
}
