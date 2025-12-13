public class Movie {
    private String title;
    private String genre;
    private double rating;
    private String author;


    public Movie(String title, String genre, double rating, String author) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
    public String getAuthor() {
        return author;
    }

    public boolean isHighlyRated() {
        return rating >= 7.0;
    }


    public void displayInfo() {
        System.out.println("Фильм: " + title);
        System.out.println("Жанр: " + genre);
        System.out.println("Автор: " + author);
        System.out.println("Рейтинг: " + rating + "/10");
        System.out.println("Высоко оценён: " + (isHighlyRated() ? "Да" : "Нет"));
    }
}
