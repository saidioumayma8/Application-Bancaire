import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
    private String numero; // Fixed spelling
    private Double solde;
    private Client proprietaire; // Fixed spelling

    // Static collection to store accounts
    protected static ArrayList<Compte> Comptes = new ArrayList<>();

    // Constructor
    public Compte(String numero, Double solde, Client proprietaire) {
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
    }

    // Method to manage comptes
    public static void manageCompte(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Manage Compte ---");
            System.out.println("1. Add Compte");
            System.out.println("2. View Comptes");
            System.out.println("5. Back to Main Menu");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCompte(scanner);
                    break;
                case 2:
                    viewCompte();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // Method to add an account
    public static void addCompte(Scanner scanner) {
        System.out.println("Enter the numero de compte:");
        String numero = scanner.nextLine();

        System.out.println("Enter the solde de compte:");
        Double solde;
        try {
            solde = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Solde invalide. Veuillez entrer un nombre valide.");
            return;
        }

        System.out.println("Enter the type de compte (1: epargne, 0: courant):");
        int typeCompte;
        try {
            typeCompte = Integer.parseInt(scanner.nextLine());
            if (typeCompte != 0 && typeCompte != 1) {
                System.out.println("Type de compte invalide. Entrez 1 pour epargne ou 0 pour courant.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Type de compte invalide. Veuillez entrer 1 ou 0.");
            return;
        }

        System.out.println("Enter the ID of the propriétaire:");
        int proprietaireId;
        try {
            proprietaireId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID invalide. Veuillez entrer un entier valide.");
            return;
        }

        // Check if the client exists
        Client proprietaire = Client.isClientExist(proprietaireId);
        if (proprietaire == null) {
            System.out.println("Propriétaire introuvable.");
            return;
        }

        // Create the appropriate account type
        Compte compte;
        if (typeCompte == 1) {
            compte = new CompteEpagne(numero, solde, proprietaire); // Assuming you have a `CompteEpagne` class
        } else {
            compte = new CompteCourant(numero, solde, proprietaire); // Assuming you have a `CompteCourant` class
        }

        Comptes.add(compte);
        System.out.println("Compte ajouté avec succès !");
    }

    // Method to view comptes
    public static void viewCompte() {
        if (Comptes.isEmpty()) {
            System.out.println("No Comptes available.");
        } else {
            for (Compte compte : Comptes) {
                System.out.println(compte);
            }
        }
    }

    public String getNumero() {
        return numero;
    }

    public Double getSolde() {
        return solde;
    }

    public Client getProprietaire() {
        return proprietaire;
    }
    public void setSolde(Double solde) {
        this.solde = solde;
    }


    @Override
    public String toString() {
        return "Compte{" +
                "Numero='" + numero + '\'' +
                ", Solde=" + solde +
                ", Proprietaire=" + proprietaire +
                '}';
    }
}
