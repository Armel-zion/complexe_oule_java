import java.util.Scanner;

public class App {

    static Chambre[] chambres = new Chambre[19];
    static Reservation[] reservations = new Reservation[100];
    static int nombreReservations = 0;
    static Client[] clients = new Client[100];
    static int nombreClients = 0;

    static void initialiserChambres() {
        Chambre chambreA1 = new Chambre();
        chambreA1.numero = "A1";
        chambreA1.type = "Groupe A";
        chambreA1.prixParNuit = 11000.0;
        chambreA1.estDisponible = true;

        Chambre chambreA2 = new Chambre();
        chambreA2.numero = "A2";
        chambreA2.type = "Groupe A";
        chambreA2.prixParNuit = 11000.0;
        chambreA2.estDisponible = true;

        Chambre chambreA3 = new Chambre();
        chambreA3.numero = "A3";
        chambreA3.type = "Groupe A";
        chambreA3.prixParNuit = 11000.0;
        chambreA3.estDisponible = true;

        Chambre chambreB1 = new Chambre();
        chambreB1.numero = "B1";
        chambreB1.type = "Groupe B";
        chambreB1.prixParNuit = 15000.0;
        chambreB1.estDisponible = true;

        Chambre chambreB2 = new Chambre();
        chambreB2.numero = "B2";
        chambreB2.type = "Groupe B";
        chambreB2.prixParNuit = 15000.0;
        chambreB2.estDisponible = true;

        Chambre chambreB3 = new Chambre();
        chambreB3.numero = "B3";
        chambreB3.type = "Groupe B";
        chambreB3.prixParNuit = 15000.0;
        chambreB3.estDisponible = true;

        Chambre chambreB4 = new Chambre();
        chambreB4.numero = "B4";
        chambreB4.type = "Groupe B";
        chambreB4.prixParNuit = 15000.0;
        chambreB4.estDisponible = true;

        Chambre chambreC1 = new Chambre();
        chambreC1.numero = "C1";
        chambreC1.type = "Groupe C";
        chambreC1.prixParNuit = 12000.0;
        chambreC1.estDisponible = true;

        Chambre chambreC2 = new Chambre();
        chambreC2.numero = "C2";
        chambreC2.type = "Groupe C";
        chambreC2.prixParNuit = 12000.0;
        chambreC2.estDisponible = true;

        Chambre chambreC3 = new Chambre();
        chambreC3.numero = "C3";
        chambreC3.type = "Groupe C";
        chambreC3.prixParNuit = 12000.0;
        chambreC3.estDisponible = true;

        Chambre chambreC4 = new Chambre();
        chambreC4.numero = "C4";
        chambreC4.type = "Groupe C";
        chambreC4.prixParNuit = 12000.0;
        chambreC4.estDisponible = true;

        Chambre chambreC5 = new Chambre();
        chambreC5.numero = "C5";
        chambreC5.type = "Groupe C";
        chambreC5.prixParNuit = 12000.0;
        chambreC5.estDisponible = true;

        Chambre chambreC6 = new Chambre();
        chambreC6.numero = "C6";
        chambreC6.type = "Groupe C";
        chambreC6.prixParNuit = 12000.0;
        chambreC6.estDisponible = true;

        Chambre chambreC7 = new Chambre();
        chambreC7.numero = "C7";
        chambreC7.type = "Groupe C";
        chambreC7.prixParNuit = 12000.0;
        chambreC7.estDisponible = true;

        Chambre chambreC8 = new Chambre();
        chambreC8.numero = "C8";
        chambreC8.type = "Groupe C";
        chambreC8.prixParNuit = 12000.0;
        chambreC8.estDisponible = true;

        Chambre chambreD1 = new Chambre();
        chambreD1.numero = "D1";
        chambreD1.type = "Groupe D";
        chambreD1.prixParNuit = 20000.0;
        chambreD1.estDisponible = true;

        Chambre chambreD2 = new Chambre();
        chambreD2.numero = "D2";
        chambreD2.type = "Groupe D";
        chambreD2.prixParNuit = 20000.0;
        chambreD2.estDisponible = true;

        Chambre chambreD3 = new Chambre();
        chambreD3.numero = "D3";
        chambreD3.type = "Groupe D";
        chambreD3.prixParNuit = 20000.0;
        chambreD3.estDisponible = true;

        Chambre chambreSRCF = new Chambre();
        chambreSRCF.numero = "SRCF";
        chambreSRCF.type = "Groupe SRCF";
        chambreSRCF.prixParNuit = 80000.0;
        chambreSRCF.estDisponible = true;

        chambres[0] = chambreA1;
        chambres[1] = chambreA2;
        chambres[2] = chambreA3;
        chambres[3] = chambreB1;
        chambres[4] = chambreB2;
        chambres[5] = chambreB3;
        chambres[6] = chambreB4;
        chambres[7] = chambreC1;
        chambres[8] = chambreC2;
        chambres[9] = chambreC3;
        chambres[10] = chambreC4;
        chambres[11] = chambreC5;
        chambres[12] = chambreC6;
        chambres[13] = chambreC7;
        chambres[14] = chambreC8;
        chambres[15] = chambreD1;
        chambres[16] = chambreD2;
        chambres[17] = chambreD3;
        chambres[18] = chambreSRCF;
    }

