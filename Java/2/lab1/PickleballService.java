package lab12;

import java.util.ArrayList;

public class PickleballService {
    ArrayList<Pickleball> lstVot = new ArrayList<>();

    public PickleballService() {
        fakeData();
    }
    
    public void fakeData() {
        lstVot.add(new Pickleball("VNB023302", "Vợt Pickleball Joola Perseus 14mm Mod TA-15 Pro Player Edition", "Joola", 699.0000, 5, 1));
        lstVot.add(new Pickleball("VNB023793", "Vợt Pickleball Wilson Cadence Pro 16mm", "Wilson", 509.0000, 10, 1));
        lstVot.add(new Pickleball("VNB023792", "Vợt Pickleball Wilson Fierce Pro 13mm", "Wilson", 318.0000, 8, 0));
        lstVot.add(new Pickleball("VNB022333", "Vợt Pickleball Joola Ben Johns Hyperion 3S 14mm", "Joola", 699.0000, 5, 0));
        lstVot.add(new Pickleball("VNB023791", "Vợt Pickleball Wilson Blaze Tour 16mm", "Wilson", 521.0000, 12, 1));
    }
    
    public ArrayList<Pickleball> getAllData() {
        return lstVot;
    }
    
    public void them(String a, String b, String c, Double d, int e, int f) {
        lstVot.add(new Pickleball(a,b,c,d,e,f));
    }
}
