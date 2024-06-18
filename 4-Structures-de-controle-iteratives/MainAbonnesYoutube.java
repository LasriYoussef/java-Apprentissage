// Abonné.e.s Youtube 4.1
// Objectif : Un Youtubeur compte 2500 abonné.e.s sur sa chaîne. Son contenu de qualité lui fait gagner 5% d'abonné.e.s en plus tous les mois.

// L'algorithme à écrire doit pouvoir faire une estimation des abonnés dans 24 mois.

// Ecrivez deux algorithmes : un utilisant une boucle "while", un autre utilisant une boucle "for".

public class MainAbonnesYoutube {

    public static void main(String[] args) {
        estimationAboDeuxAns();

    }

    public static void estimationAboDeuxAns() {
        int nbAbo = 2500;
        int nbMois = 24;
        int i = 0;

        // // //*for (int i = 0; i < nbMois; i++);{
        // // nbMois += nbMnbMois * 0.05; */
        // }


        while (i < nbMois){
            nbAbo += nbAbo * 0.05;
            i++;
        }
       

        System.out.println("--> Le total d'abonnees est de 2500 + 5% chaque mois\n");
        System.out.println("--> le calcul se fait sur 24 mois\n");

    }

}
