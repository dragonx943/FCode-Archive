package asm2;


public class NhanVien {
    private String maNV;
    private String tenNV;
    private String sdt;
    private int trangthai;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, String sdt, int trangthai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.sdt = sdt;
        this.trangthai = trangthai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", sdt=" + sdt + ", trangthai=" + trangthai + '}';
    }
    
    String checkStatus() {
        if (this.getTrangthai() == 1) {
            return "Đang làm";
        } else return "Nghỉ việc";
    }
}
