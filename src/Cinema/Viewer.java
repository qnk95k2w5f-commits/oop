package Cinema;

public class Viewer {
    private String imya;
    private int vozrast;
    private boolean vip;
    private String telefon;
    
    public Viewer(String i, int v, boolean vipka, String t) {
        imya = i;
        vozrast = v;
        vip = vipka;
        telefon = t;
    }
    
    public String getImya() {
        return imya;
    }
    
    public int getVozrast() {
        return vozrast;
    }
    
    public boolean isVip() {
        return vip;
    }
    
    public String getTelefon() {
        return telefon;
    }
    
    public void setImya(String i) {
        imya = i;
    }
    
    public void setVozrast(int v) {
        vozrast = v;
    }
    
    public void setVip(boolean v) {
        vip = v;
    }
    
    public void setTelefon(String t) {
        telefon = t;
    }
    
    public void pokazat() {
        System.out.println("Зритель: " + imya);
        System.out.println("Возраст: " + vozrast);
        System.out.println("Телефон: " + telefon);
        
        if (vip == true) {
            System.out.println("VIP статус: Да");
        } else {
            System.out.println("VIP статус: Нет");
        }
    }
}
