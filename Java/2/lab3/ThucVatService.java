package lab3;

import buoi3.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ThucVatService {
    ArrayList<ThucVat> list = new ArrayList<>();

    public ThucVatService() {
        fakeData();
    }
    
    
    public void fakeData() {
        list.add(new ThucVat("PH001", "Rau cai", 12, "Loai 1"));
        list.add(new ThucVat("PH002", "Ca chua", 4, "Loai 2"));
        list.add(new ThucVat("PH003", "Rau muong", 2, "Loai 3"));
        list.add(new ThucVat("PH004", "Hoa nhai", 12, "Loai 3"));
        list.add(new ThucVat("PH005", "Hoa sen", 7, "Loai 1"));
    }
    
    public ArrayList<ThucVat> getAll() {
        return list;
    }
    
    // Add các tính năng ở đây
    
    public void them(ThucVat temp) {
        list.add(temp);
    }
    
    public void sua(ThucVat temp, int index) {
        list.set(index, temp);
    }
    
    public void xoa(int index) {
        list.remove(index);
    }
    
    public void sapXep() {
        Comparator<ThucVat> com1 = new Comparator<ThucVat>() {
            @Override
            public int compare(ThucVat o1, ThucVat o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        Collections.sort(list, com1);
    }
}
