import java.util.Scanner;

// Voyelle ou consonne 3.4

// Ecrire une fonction qui prend un caractère en paramètre et qui retourne le caractère V si le caractère est une voyelle et le caractère C s'il s'agit d'une consonne.

public class MainVoyelleConsonne {
    // Fonction principale du programme
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Rentrer votre lettre");

// char voyelle = Integer.parseInt(scanner.nextInt());

        // consonnevoyelle('a');
        // consonnevoyelle('e');
        // consonnevoyelle('i');
        // consonnevoyelle('o');
        // consonnevoyelle('u');
        // consonnevoyelle('y');
        // consonnevoyelle('c');// Test pour la consonne

        scanner.close();// Voir pourquoi la fonction est directement mis dans les RUN
// Voir pourquoi la fonction est directement mis dans les RUN
// Voir pourquoi la fonction est directement mis dans les RUN
// Voir pourquoi la fonction est directement mis dans les RUN
    }

    /**
     * Ma fonction me permet de trouver si mon caractere est une consonne ou voyelle
     */

    public static void consonnevoyelle(char voyelle) {
        // If permet de savoir quelle sont les voyelles " if a, e, i, o, u, y = voyelle"
        if (voyelle == 'a' || voyelle == 'e' || voyelle == 'i' || voyelle == 'o' || voyelle == 'u' || voyelle == 'y') {

            System.out.println("--> Ceci est une voyelle");
        }
        // else permet de determiner que si ce n'est pas une voyelle donc c'est une
        // consonne "else les autres lettres = consonne"
        else {
            System.out.println("--> Ceci est une consonne");
            
        }

    }
}