    static Chambre trouverChambreParNumero(String numero) {
        for (int i = 0; i < chambres.length; i++) {
            if (chambres[i].numero.equalsIgnoreCase(numero)) {
                return chambres[i];
            }
        }
        return null;
    }

    static void creerReservation(Scanner scanner) {
        System.out.println("=== Créer une réservation ===");

        Client client = null;

        System.out.println("1. Utiliser un client existant");
        System.out.println("2. Créer un nouveau client");
        System.out.print("Votre choix : ");
        int choixClient = Integer.parseInt(scanner.nextLine());

        if(choixClient == 1) {
            System.out.print("Téléphone du client du existant : ");
            String tel = scanner.nextLine();

            client = trouverClientParTelephone(tel);

            if(client == null){
                System.out.println("Aucun client trouvé avec ce téléphone. On va créer un nouveau clients.");
            }
        }


       if(client == null){
            //Créztion d'un niveau client
            client = new Client();
            System.out.print("Nom du client : ");
            client.nom = scanner.nextLine();
            System.out.print("Téléphone du client : ");
            client.telephone = scanner.nextLine();
            System.out.print("Entreprise du client : ");
            client.nomEntreprise = scanner.nextLine();

            if (nombreClients < clients.length) {
                 clients[nombreClients] = client;
                 nombreClients++;
                 System.out.println("Nouveau client enregistré dans la base.");
            }else {
                System.out.println("Attention : base de clients pleine, ce client ne sera pas enregistré.");
            }

       }

        Chambre chambreChoisie = null;
        while (chambreChoisie == null) {
            System.out.print("Numéro de chambre (ex : A1, B2, C3...) : ");
            String numeroChambre = scanner.nextLine();

            chambreChoisie = trouverChambreParNumero(numeroChambre);

            if (chambreChoisie == null) {
                System.out.println("Cette chambre n'existe pas. Réessaie.");
            } else if (!chambreChoisie.estDisponible) {
                System.out.println("Cette chambre n'est pas disponible. Choisis une autre.");
                chambreChoisie = null;
            }
        }

        Reservation reservation = new Reservation();
        reservation.client = client;
        reservation.numeroChambre = chambreChoisie.numero;

        System.out.print("Date d'entrée (ex : 2024-04-01) : ");
        reservation.dateEntree = scanner.nextLine();

        System.out.print("Date de sortie (ex : 2024-04-03) : ");
        reservation.dateSortie = scanner.nextLine();

        System.out.print("Date de réservation (ex : 2024-03-25) : ");
        reservation.dateReservation = scanner.nextLine();

        System.out.print("Nombre de nuitées : ");
        reservation.nombreNuitees = Integer.parseInt(scanner.nextLine());

        // Calcul automatique du montant
        reservation.montantChambre = chambreChoisie.prixParNuit * reservation.nombreNuitees;
        System.out.println("Montant calculé : " + reservation.montantChambre);

        System.out.print("Observation : ");
        reservation.observation = scanner.nextLine();

        System.out.print("Nom du réceptionniste : ");
        reservation.receptionniste = scanner.nextLine();

        if (nombreReservations < reservations.length) {
            reservations[nombreReservations] = reservation;
            nombreReservations++;
            System.out.println("Réservation créée avec succès.");
            chambreChoisie.estDisponible = false;
        } else {
            System.out.println("Impossible d'enregistrer plus de réservations.");
        }
    }

