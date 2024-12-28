import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static ArrayList<Compte> Comptes = new ArrayList<>();// Declare Clients collection
    private static ArrayList<Client> Clients = new ArrayList<>();
    public static void main(String art[]) {
    Application application = new Application();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----Menu----");
            System.out.println("1-Gestion des client");
            System.out.println("2-Gestion des Compte");
            System.out.println("3-Gestion des operation");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Client.manageClients(scanner);
                    break;
                case 2:
                    Compte.manageCompte(scanner);
                    break;
                case 3:
                    Operation.manageOperation(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

}
