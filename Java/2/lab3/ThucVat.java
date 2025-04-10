package lab3;

public class ThucVat {
    private String ma;
    private String ten;
    private int tuoi;
    private String loai;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, int tuoi, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.loai = loai;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "ThucVat{" + "ma=" + ma + ", ten=" + ten + ", tuoi=" + tuoi + ", loai=" + loai + '}';
    }
}
