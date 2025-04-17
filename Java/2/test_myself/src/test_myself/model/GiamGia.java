package test_myself.model;

public class GiamGia {
    private String maPGG;
    private String tenPGG;
    private float hoaDonToiThieu;
    private float soTienGiamToiDa;

    public GiamGia() {
    }

    public GiamGia(String maPGG, String tenPGG, float hoaDonToiThieu, float soTienGiamToiDa) {
        this.maPGG = maPGG;
        this.tenPGG = tenPGG;
        this.hoaDonToiThieu = hoaDonToiThieu;
        this.soTienGiamToiDa = soTienGiamToiDa;
    }

    public String getMaPGG() {
        return maPGG;
    }

    public void setMaPGG(String maPGG) {
        this.maPGG = maPGG;
    }

    public String getTenPGG() {
        return tenPGG;
    }

    public void setTenPGG(String tenPGG) {
        this.tenPGG = tenPGG;
    }

    public float getHoaDonToiThieu() {
        return hoaDonToiThieu;
    }

    public void setHoaDonToiThieu(float hoaDonToiThieu) {
        this.hoaDonToiThieu = hoaDonToiThieu;
    }

    public float getSoTienGiamToiDa() {
        return soTienGiamToiDa;
    }

    public void setSoTienGiamToiDa(float soTienGiamToiDa) {
        this.soTienGiamToiDa = soTienGiamToiDa;
    }
    
    
}
