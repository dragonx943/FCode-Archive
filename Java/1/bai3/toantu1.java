package bai3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class toantu1 {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        int s=(++a)+(b++)+(--c)-(--b)+(a++);
        System.out.println("S=" + s + " a=" + a + " b=" + b + " c=" + c);
    }
}
