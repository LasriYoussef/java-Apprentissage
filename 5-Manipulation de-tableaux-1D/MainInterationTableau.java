// Itération sur un tableau 5.1

// Objectif : Afficher les nombres contenus dans un tableau de réels.

// Données d'entrée :

// un tableau de nombres réels
// Données de sortie :

// auncune
// Jeu de test :

// array = [12.2, 11.3, 4.4, 2.0]
// Détails d'implémentation pour Java (Click me!)
// Un tableau de réels peut être déclaré de la façon suivante (nom de la variable à adapter) : ``` double[] doubleArray = {12.2, 11.3, 4.4, 2.0}; ```

// import java.util.Scanner;

public class MainInterationTableau {

    public static void main(String[] args) {
        double[] array = { 12.2, 11.3, 4.4, 2.0 };
        interationArray(array);

    }

    public static void interationArray(double[] doubleArray) {
        System.out.println("--> Nombres reels affiché dans le tableau");
        for (int i = 0; i<4; i++){
            System.out.println( + doubleArray[i]);

        }

    }

}