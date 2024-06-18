// Vérification de solde d'un compte bancaire 3.5

// Objectif : Écrire un algorithme permettant d'indiquer à l'utilisateur s'il a assez d'argent sur son compte pour acheter un article.

// Phases de l'algorithme :

// le programme demande d'entrer le solde bancaire de l'utilisateur
// le programme demande à l'utilisateur d'entrer le prix du produit qui l'intéresse
// le programme indique s'il est posible ou non d'acheter le produit avec le solde disponible et indique la somme restante après achat. Attention, aucun découvert n'est autorisé sur le compte.
// Donnée d'entrée :

// aucune (toutes les informations seront saisies par l'utilisateur)
// Donnée de sortie :

// aucune (seul un affichage du résultat est attendu)
// Note : Réfléchissez aux variables à utiliser ainsi qu'à leur nom pour stocker les données nécessaires à l'écriture de votre logique.

import java.util.Scanner;

public class MainCompteBancaire {
    // Fonction principale du programme
    public static void main(String[] args) { 
        // public static void main(String[] args) { Donne l'information de la base de notre code "cad la magniere de codage" 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solde du compte");
        System.out.println("Prix du produit");
        // Va permettre à l'utilisateur de faire une saisie et donner les infos
        
        int solde = Integer.parseInt(scanner.nextLine());
        int prix = Integer.parseInt(scanner.nextLine());
        // Nous permettra de declarer l'integrale du solde et du prix
        soldebancaire(solde, prix);
        // Nous precise le int du solde et prix

        scanner.close();
    }

    public static void soldebancaire(int solde, int prix) {
        // On calcul le solde du client et savoir combien il lui reste
        int restant = solde - prix;

        // si le solde solde est superieur ou egal au prix
        if (solde >= prix) {
            System.out.println(" --> le solde est suffisant pour l'achat, solde restant " + restant + " euros ");
        }
        // Sinon si le solde est insuffisant
        else {
            System.out.println(" --> Le solde est insuffisant pour l'achat, il vous manque " + restant + " euros ");
        }

    }
}