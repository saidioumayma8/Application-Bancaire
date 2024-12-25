import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static ArrayList<Client> Clients = new ArrayList<>(); // Declare Clients collection

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
                    application.addClient(scanner);
                    break;
                case 2:
                    application.viewClient();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    private  void addClient(Scanner scanner) {
        System.out.println("Enter Client ID:");
        int Id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Client Nom:");
        String Nom = scanner.nextLine();

        System.out.println("Enter Client Prenom:");
        String Prenom = scanner.nextLine();

        System.out.println("Enter Client Email:");
        String Email = scanner.nextLine();

        System.out.println("Enter Client Adresse:");
        String Adresse = scanner.nextLine();

        System.out.println("Enter Client Telephone:");
        String Telephone = scanner.nextLine();

        Client client = new Client(Id, Nom, Prenom, Email, Adresse, Telephone);
        Clients.add(client);

        System.out.println("Client added successfully!");
    }

}
