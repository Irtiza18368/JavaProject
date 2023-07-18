import java.util.Scanner;
public class FavFilm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your favourite film?");
        String favfilm= scanner.nextLine();
        System.out.println(favfilm + "! I like that too");
    }
}
