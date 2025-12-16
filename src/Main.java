public class Main {
    public static void main(String[] args) {
        System.out.println("=== СИСТЕМА БРОНИРОВАНИЯ БИЛЕТОВ ===");
        System.out.println();
        
        Movie film1 = new Movie("The Dark Knight", "Action", 9.0, "Christopher Nolan");
        Movie film2 = new Movie("Inception", "Sci-Fi", 8.8, "Christopher Nolan");
        
        film1.pokazat();
        System.out.println();
        film2.pokazat();
        System.out.println();
        
        Viewer zritel1 = new Viewer("John Smith", 25, true, "+7756231547");
        Viewer zritel2 = new Viewer("Sarah Johnson", 17, false, "8956215478");
        
        zritel1.pokazat();
        System.out.println();
        zritel2.pokazat();
        System.out.println();
        
        Cinema kino1 = new Cinema("Galaxy Cinemas", "Downtown Mall", 2500);
        Cinema kino2 = new Cinema("Star Theater", "West Side Plaza", 1200);
        
        kino1.pokazat();
        System.out.println();
        kino2.pokazat();
        System.out.println();
        
        System.out.println("=== СРАВНЕНИЕ ОБЪЕКТОВ ===");
        System.out.println();
        
        System.out.println("Сравнение фильмов:");
        if (film1.getRejting() > film2.getRejting()) {
            System.out.println(film1.getNazvanie() + " имеет более высокий рейтинг");
        } else {
            System.out.println(film2.getNazvanie() + " имеет более высокий рейтинг");
        }
        System.out.println();
        
        System.out.println("Сравнение зрителей:");
        if (zritel1.isVip() && !zritel2.isVip()) {
            System.out.println(zritel1.getImya() + " является VIP клиентом");
        } else if (!zritel1.isVip() && zritel2.isVip()) {
            System.out.println(zritel2.getImya() + " является VIP клиентом");
        } else {
            System.out.println("Оба зрителя имеют одинаковый статус");
        }
        System.out.println();
        
        System.out.println("Сравнение кинотеатров:");
        if (kino1.getVmestimost() > kino2.getVmestimost()) {
            System.out.println(kino1.getNazvanie() + " больше по вместимости (" + kino1.getVmestimost() + " мест)");
        } else {
            System.out.println(kino2.getNazvanie() + " больше по вместимости (" + kino2.getVmestimost() + " мест)");
        }
    }
}
