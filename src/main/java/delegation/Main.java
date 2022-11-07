package delegation;

public class Main {
    public static void main(String[] args) {
        System.out.println(Film.NEW_FILM.getBonus(5));
        System.out.println(Film.NEW_FILM.getPrice(4));
        System.out.println(Film.CHILDREN_FILM.getPrice(7));
        System.out.println(Film.CHILDREN_FILM.getBonus(6));
        System.out.println(Film.REGULAR_FILM.getPrice(3));
        System.out.println(Film.REGULAR_FILM.getBonus(2));
    }
}
