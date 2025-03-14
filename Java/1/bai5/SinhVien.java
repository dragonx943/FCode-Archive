/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Dra
 */
public class SinhVien {
    private String maSv;
    private String hoTen;
    private int namSinh;
    private Boolean gioiTinh;

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, int namSinh, Boolean gioiTinh) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public SinhVien(String maSv, String hoTen) {
        this.maSv = maSv;
        this.hoTen = hoTen;
    }
    
    String getPhanLoai() {
        if (this.namSinh <= 1997) {
            return "Vo bat di hoc!";
        } else return "Hoc thue cho bo me!";
    }
    
    void nhap() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap ma SV: ");
        this.maSv = scan.nextLine();
        System.out.print("Moi nhap ho ten: ");
        this.hoTen = scan.nextLine();
        System.out.print("Moi nhap nam sinh: ");
        this.namSinh = scan.nextInt();
        System.out.print("Moi nhap gioi tinh: ");
        this.gioiTinh = scan.nextBoolean();
    }
    
    void inThongTin() {
        System.out.println("Ten: " + this.hoTen + ", ma sinh vien: " + this.maSv + ", nam sinh:" + this.namSinh + ", gioi tinh: " + this.gioiTinh + ", phan loai: " + this.getPhanLoai());
    }
}

