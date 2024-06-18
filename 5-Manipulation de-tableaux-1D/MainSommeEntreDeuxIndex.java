// // Somme entre deux index 5.3

// // Objectif : Additionner les valeurs des éléments d'un tableau d'entiers entre les index i et j. Avec l'élément indexé par i compris et celui indexé par j exclu de la somme.

// // Exemple : Soit le tableau [4, 6, 2, 2], la somme obtenue avec i = 1 et j = 3 est 8.

// // ⁉ À faire : Il vous faudra écrire une fonction qui prendra en paramètre (équivalent des données d'entrée) i et j.

// // ⁉ Question : Quelles sont les données d'entrées ?

// // ⁉ Question : Quelles sont les variables à utiliser ?

// // 🤔 Pour faire chauffer ses méninges : Comment pré-calculer un autre tableau contenant les résultats partiels des additions ? (attention, question pas si anodine, demandez à votre formateur•ice des informations si vous bloquez).

import java.util.Scanner;

public class MainSommeEntreDeuxIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tableaui = { 4, 6, 2, 2 };
        int[] tableauj = { 3, 8 };

  

        sommeIndexi();
        sommeIndexj();
        scanner.close();
    }

    public static int sommeIndexi(int[] array, int tableaui, int tableauj) {
        int somme = 0;
        for (int k = tableaui; k < tableauj; k++) {

        }
        return somme;
    }

}
