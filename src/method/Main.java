package method;

public class Main {
    public static void main (String[] args) {

        Movie inseption = new Movie();
        inseption.title = "Начало";
        inseption.year = 2010;
        inseption.director = "Кристофер Нолан";
        inseption.ratinglmdb = 8.7;
        System.out.println("фильм: " + inseption.title);
        System.out.println("год выпуска: " + inseption.year);
        System.out.println("режиссер: " + inseption.director);
        System.out.println("рейтинг: " + inseption.ratinglmdb);
        System.out.println();

        Movie avatar = new Movie();
        avatar.title = "Аватар";
        avatar.year = 2009;
        avatar.director = "Джеймс Кэмерон";
        avatar.ratinglmdb = 7.9;
        System.out.println("фильм: " + avatar.title);
        System.out.println("год выпуска: " + avatar.year);
        System.out.println("режиссер: " + avatar.director);
        System.out.println("рейтинг: " + avatar.ratinglmdb);
        System.out.println();

        Movie.printInfo("Матрица", 1999, "Лана Вачовски", 8.5);
        System.out.println();

        Movie.printInfo("Гладиатор", 2000, "Ридли Скотт", 8.6);
        System.out.println();
        System.out.println(avatar.hashCode());

        Movie ratingInsep = new Movie();
        double ratingInseption = ratingInsep.rating(8.8);
        System.out.println (ratingInseption);
    }
}
