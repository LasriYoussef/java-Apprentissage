// import java.time.Year;
// import java.util.Scanner;

// // Structure de contrôle alternative 3.6

// // Objectif : Écrire un algorithme permettant de calculer un taux de
// participation employeur aux prix des repas (en pourcentage du prix du repas).

// // Les règles métier sont les suivantes pour le calcul du taux de
// participation :

// // si l’employé·e est célibataire, le taux initial de participation s’élève à
// 20%.
// // dans les autres cas (marié, veuf ou pacsé), son taux initial de
// participation est porté à 25%.
// // La participation est majorée de 15 % supplémentaire par enfant.

// // Si le salaire mensuel de l’employé•e est inférieur à 1 800 €, le montant
// de la participation est majoré de 10%.

// // Le taux de participation reste toutefois plafonné à 50%.

// // L'algorithme devra proposer à l'utilisateur d'entrer les différentes
// informations nécessaires au calcul du taux de participation. Il n'y a donc
// pas nécessité, dans un premier, d'utiliser des données d'entrée.

// // Quelles sont les données de sortie de l'algorithme ?

// // Quelles sont les variables à utiliser ?

// // Quelles sont les constantes à utiliser ?

// // Écrire l'algorithme.

// // Une fois la première version de l'algorithme écrit, modifiez l'algorithme
// pour que l'utilisateur ne soit pas obligé de relance le programme dès qu'il
// veut saisir des informations concernant un employé.

// // Il vous faut faire en sorte d'ajouter une boucle qui s'arrêtera lorsque
// l'utilisateur saisit la lettre N à la question : "Voulez-vous saisir les
// informations concernant un autre employé ?".

// // Ci-dessous un exemple d'échange en console :
// // --- Saisie d'informations sur l'employé ---
// // État matrimonial (C pour célibataire, A pour autre situation) : C
// // Nombre d'enfants à charge : 0
// // Salaire mensuel : 1400
// // Le taux de participation est de 30%.
// // Souhaitez-vous effectuer le calcul pour un autre employé ? N

// public class MainTauxparticipation {
// // Fonction principale du programme
// // Voir pourquoi le "public static void main(char statut, int enfant, int
// salaire) "{ est ecrit de cette maniere comprendre pourquoi
// // Scanner = l'utilisateur rentre des caracteres "Systme.in"

// public static void main(char statut, int enfant, int salaire) {
// // le type donne est le double car il nous affichera des nombres à virgule
// flotante
// // "double taux" nous affiche le pourcentage a appliquer qui est de 20% si
// l'employe est celibataire ou 25% si marie pacse ou veuf
// double tauxC = 20;
// double tauxA = 25;
// // "final double tauxMax" nous determinemontre que le taux reste plafonne a
// 50%
// final double tauxMax = 50; }

// }

// for (int i = 0; i < enfant; i++) {
// // Le type for nous permet de concatener ou bien de donner la somme par
// rapport au nombre d'enfants
// taux += taux * 0.15;
// // L'instruction qu'on lui donne est que si "if" le taux est superieur '>' le
// tauxMax o

// Scanner scanner = new Scanner(System.in);

import java.util.Scanner;

public class MainTauxparticipation {
    // Class du programme
    public static void main(String[] args) {
        // Declaration de la fonctionMain
        String reponseMaritale = demandeMarital();
        calculTaux(reponseMaritale);

    }

    public static Scanner scanner = new Scanner(System.in);

    public static String demandeMarital() {
        // La fonction qui demande a l'utilisateur la situation maritale

        System.out.println(" --> Quelle est votre situation martitale ");

        String reponse = scanner.nextLine();

        System.out.println(reponse);

        return reponse;

    }

    public static int calculTaux(String reponse) {

        int taux = 0;
        if (reponse.equals("c")) {
            taux = 20;
        } else if (reponse.equals("a")) {
            taux = 25;

        }
        System.out.println(" --> Combien avez-vous d'enfants ? ");
        int nbEnfant = 0;
        nbEnfant = scanner.nextInt();

        taux = nbEnfant * 15 + taux;
        System.out.println(taux);

        System.out.println("--> Quelle est votre salaire ? ");
        int salaireMensuel = 0;
        salaireMensuel = scanner.nextInt();

        if (salaireMensuel < 1800) {
            taux = 10 + taux;
        }
        System.out.println(taux);

        if (taux > 50) {
            taux = 50;
        }
        System.out.println(taux);

        return taux;

    }

}