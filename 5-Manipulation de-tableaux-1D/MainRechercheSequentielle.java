// Recherche séquentielle 5.2

// Objectif : Parcourir un tableau d'entiers positifs séquentiellement pour retrouver un élément n.

// Il vous est demandé d'écrire 3 versions de cet algorithme en utilisant chacune des boucles suivantes : "for", "while", "do...while".

// Données d'entrée :

// un tableau de n entiers positifs
// un élément value entier positif à rechercher dans le tableau
// Données de sortie :

// l'index de la valeur retrouvée
// Détails d'implementation pour Java (Click me!)
// L'utilisation de tableaux en Java est détaillé par le cours disponible [ici](https://koor.fr/Java/Tutorial/java_tableaux.wp).

import java.util.Scanner;
// Cela nous permet d'integrer au code un langage precis "Scanner" qui commence par "import" + le type "java.util.Scanner"

public class MainRechercheSequentielle {
    // Nom de la classe
    public static void main(String[] args) {
        // main appelle a la fonction (String "objet" "chaine de caractere et une suite
        // ou une sequence de caractere")
        Scanner scanner = new Scanner(System.in);
        // Ouverture d'un Scanner et on donne un nom au scanner pour l'example "scanner"
        // = "new Scanner(System.in)"
        int[] tableau = { 1, 2, 3, 4, 5 };
        int valeurUtilisateur = 5;
        // La nous donnons des valeurs a la fonction qui peut etre apeller "donnees en
        // dur"
        valeurUtilisateur = scanner.nextInt();
        // On precise que le scanner doit renvoyer a la ligne le type de caractere "Int"
        // (le nom du scanner"scanner.nextInt)

        sequentielleFor(tableau, valeurUtilisateur);
        // On defini et atribue dans le main la fonction qui nous permettra de commencer
        // le codage
        sequentielleWhile(tableau, valeurUtilisateur);
        sequentielleDoWhile(tableau, valeurUtilisateur);
        scanner.close();
        // Nous permet de dire au code que le scanner se ferme "scanner.close();"

    }

    public static int sequentielleFor(int[] array, int valeur) {

        for (int i = 0; i < array.length; i++) {

            if (valeur == array[i]) {
                System.out.println("--> Voici les valeurs du tableau: " + valeur);
                return i;
            }
            System.out.println(i);
        }
        return -1;

    }

    public static int sequentielleWhile(int[] array, int valeur) {
        int i = 0;
        while (i < array.length) {
            if (valeur == array[i]) {
                System.out.println("--> Voici les valeurs du tableau: " + valeur);
                return i;
            }
            i++;
        }
        return -1;

    }

    public static int sequentielleDoWhile(int[] array, int valeur) {
        int i = 0;
        do {
            System.out.println("--> Voici les valeurs du tableau:" + valeur);
            i++;
        } while (i < array.length);
        return i;
    }
}

// int i = -1;
// for (i = 0; i < array.length; i++) {
// if (array[i] == valeur) {
// test = true;
// index = i; // Mettre à jour l'index lorsque la valeur est trouvée
// break;
// i = 0;
// while (i < array.length) {
// valeur = array[i];
// System.out.println("--> Voici les valeurs du tableau: " + valeur);
// return i;
// }
// i++;

// }

// return -1;
// i = 0;
// do {
// System.out.println("--> Voici les valeurs du tableau:" + valeur);
// i++;
// } while (i < array.length);