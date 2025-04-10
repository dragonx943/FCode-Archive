package buoi11;

public class GiangVien {
    private String ma;
    private String ten;
    private String loai;
    private int tuoi;
    private int bac;
    private int gioi_tinh; // BIT: 0-1

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String loai, int tuoi, int bac, int gioi_tinh) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioi_tinh = gioi_tinh;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "ma=" + ma + ", ten=" + ten + ", loai=" + loai + ", tuoi=" + tuoi + ", bac=" + bac + ", gioi_tinh=" + gioi_tinh + '}';
    }
    
    public void inThongTin() {
        System.out.println(this.toString());
    }
}
