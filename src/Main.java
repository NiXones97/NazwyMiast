import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String name;
        Set<String> names = new HashSet<>();
        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("Podaj Miasto : ");
            name = scan.next();

            if (!name.equals("-"))
                names.add(name);
        }

        while (!name.equals("/"));
        {
        System.out.println("Błędne dane !");}


        System.out.println("Liczba podanych prawidłowo miast to : " + names.size());

    }




}
