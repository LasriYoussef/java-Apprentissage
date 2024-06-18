// Factorielle n 4.4
// Objectif: Écrire un algorithme qui calcule la factorielle d'un entier n
//  (notation mathématique : n!
// ).

// n!=1∗2∗3∗...∗n
// Quelle est la données d'entrée ?

// Quelle est la donnée de sortie ?

// Écrire l'algorithme de calcul de la factorielle.
import java.util.Scanner; // Import the Scanner class 

public class MainFactorielleN {

    public static void main(String[] args) {
        System.out.println("--> Rentre ton chiffre");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorielleN(n);
        scanner.close();

    }

    public static void factorielleN(int n) {
        int totalFactorielle = 1;

        for (int i = 1; i <= n; i++) {
            totalFactorielle = totalFactorielle * i;
        }
        System.out.println("--> La factoriel de " + n + " est " + totalFactorielle);
    }

}
