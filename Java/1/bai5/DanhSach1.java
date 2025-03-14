/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dra
 */
public class DanhSach1 {
    public static void main(String[] args) {
        // Khai báo mảng tuổi có 10 phần tử kiểu Int
        int tuoi[] = new int[10];
        // Khai báo 1 danh sách không có kiểu
        ArrayList danhSach = new ArrayList();
        tuoi[0] = 20;
//        tuoi[9] = 22.5;
        // mảng tuổi đưa ra
        System.out.println(Arrays.toString(tuoi));
        
        danhSach.add("Trang"); // Thêm "Trang" vào danh sách
        danhSach.add(30); // Thêm tuổi
        danhSach.add(5.6); // Thêm số tiền trang có
        danhSach.add(true); // Thêm giới tính
        
        System.out.println("Danh sach : ");
        System.out.println(danhSach.toString());
        System.out.println(danhSach.size()); // kích thước của List
        System.out.println(danhSach.remove(1)); // Xoá tại vị trí thứ 1, 1 khác 0
        System.out.println(danhSach.toString()); 
        danhSach.add(2, "abc");
        System.out.println(danhSach.toString()); // Thêm vào vị trí số 2, giá trị là abc
        System.out.println(danhSach.indexOf(true)); // Chỉ số của giá trị true là bao nhiêu ?
        danhSach.set(1, 100); // Thiết lập lại giá trị tại vị trí được chỉ định
        System.out.println(danhSach.toString());
    }
}
