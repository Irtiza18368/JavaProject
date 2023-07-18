import java.util.Scanner;
public class FavFilm2 {
    public static void main(String[] args) {
        askforFavFilm();
    }
    public static void askforFavFilm(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your favourite film?");
        String favFilm = scanner.nextLine();

        printResponse(favFilm);
    }

    public static void printResponse(String favFilm){
        System.out.println(favFilm + "! I like that too.");
    }
}
