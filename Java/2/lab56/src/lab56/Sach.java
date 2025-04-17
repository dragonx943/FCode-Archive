/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab56;

/**
 *
 * @author dell
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private boolean trangThai;
    private float giaSach;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, boolean trangThai, float giaSach) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.trangThai = trangThai;
        this.giaSach = giaSach;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public float getGiaSach() {
        return giaSach;
    }

    public void setGiaSach(float giaSach) {
        this.giaSach = giaSach;
    }

    @Override
    public String toString() {
        return "Sach{" + "maSach=" + maSach + ", tenSach=" + tenSach + ", trangThai=" + trangThai + ", giaSach=" + giaSach + '}';
    }
    
    
    
    
}
