package listesChainees;

import java.util.*;
/**
 *
 * @author Faustin PADINGANYI
 */
public class Main {
    public static void main(String[] args) {
        // Test de la LinkedListString
        LinkedListString liste = new LinkedListString();
        // Ajout d'éléments à la liste
        liste.ajouterFin("Padinganyi Tshiombela Faustin");
        liste.ajouterFin("Bula Sombe Héritier");
        // Ajout d'un élément au début de la liste
        liste.ajouterDebut("Kalimasi Makulia Auguy");
        liste.ajouterFin("Mbuyi Debhernyx");
        liste.ajouterDebut("Nkiwa Monkila Jonathan");
        // Recherche d'éléments dans la liste);
        System.out.println(Arrays.toString(liste.convertirEnTableau()));
        System.out.println("Index de 'Bula Sombe Héritier': " + liste.trouverIndex("Bula Sombe Héritier"));
        // Vérification de l'existence d'un élément
        System.out.println("L'élément 'Kalimasi Makulia Auguy' existe-t-il? " + liste.elementExiste("Kalimasi Makulia Auguy")); 
        // Suppression du premier élément
        liste.supprimerPremier();
        // Affichage de l'index après suppression
        System.out.println("Index de 'Kalimasi Makulia Auguy' après suppression: " + liste.trouverIndex("Kalimasi Makulia Auguy"));
        // Vérification de l'existence après suppression
        System.out.println("L'élément 'Kalimasi Makulia Auguy' existe-t-il après suppression? " + liste.elementExiste("Kalimasi Makulia Auguy"));
        //suppression de dernier élément
        liste.supprimerDernier();
        System.out.println("Index de 'Mbuyi Debhernyx' après suppression: " + liste.trouverIndex("Mbuyi Debhernyx"));
        System.out.println("L'élément 'Mbuyi Debhernyx' existe-t-il après suppression? " + liste.elementExiste("Mbuyi Debhernyx"));
        //taille de la liste
        System.out.println("Taille de la liste: " + liste.obtenirTaille());
        //convertion en tableau
        System.out.println(Arrays.toString(liste.convertirEnTableau()));
        // Fin du test
    }
}
