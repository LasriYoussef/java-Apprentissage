// Somme des entiers de 0 à n 4.2
// Objectif: Écrire un algorithme permettant d'additionner les entier de 0 à n. L'entier n doit être saisi par l'utilisateur.

// Donnée d'entrée:

// aucune
// Donnée de sortie:

// un entier correspondant à la somme des entiers de 0 à n

import java.util.Scanner;

public class MainSommeEntiersN {
    public static void main(String[] args) {
        saisieUtilisateurs();
    }

    public static void saisieUtilisateurs() {
        Scanner sommeEntier = new Scanner(System.in);

        System.out.println("Rajouter la valeur");
        int n = sommeEntier.nextInt();

        sommeEntier(n);

        sommeEntier.close();}
    public static void sommeEntier(int n) {
        int somme = 0;

        for (int i = 0; i <= n; i++) {
            somme += i;
        }
        System.out.println("--> la somme dess entiers de 0 à " + n + " : " + somme);

    }
}
