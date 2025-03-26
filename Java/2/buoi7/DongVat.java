package buoi7;

public class DongVat {
    private String maDV;
    private String tenDongVat;
    private int canNang;
    private Boolean gioiTinh;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDongVat, int canNang, Boolean gioiTinh) {
        this.maDV = maDV;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String checkGioiTinh() {
        if (this.gioiTinh) {
          return "Nam";
        } else return "Nu";
    }

    @Override
    public String toString() {
        return "DongVat{" + "maDV=" + maDV + ", tenDongVat=" + tenDongVat + ", canNang=" + canNang + ", gioiTinh=" + gioiTinh + '}';
    }
}
