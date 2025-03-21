package buoi3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SinhVienService {
    ArrayList<SinhVien> lstSinhViens = new ArrayList<>();

    public SinhVienService() {
        fakeData();
    }
    
    public void fakeData() {
        // đi tạo dữ liệu sẵn có cho lstSinhViens
        lstSinhViens.add(new SinhVien("PH111", "Anh", 18, "HN", true));
        lstSinhViens.add(new SinhVien("PH222", "Trang", 20, "HN", false));
        lstSinhViens.add(new SinhVien("PH333", "Minh", 18, "HN", true));
        lstSinhViens.add(new SinhVien("PH444", "Hang", 19, "HN", false));
        lstSinhViens.add(new SinhVien("PH555", "Dung", 21, "HN", false));
    }
    
    public ArrayList<SinhVien> getAll() {
        return lstSinhViens;
    }
    
    public void them(String a, String b, int c, Boolean d, String e) {
        lstSinhViens.add(new SinhVien(a,b,c,e,d));
    }
    
    public void xoa(int num) {
        lstSinhViens.remove(num);
    }
    
    public void sua(int num, String a, String b, int c, Boolean d, String e) {
        lstSinhViens.set(num, new SinhVien(a,b,c,e,d));
    }
    
    public void sapXep() {
        Comparator<SinhVien> com2 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(lstSinhViens, com2);
    }
}
