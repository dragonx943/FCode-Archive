/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class SanPham {
    
    private String tenSP;
    private Double giaSP;
    private String hangSP;
    
    public SanPham() {
        // Nothing here
    }

    public SanPham(String tenSP, Double giaSP, String hangSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.hangSP = hangSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(Double giaSP) {
        this.giaSP = giaSP;
    }

    public String getHangSP() {
        return hangSP;
    }

    public void setHangSP(String hangSP) {
        this.hangSP = hangSP;
    }

    @Override
    public String toString() {
        return "Thong tin sp: {" + "tenSP=" + tenSP + ", giaSP=" + giaSP + ", hangSP=" + hangSP + '}';
    }
    
    void xuat() {
        System.out.println("Thong tin sp: Ten SP= " + this.tenSP + ", gia SP= " + this.giaSP + ", hang SP= " + this.hangSP);
    }
    
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap ten sp: ");
        this.tenSP = scan.nextLine();
        System.out.print("Moi nhap gia sp: ");
        this.giaSP = scan.nextDouble();
        scan.nextLine();
        System.out.print("Moi nhap hang sp: ");
        this.hangSP = scan.nextLine();
    }
}


