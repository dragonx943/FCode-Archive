package lab12;

public class Pickleball {
    private String ma;
    private String ten;
    private String thuongHieu;
    private Double gia;
    private int soLuong;
    private int trangThai;

    public Pickleball() {
    }

    public Pickleball(String ma, String ten, String thuongHieu, Double gia, int soLuong, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.thuongHieu = thuongHieu;
        this.gia = gia;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
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
    
    public int votStatus() {
        return trangThai;
    }

    @Override
    public String toString() {
        return "Pickleball{" + "ma=" + ma + ", ten=" + ten + ", thuongHieu=" + thuongHieu + ", gia=" + gia + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
    
    String checkStatus() {
        if (this.trangThai == 1) {
            return "Mo ban";
        } else if (this.trangThai == 0) {
            return "Ngung ban";
        } else return "Khong co";
    }
}
