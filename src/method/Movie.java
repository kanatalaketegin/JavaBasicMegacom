package method;

public class Movie {
    String title;
    int year;
    String director;
    double ratinglmdb;

    public Movie() {

    }
    public static void printInfo(String title, int year, String director, double ratinglmdb) {
        System.out.println("фильм: " + title);
        System.out.println("год выпуска: " + year);
        System.out.println("режиссер: " + director);
        System.out.println("рейтинг: " + ratinglmdb);
    }
    public double rating (double ratingInseption) {

        return ratingInseption;
    }
}
