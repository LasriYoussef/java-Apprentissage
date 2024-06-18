// Fizzbuzz 4.3
// Objectif : Fizzbuzz est issu d'un jeu pour enfants permettant de leur apprendre les divisions. En informatique, cet exercice est utilisé en entretien d'embauche.

// Pour chaque entier allant de 1
//  à n
//  afficher le mot "Fizz" s'il n est divisible par 3 et "Buzz" si n est divisible par 5.

// Afficher le mot "Fizzbuzz" si le nombre est divisilbe par 3 ET par 5.

// Si le nombre n'est divisible ni par 3, ni par 5, il est simplement affiché.

// Indice sur le fonctionnement du modulo : Pour savoir si un nombre est divisible par un autre vous pouvez utiliser l'opérateur modulo.

// L'opérateur modulo permet de trouver le reste d'une division entière, par exemple :

// 10 modulo 5 donne 0 ;
// 3 modulo 2 donne 1 ;
// 4 modulo 2 donne 0.
// Le module est très utilisé pour trouver si un nombre est pair ou impair, par exemple :

// 3 modulo 2 donne 1, le résultat est 1 donc le nommbre est impair ;
// 4 modulo 2 donne 0, le résultat est 0 donc le nombre est pair.
// Pour trouver si un nombre est divisible par un autre vous pouvez utiliser le modulo, par exemple :

// 4 modulo 2 donne 0, le résultat est 0 donc 4 est divisible par 2 ;
// 6 modulo 3 donne 0, le résultat est 0 donc 6 est divisible par 3 ;
// Exemple de l'affichage du programme : Pour n = 5 l'agorithme doit afficher :

// 1
// 2
// Fizz
// 4
// Buzz
// Donnée d'entrée :

// un entier n définissant le nombre d'itérations de la boucle
// Donnée de sortie :

// aucune (affichage uniquement)
// Détails d'implémentation
// L'opérateur modulo est %.

import java.util.Scanner; // Import the Scanner class 

public class MainFizzBuzzGame {

    public static void main(String[] args) {

        System.out.println("--> Rentre ton chiffre");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        saisieUtilisateurs(n);
        scanner.close();

    }

    public static void saisieUtilisateurs(int n) {
        int modulo1 = 3;
        int modulo2 = 5;

        for (int i = 1; i < n +1; i++) {
            if (i % modulo1 == 0 && i % modulo2 == 0) {
                System.out.println("--> FIZZBUZZ");
            } else if (i % modulo2 == 0) {
                System.out.println("--> BUZZ");
            } else if (i % modulo1 == 0) {
                System.out.println("--> FIZZ");
            } else {
                System.out.println("--> " + i);
            }
        }
    }
}