package Thuoc;

public class ThuocXuatKhau extends ThuocData {
    // thêm thuộc tính hạn sử dụng: int
    // thêm thuộc tính lô sản xuất, vd: "01:23:11 17-02-2025"
    // phương thức
    // + nhap, xuat
    // + phanloạiXK(): Nếu 4 ký tự cuối cùng của lô sx là 2025: đưa ra "Hang moi", nếu 2 ký tự đầu > 18: "San xuat ban ngay" - còn lại ban đêm
    // Trong main của thuốc có thêm chức năng keThua
    
    private int hanSD;
    private String loSX;

    public ThuocXuatKhau() {
    }

    public ThuocXuatKhau(int hanSD, String loSX, String tenThuoc, Double giaBan, String hangSanXuat, String nhaNhapKhau, String nhaPhanPhoi) {
        super(tenThuoc, giaBan, hangSanXuat, nhaNhapKhau, nhaPhanPhoi);
        this.hanSD = hanSD;
        this.loSX = loSX;
    }

    public int getHanSD() {
        return hanSD;
    }

    public void setHanSD(int hanSD) {
        this.hanSD = hanSD;
    }

    public String getLoSX() {
        return loSX;
    }

    public void setLoSX(String loSX) {
        this.loSX = loSX;
    }
}
