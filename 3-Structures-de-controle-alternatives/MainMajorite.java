import java.util.Scanner;

// Vérification de la majorité 3.1

// Objectif : Écrire un algorithme indiquant à l'utilisateur, en fonction d'une année de naissance saisie s'il est majeur ou mineur.

// Donnée d'entrée :

// aucune (l'information sur l'année de naissance sera saisie par l'utilisateur)
// Donnée de sortie :

// aucune (seul un affichage du résultat est attendu)
// ⁉ Note : Réfléchissez aux variables à utiliser ainsi qu'à leur nom pour stocker les données nécessaires à l'écriture de votre logique.

public class MainMajorite {
    // Fonction principale du programme
    public static void main(String[] args) {
        // Scanner = l'utilisateur rentre des caracteres "Systme.in"
        Scanner scanner = new Scanner(System.in);
        // System.out = des caracteres donnes
        System.out.println("Salut quel est ton age ?");
        // on demande l'age a l'utilisateur avec "int pour des donnees numerique"
        // On declare age est un int "Integer=integral"-""
        int input = scanner.nextInt();
        // int age = Integer.parseInt(scanner.nextLine());
        // On declare que majorite est associe a age
        majorite(input);
        scanner.close();

    } 
    // Test pour la saisie d'une lettre qui affiche une erreur
    // try {
    // int age = Integer.parseInt(input);

    /** Ma fonction nous permet de savoir si la personne est mineur ou majeur */
    public static void majorite(int age) {
        if (age >= 18) {

            System.out.println("--> tu es majeur");

            // si l'age est superieur a 18 ans la personne est majeur

        } else if (age < 18) {

            System.out.println("--> tu es mineur");

            // si la est inferieur a 18 ans la personne est mineur

        }
    }
    
} // fin de la classe
