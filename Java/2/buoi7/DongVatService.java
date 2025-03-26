package buoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DongVatService {
    ArrayList<DongVat> listDV = new ArrayList<>();

    public DongVatService() {
        fakeData();
    }
    
    public void fakeData() {
        listDV.add(new DongVat("AB101", "Fish", 14, true));
        listDV.add(new DongVat("AB102", "Cow", 21, false));
        listDV.add(new DongVat("AB103", "Pig", 28, true));
        listDV.add(new DongVat("AB104", "Dog", 20, true));
        listDV.add(new DongVat("AB105", "Chicken", 12, false));
    }
    
    public ArrayList<DongVat> getAll() {
        return listDV;
    }
    
    // phát triển các tính năng ở dưới đây!
    
    public void them(DongVat temp) {
        listDV.add(temp);
    }
    
    public void xoa(int index) {
        listDV.remove(index);
    }
    
    public void sua(int index, DongVat fake) {
        listDV.set(index, fake);
    }
    
    public void sapXep() {
        Comparator<DongVat> com1 = new Comparator<DongVat>() {
            @Override
            public int compare(DongVat o1, DongVat o2) {
                if (o1.getCanNang()> o2.getCanNang()) {
                    return -1;
                } else if (o1.getCanNang() == o2.getCanNang()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(listDV, com1);
    }
}
