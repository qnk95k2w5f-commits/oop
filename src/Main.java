/**
 * Main class for the Cinema Ticket Booking System
 * Demonstrates object creation, data output, and object comparison
 */
    public class Main {
        public static void main(String[] args) {
            System.out.println("=== CINEMA TICKET BOOKING SYSTEM ===\n");


            Movie movie1 = new Movie("The Dark Knight", "Action", 9.0, "Christopher Nolan");
            Movie movie2 = new Movie("Inception", "Sci-Fi", 8.8, "Christopher Nolan");

            movie1.displayInfo();
            System.out.println();
            movie2.displayInfo();
            System.out.println();


            Viewer viewer1 = new Viewer("John Smith", 25,  true, "+7756231547");
            Viewer viewer2 = new Viewer("Sarah Johnson", 17,  false, "8956215478");

            viewer1.displayInfo();
            System.out.println();
            viewer2.displayInfo();
            System.out.println();


            Cinema cinema1 = new Cinema("Galaxy Cinemas", "Downtown Mall", 2500);
            Cinema cinema2 = new Cinema("Star Theater", "West Side Plaza", 1200);

            cinema1.displayInfo();
            System.out.println();
            cinema2.displayInfo();
            System.out.println();
        }
    }
