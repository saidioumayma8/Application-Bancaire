import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    private static ArrayList<Client> Clients = new ArrayList<>();
    private static ArrayList<Compte> Comptes = new ArrayList<>();// Declare Clients collection

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
                    application.addCompte(scanner);
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
    private  void viewClient() {
        if (Clients.isEmpty()) {
            System.out.println("No Clients available.");
        } else {
            for (Client client : Clients) {
                System.out.println(client);
            }
        }
    }
    private void addCompte(Scanner scanner) {
        System.out.println("Entre le numero de compte ");
        String numero = scanner.nextLine();

        System.out.println("Entre le solde de compte");
        Double solde = null;
        try {
            solde = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Solde invalide. Veuillez entrer un nombre valide.");
            return;
        }

        System.out.println("Entre l'ID du propriétaire");
        int proprietaireId = 0;
        try {
            proprietaireId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID invalide. Veuillez entrer un entier valide.");
            return;
        }

        Client proprietaire = null;
        for (Client client : Clients) {
            if (client.getId() == proprietaireId) {
                proprietaire = client;
                break;
            }
        }

        if (proprietaire == null) {
            System.out.println("Propriétaire introuvable.");
            return;
        }

        Compte compte = new Compte(numero, solde, proprietaire);
        Comptes.add(compte);

        System.out.println("Compte ajouté avec succès !");
    }

    private void viewCompte(){
        if (Comptes.isEmpty()){
            System.out.println("No Comptes available.");
        }else{
            for (Compte compte : Comptes){
                System.out.println(compte);
            }
        }
    }

}
