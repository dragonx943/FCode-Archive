/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi3;

/**
 *
 * @author Dra
 */
public class SinhVien {
    private String maSV;
    private String ten;
    private int tuoi;
    private String diaChi;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String ten, int tuoi, String diaChi, boolean gioiTinh) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", ten=" + ten + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

    String checkGender() {
        if (isGioiTinh()) {
            return "Nam";
        } else return "Nu";
    }
    
    public void inThongTin() {
        System.out.println(toString());
    }
}
