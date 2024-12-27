import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
    private String Numero;
    private Double Solde;
    private Client Preprietaire;

    private static ArrayList<Operation> Operations = new ArrayList<>();
    private static ArrayList<Client> Clients = new ArrayList<>();
    private static ArrayList<Compte> Comptes = new ArrayList<>();// Declare Clients collection

    public Compte(String numero,Double Solde, Client Preprietaire) {
        this.Numero = numero;
        this.Solde = Solde;
        this.Preprietaire = Preprietaire;
    }


    public static void manageCompte(Scanner scanner, Application application) {

        while (true) {
            System.out.println("\n--- Manage Compte ---");
            System.out.println("1. Add Compte");
            System.out.println("2. View Compte");
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
    public static void addCompte(Scanner scanner) {
        System.out.println("Entre le numero de compte:");
        String numero = scanner.nextLine();

        System.out.println("Entre le solde de compte:");
        Double solde;
        try {
            solde = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Solde invalide. Veuillez entrer un nombre valide.");
            return;
        }

        System.out.println("Entre le type de compte (1: epargne ou 0: courant):");
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

        System.out.println("Entre l'ID du propriétaire:");
        int proprietaireId;
        try {
            proprietaireId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID invalide. Veuillez entrer un entier valide.");
            return;
        }

        // Verify if Client exist
        Client proprietaire = Client.IsClientExist(proprietaireId);
        if (proprietaire == null) {
            System.out.println("Propriétaire introuvable.");
            return;
        }

        // Create the appropriate account type
        if (typeCompte == 1) {
            CompteEpagne.addCompteEpargne(numero, solde, proprietaire);
        } else {
            CompteCourant.addCompteCourant(numero, solde, proprietaire);
        }

        System.out.println("Compte ajouté avec succès !");
    }

    public static void viewCompte(){
        if (Comptes.isEmpty()){
            System.out.println("No Comptes available.");
        }else{
            for (Compte compte : Comptes){
                System.out.println(compte);
            }
        }
    }
    public static Compte IsCompteExist (String className){
        for(Compte compte : Comptes){
            if(compte.getNumero().equals(className)){
                return compte;
            }
        }
        return null;

    }
        public static void addCompte (Scanner scanner){
            System.out.println("Entre le numéro de compte:");
            String numero = scanner.nextLine();

            System.out.println("Entre le solde de compte:");
            Double solde;
            try {
                solde = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Solde invalide. Veuillez entrer un nombre valide.");
                return;
            }

            System.out.println("Entre le type de compte (1: épargne ou 0: courant):");
            int typeCompte;
            try {
                typeCompte = Integer.parseInt(scanner.nextLine());
                if (typeCompte != 0 && typeCompte != 1) {
                    System.out.println("Type de compte invalide. Entrez 1 pour épargne ou 0 pour courant.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Type de compte invalide. Veuillez entrer 1 ou 0.");
                return;
            }

            System.out.println("Entre l'ID du propriétaire:");
            int proprietaireId;
            try {
                proprietaireId = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("ID invalide. Veuillez entrer un entier valide.");
                return;
            }

            // Search for the owner in the Clients list
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

            // Create the appropriate type of account
            Compte compte;
            if (typeCompte == 1) {
                compte = new CompteEpargne(numero, solde, proprietaire); // Assuming you have a `CompteEpargne` class
            } else {
                compte = new CompteCourant(numero, solde, proprietaire); // Assuming you have a `CompteCourant` class
            }

            Comptes.add(compte);

            System.out.println("Compte ajouté avec succès !");
        }
    }
    }

    @Override
    public String toString() {
        return "Compte{" +
                "Numero='" + Numero + '\'' +
                ", Solde=" + Solde +
                ", Preprietaire=" + Preprietaire +
                '}';
    }

    public String getNumero() {
        return Numero;
    }

    public Double getSolde() {
        return Solde;
    }

    public void setSolde(Double solde) {
        Solde = solde;
    }

    public Client getPreprietaire() {
        return Preprietaire;
    }

}
