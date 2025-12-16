public class Movie {
    private String nazvanie;
    private String ganr;
    private double rejting;
    private String avtor;
    
    public Movie(String n, String g, double r, String a) {
        nazvanie = n;
        ganr = g;
        rejting = r;
        avtor = a;
    }
    
    public String getNazvanie() {
        return nazvanie;
    }
    
    public String getGanr() {
        return ganr;
    }
    
    public double getRejting() {
        return rejting;
    }
    
    public String getAvtor() {
        return avtor;
    }
    
    public void setNazvanie(String n) {
        nazvanie = n;
    }
    
    public void setGanr(String g) {
        ganr = g;
    }
    
    public void setRejting(double r) {
        rejting = r;
    }
    
    public void setAvtor(String a) {
        avtor = a;
    }
    
    public void pokazat() {
        System.out.println("Фильм: " + nazvanie);
        System.out.println("Жанр: " + ganr);
        System.out.println("Режиссер: " + avtor);
        System.out.println("Рейтинг: " + rejting + "/10");
        
        if (rejting >= 7.0) {
            System.out.println("Высокий рейтинг: Да");
        } else {
            System.out.println("Высокий рейтинг: Нет");
        }
    }
}
