/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thuoc;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class ThuocData {
    private String tenThuoc;
    private Double giaBan;
    private String hangSanXuat;
    private String nhaNhapKhau;
    private String nhaPhanPhoi;

    public ThuocData() {
        this.giaBan = 0.0;
    }

    public ThuocData(String tenThuoc, Double giaBan) {
        this.tenThuoc = tenThuoc;
        this.giaBan = giaBan;
    }

    public ThuocData(String tenThuoc, Double giaBan, String hangSanXuat, String nhaNhapKhau, String nhaPhanPhoi) {
        this.tenThuoc = tenThuoc;
        this.giaBan = giaBan;
        this.hangSanXuat = hangSanXuat;
        this.nhaNhapKhau = nhaNhapKhau;
        this.nhaPhanPhoi = nhaPhanPhoi;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        if (this.giaBan == null) {giaBan = 0.0;}
        this.giaBan = giaBan;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNhaNhapKhau() {
        return nhaNhapKhau;
    }

    public void setNhaNhapKhau(String nhaNhapKhau) {
        this.nhaNhapKhau = nhaNhapKhau;
    }

    public String getNhaPhanPhoi() {
        return nhaPhanPhoi;
    }

    public void setNhaPhanPhoi(String nhaPhanPhoi) {
        this.nhaPhanPhoi = nhaPhanPhoi;
    }
    
    double tinhThue() {
        if (this.getGiaBan() < 100) {return this.getGiaBan()*0.02;}
        else {
            if (this.getGiaBan() < 200) {
                return (this.getGiaBan()*0.02 + (this.getGiaBan()-100)*0.03);
            } else {
                if (this.getGiaBan() < 300) {
                    return (this.getGiaBan()*0.02 + (200-100)*0.03 + (this.getGiaBan()-200)*0.04);
                } else {return this.getGiaBan()*0.02 + (200-100)*0.03 + (300-200)*0.04 + (this.getGiaBan()-300)*0.05;}
            }
        }      
    }
    
    String getPhanLoai() {
        if (this.nhaNhapKhau.equalsIgnoreCase("Trong Nước")) {
            return "Hàng nội địa";
        } else if (this.nhaNhapKhau.equalsIgnoreCase("Ấn Độ")) {
            return "Hàng rẻ tiền";
        } else {
            return "Hàng đắt tiền";
        }
    }
    
    void nhap() {// Nhập thông tin của đối tượng 
        Scanner scan = new Scanner(System.in);
        System.out.println("Moi nhap ten thuoc: ");
        this.tenThuoc = scan.nextLine();
        System.out.println("Moi nhap nha nhap khau: ");
        this.nhaNhapKhau = scan.nextLine();
        System.out.println("Moi nhap nha phan phoi: ");
        this.nhaPhanPhoi = scan.nextLine();
        System.out.println("Moi nhap nha san xuat: ");
        this.hangSanXuat = scan.nextLine();
        System.out.println("Moi nhap gia ban: ");
        this.giaBan = scan.nextDouble();
    }
    
    void inThongTin() {
        System.out.println("Ten: " + this.tenThuoc + ", giaBan=" + giaBan + ", hangSanXuat=" + hangSanXuat + ", nhaNhapKhau=" + nhaNhapKhau + ", nhaPhanPhoi=" + nhaPhanPhoi + ", thue=" + tinhThue() + ", phanloai=" + getPhanLoai());
    }
    
    @Override
    public String toString() {
        return "ThuocData{" + "tenThuoc=" + tenThuoc + ", giaBan=" + giaBan + ", hangSanXuat=" + hangSanXuat + ", nhaNhapKhau=" + nhaNhapKhau + ", nhaPhanPhoi=" + nhaPhanPhoi + ", thue=" + tinhThue() + '}';
    }    
}

