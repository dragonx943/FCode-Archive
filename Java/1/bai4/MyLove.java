/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author Dra
 */
public class MyLove {
    // có thuộc tính
    private String ten;
    private int namSinh;
    private double canNang;
    
    // hành vi
    private void Speak() {
        System.out.println("Nín!");
    };

    public MyLove() {
        // hàm khởi tạo = giấy khai sinh
        // hàm tạo không tham số
        // dấu hiệu nhận biết hàm tạo = constructor
        // 1. Có tên trùng với tên của lớp
        // 2. public
        // 3. Không có kiểu trả về
    }

    public MyLove(String ten, int namSinh, double canNang) {
        // Hàm tạo full tham số
        this.ten = ten;
        // tên bên trái là thuộc tính của đối tượng, tên bên phải là tham số được truyền vào
        this.namSinh = namSinh;
        this.canNang = canNang;
    }

    public MyLove(String ten) {
        // Hàm tạo chỉ có 1 tham số truyền vào
        this.ten = ten;
    }

    public String getTen() { // Lấy ra giá trị của thuộc tính
        return ten;
    }

    public void setTen(String ten) { // Thiết lập giá trị của thuộc tính
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        if (this.namSinh < 2008) {
            this.namSinh = 2006;
        } else this.namSinh = namSinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        if (this.canNang > 35.0) {
            this.canNang = 35.0;
        } else this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "MyLove{" + "ten=" + ten + ", namSinh=" + namSinh + ", canNang=" + canNang + '}';
    }
    
}
