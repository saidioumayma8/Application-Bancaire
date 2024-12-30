import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    private String Type;
    private String Montant;
    private String Date;

    private static ArrayList<Operation> Operations = new ArrayList<>();
    private static ArrayList<Client> Clients = new ArrayList<>();
    private static ArrayList<Compte> Comptes = new ArrayList<>();// Declare Clients collection

    public Operation(String Type, String Montant, String Date){
        this.Type = Type;
        this.Montant = Montant;
        this.Date = Date;
    }


    public static void effectuerDepot(Scanner scanner) {
        System.out.println("Entre le numero du compte pour le depot:");
        String numeroCompte = scanner.nextLine();

        Compte compteTrouve = null;
        for (Compte compte : Comptes) {
            if (compte.getNumero().equals(numeroCompte)) {
                compteTrouve = compte;
                break;
            }
        }

        if (compteTrouve == null) {
            System.out.println("Compte introuvable.");
            return;
        }

        System.out.println("Entre le montant à déposer:");
        double montant = 0;
        try {
            montant = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Montant invalide. Veuillez entrer un nombre valide.");
            return;
        }

        if (montant <= 0) {
            System.out.println("Le montant doit être positif.");
            return;
        }


        compteTrouve.setSolde(compteTrouve.getSolde() + montant);
        Operations.add(new Operation("Depot", String.valueOf(montant), java.time.LocalDate.now().toString()));
        System.out.println("Dépôt effectué avec succès ! Nouveau solde: " + compteTrouve.getSolde());
    }
    public static void manageOperation(Scanner scanner) {

        while (true) {
            System.out.println("\n--- Manage Operation ---");
            System.out.println("1.Effectuer un depot sur un compte.");
            System.out.println("2.Effectuer un retrait (avec verification de solde).");
            System.out.println("3.Effectuer un virement entre deux comptes.");
            System.out.println("4.Afficher l’historique des operations pour un compte.");


            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    effectuerDepot(scanner);
                    break;
                case 2:

                    break;
                case 3:
                    return;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMontant() {
        return Montant;
    }

    public void setMontant(String montant) {
        Montant = montant;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
