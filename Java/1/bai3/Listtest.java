/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Boolean;

/**
 *
 * @author Dra
 */
public class Listtest {
    public static void main(String[] args) {
        String ten[] = {"trang", "ha", "Huong", "Quang", "Loc"};
        String debugT = "trang";
        Boolean kt = true;
        // mảng chứa các ký tự
        // chuyển mảng sang List
        List<String> ds = new ArrayList();
        List<String> dsTen = new ArrayList();
        dsTen = Arrays.asList(ten);
        // dùng foreach kiểm tra xem có đứa tên là trang không
        for(String x: dsTen) {
            if (x.equals("trang")) {
                System.out.println("Co!");
                kt = false;
                break;
            }
        }
        if (kt==true) {
            System.out.println("Khong co dua nao ten la trang!");
        }
    }
}
