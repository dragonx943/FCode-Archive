package buoi13;

import java.util.Date;



public class SanPham {
    private String maSP;
    private String tenSP;
    private Date ngaySX;
    private String website;
    private int soLuong;
    private int trangThai;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, Date ngaySX, String website, int soLuong, int trangThai) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.ngaySX = ngaySX;
        this.website = website;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