    static void annulerReservation(Scanner scanner) {
        if (nombreReservations == 0) {
            System.out.println("Aucune réservation à annuler.");
            return;
        }

        System.out.print("Entrez le numéro de chambre de la réservation à annuler : ");
        String numeroChambre = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < nombreReservations; i++) {
            if (reservations[i].numeroChambre.equalsIgnoreCase(numeroChambre)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Aucune réservation trouvée pour cette chambre.");
            return;
        }

        Chambre chambre = trouverChambreParNumero(numeroChambre);
        if (chambre != null) {
            chambre.estDisponible = true;
        }

        // Décaler les réservations pour combler le trou
        for (int i = index; i < nombreReservations - 1; i++) {
            reservations[i] = reservations[i + 1];
        }
        reservations[nombreReservations - 1] = null;
        nombreReservations--;

        System.out.println("Réservation annulée et chambre libérée.");
    }

    static void creerClient(Scanner scanner) {
        System.out.println("=== Créer un client ===");

        Client client = new Client();

        System.out.print("Nom du client : ");
        client.nom = scanner.nextLine();

        System.out.print("Téléphone du client : ");
        client.telephone = scanner.nextLine();

        System.out.print("Entreprise du client (laisser vide si particulier) : ");
        client.nomEntreprise = scanner.nextLine();

        if (nombreClients < clients.length) {
            clients[nombreClients] = client;
            nombreClients++;
            System.out.println("Client créé et enregistré.");
        } else {
            System.out.println("Impossible d'enregistrer plus de clients.");
        }
    }

    static Client trouverClientParTelephone(String telephone) {
        for (int i = 0; i < nombreClients; i++) {
            if (clients[i].telephone.equals(telephone)) {
                return clients[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        initialiserChambres();
        Scanner scanner = new Scanner(System.in);

        boolean continuer = true;

        while (continuer) {
            System.out.println("=== Gestion d'hôtel Complexe Oule ===");
            System.out.println("1. Lister les chambres");
            System.out.println("2. Créer un client");
            System.out.println("3. Créer une réservation");
            System.out.println("4. Lister les client");
            System.out.println("5. Lister les réservations");
            System.out.println("6. Annuler une réservation");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix == 1) {
                System.out.println("=== Liste des chambres ===");
                for (int i = 0; i < chambres.length; i++) {
                    chambres[i].afficherInfos();
                    System.out.println();
                }
            } else if (choix == 2) {
                creerClient(scanner);
            } else if (choix == 3 ){
                creerReservation(scanner);
            } else if (choix == 4) {
                if(nombreClients == 0){
                    System.out.println("Aucun client enregistré.");
                }else {
                    System.out.println("=== Liste des clients ===");
                    for(int i = 0 ; i < nombreClients ; i++){
                        clients[i].afficherInfos();
                        System.out.println();
                    }
                }
            } else if (choix == 5) {
                if (nombreReservations == 0) {
                    System.out.println("Aucune réservation trouvée.");
                } else {
                    System.out.println("=== Liste des réservations ===");
                    for (int i = 0; i < nombreReservations; i++) {
                        reservations[i].afficherInfos();
                        System.out.println();
                    }
                }
            } else if (choix == 6) {
                annulerReservation(scanner);
            } else if (choix == 7) {
                continuer = false;
                System.out.println("Au revoir !");
            } else {
                System.out.println("Choix invalide.");
            }

            System.out.println();
        }

        scanner.close();
    }
}