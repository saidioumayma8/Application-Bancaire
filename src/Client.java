import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    private int id;
    private String Nom;
    private String Prenom;
    private String Email;
    private String Adresse;
    private String Telephone;

    // Static collection to store clients
    private static ArrayList<Client> Clients = new ArrayList<>();

    // Constructor
    public Client(int id, String Nom, String Prenom, String Email, String Adresse, String Telephone) {
        this.id = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Adresse = Adresse;
        this.Telephone = Telephone;
    }

    // Method to manage clients
    public static void manageClients(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Manage Client ---");
            System.out.println("1. Add Client");
            System.out.println("2. View Clients");
            System.out.println("5. Back to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addClient(scanner);
                    break;
                case 2:
                    viewClients();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Method to add a client
    public static void addClient(Scanner scanner) {
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

        // Create a new client and add to the list
        Client client = new Client(Id, Nom, Prenom, Email, Adresse, Telephone);
        Clients.add(client);

        System.out.println("Client added successfully!");
    }

    // Method to view clients
    public static void viewClients() {
        if (Clients.isEmpty()) {
            System.out.println("No Clients available.");
        } else {
            for (Client client : Clients) {
                System.out.println(client);
            }
        }
    }

    // Method to check if a client exists
    public static Client isClientExist(int clientId) {
        for (Client client : Clients) {
            if (client.getId() == clientId) {
                return client;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Email='" + Email + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Telephone='" + Telephone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getEmail() {
        return Email;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String getTelephone() {
        return Telephone;
    }
}
