package bai7;

import java.util.Scanner;

public class SinhVienIT extends SinhVien { // kế thừa SinhVien
    // được thừa hưởng các thuộc tính của cha
    // mã, họ tên, năm sinh,...
    // thuộc tính riêng
    private Double diemC;
    private Double diemJava;
    private Double diemCSDL;
    
    // phương thức

    public SinhVienIT() {
    }

    public SinhVienIT(Double diemC, Double diemJava, Double diemCSDL, String maSv, String hoTen, int namSinh, Boolean gioiTinh) {
        super(maSv, hoTen, namSinh, gioiTinh);
        // Con gọi cha thông qua từ khoá super
        // Gọi hàm tạo có đủ full tham số của cha
        // Hàm tạo của cha không được kế thừa cho con
        this.diemC = diemC;
        this.diemJava = diemJava;
        this.diemCSDL = diemCSDL;
    }

    public SinhVienIT(Double diemC, Double diemJava, Double diemCSDL) {
        super(); // con gọi xin cha: hàm tạo k tham số
        this.diemC = diemC;
        this.diemJava = diemJava;
        this.diemCSDL = diemCSDL;
    }

    public Double getDiemC() {
        return diemC;
    }

    public void setDiemC(Double diemC) {
        this.diemC = diemC;
    }

    public Double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(Double diemJava) {
        this.diemJava = diemJava;
    }

    public Double getDiemCSDL() {
        return diemCSDL;
    }

    public void setDiemCSDL(Double diemCSDL) {
        this.diemCSDL = diemCSDL;
    }

    @Override
    public String toString() {
        return "SinhVienIT{" + "diemC=" + diemC + ", diemJava=" + diemJava + ", diemCSDL=" + diemCSDL + '}';
    }
    
    void nhap() {
        super.nhap(); // xin cha hàm nhập
        // có nhập mã, tên, năm sinh, giới tính,...
        Scanner scan = new Scanner(System.in);
        System.out.print("Moi nhap diem C: ");
        this.diemC = scan.nextDouble();
        System.out.print("Moi nhap diem Java: ");
        this.diemJava = scan.nextDouble();
        System.out.print("Moi nhap diem CSDL: ");
        this.diemCSDL = scan.nextDouble();
    }
    
    void inThongTin() {
        super.inThongTin(); // gọi inThongTin của cha
        System.out.println("Diem C: " + this.diemC + ", Diem Java: " + this.diemJava + ", Diem CSDL: " + this.diemCSDL);
    }
}
