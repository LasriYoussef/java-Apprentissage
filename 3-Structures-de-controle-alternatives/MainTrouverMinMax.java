// Min-max 3.3

// Ecrire un algorithme permettant de trouver le maximum et le minimum entre trois nombres. Les résultats devront être stocké dans 2 variables {min, max} puis affichés.

// Les nombres seront stockées dans 3 variables : var1, var2, var3

// Il vous faudra utiliser une série de if pour écrire votre algorithme.

import java.util.Scanner;

public class MainTrouverMinMax {
    // Fonction principale du programme
    public static void main(String[] args) {
        System.out.println("Trouver le minimum et le maximum!"); // Display the string.
            Scanner scanner = new Scanner(System.in);
        findMinMax(20, 35, 2);
        scanner.close();

    }

    /** Ma fonction me permet de trouver le minimun et le maximun des 3 variables */

    public static void findMinMax(int var1, int var2, int var3) {

        if (var1 > var2 && var1 > var3) {
            int max = var1;
            System.out.println("--> la valeur max est " + max);
            // le calcul me permet de detrminer le maximun qui sera le var1
        } else if (var2 > var1 && var2 > var3) {
            int max = var2;
            System.out.println("--> la valeur max est " + max);
            // le calcul me permet de detrminer le maximun qui sera le var2
        } else if (var3 > var1 && var3 > var2) {
            int max = var3;
            System.out.println("--> la valeur max est " + max);
            // le calcul me permet de detrminer le maximun qui sera le var3
        }
        if (var1 < var2 && var1 < var3) {
            int min = var1;
            System.out.println("--> la valeur minimum est" + min);
            // le calcul me permet de detrminer le minimum qui sera le var1
        } else if (var2 < var1 && var2 < var3) {
            int min = var2;
            System.out.println("--> la valeur mininum est" + min);
            // le calcul me permet de detrminer le minimum qui sera le var2
        } else if (var3 < var1 && var3 < var2) {
            int min = var3;
            System.out.println("--> la valeur minimum est " + min);
            // le calcul me permet de detrminer le minimum qui sera le var3

        }

    }

}
