// Calcul et condition 3.2

// Ecrire une fonction nommée customNumberDisplay qui prend en paramètre deux nombre entiers et qui affiche :

// la somme des deux nombres si celle-ci (la somme) est supérieure à 100
// la multiplication des deux nombres si leur somme est inférieure à 100
import java.util.Scanner;

public class MainCalculCondition {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rentre deux chiffres"); // Display the string.

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        customNumberDisplay(num1, num2);
        scanner.close();
    }

    /** Ma fonction me permet les deux sommes une inferieur et une superieur */

    public static void customNumberDisplay(int num1, int num2) {
        int sommeresult = num1 + num2;
        // int multiresult = num1 * num2;

        // **On defini la somme des deux nombres (superieur et inferieur)

        if (sommeresult > 100) {
            System.out.println("--> la somme est superieur a 100 " + sommeresult);
            // le calcul est fait en additionnant le num1 + num2

        } else if (sommeresult < 100) {
            System.out.println("--> la somme est inferieur a 100 " + num1 * num2);
            // le calcul est fait en multipliant le num1 * num2

        }

    }
}// Fin de classe
