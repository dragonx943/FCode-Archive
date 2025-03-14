/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dra
 */
public class Lop {
    public static void main(String[] args) {
        // int a[] = {0,3,5,2,1,2}; // mảng các giá trị nguyên thuỷ nguyên
        Integer a[] = {0,3,5,2,1,2}; // mảng các đối tượng số nguyên
        double b=10; // nguyên thuỷ
        Double c=10.0; // đối tượng + lớp
        System.out.println("Nguyen thuy b=" +b);
        System.out.println("Gia tri lop c=" +c);
        // Không có 1 thuộc tính, phương thức
        System.out.println("c.equals(b) = " +c.equals(b));
        System.out.println("Mang a: ");
        // Trong c dùng vòng for
        System.out.println(Arrays.toString(a));
        System.out.println("Mang a sau sap xep: ");
        // Trong c sap xep: 2 vòng lặp
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        List<Integer> ds = new ArrayList();
        ds = Arrays.asList(a); // chuyển mảng a thành List
        Collections.reverse(ds);
        System.out.print("Mang a sau dao nguoc: ");
        // foreach
        for(Integer x: ds) {
            System.out.print(x + " ");
        }
        // duyet toan bo ds tu dau den cuoi: 0-(ds.size-1)
        // moi khi den 1 phan tu thi lay ra doi tuong x
        System.out.println("");
    }
}
