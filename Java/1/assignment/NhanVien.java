/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author Dra
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private Double luong;
    // hàm tạo tự làm

    public NhanVien() {
        this.maNV = "Chua co ma NV";
        this.hoTen = "Chua co ten";
    }

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = 0.0;
    }

    public NhanVien(String maNV, String hoTen, Double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        if (this.luong == null) {luong = 0.0;}
        this.luong = luong;
        
    }
    
    double getThuNhap() {
        if (this.luong == null) return 0.0;
        return this.luong;
    }
    
    double getThueTN() {
        if (this.getThuNhap() < 9) return 0.0;
        else // thu nhập >=9
            {
            if (this.getThuNhap() <= 15)
                return (this.getThuNhap()-9)*0.1;
            else
                return (15-9)*0.1+(this.getThuNhap()-15)*0.12;
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luong=" + luong + ", thue=" + getThueTN() + '}';
    }
}