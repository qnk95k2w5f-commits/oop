public class Cinema {
    private String nazvanie;
    private String adres;
    private int vmestimost;
    
    public Cinema(String n, String a, int v) {
        nazvanie = n;
        adres = a;
        vmestimost = v;
    }
    
    public String getNazvanie() {
        return nazvanie;
    }
    
    public String getAdres() {
        return adres;
    }
    
    public int getVmestimost() {
        return vmestimost;
    }
    
    public void setNazvanie(String n) {
        nazvanie = n;
    }
    
    public void setAdres(String a) {
        adres = a;
    }
    
    public void setVmestimost(int v) {
        vmestimost = v;
    }
    
    public void pokazat() {
        System.out.println("Кинотеатр: " + nazvanie);
        System.out.println("Адрес: " + adres);
        System.out.println("Мест: " + vmestimost);
    }
}
