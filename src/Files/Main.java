package Files;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Classe principale pour tester le fonctionnement d'une file.
 * @author Faustin PADINGANYI
 */
public class Main {
    public static void main(String[] args) {
        // Création d'une file de chaînes de caractères avec une capacité de 5
        QueString file = new QueString(5);

        // Ajout d'éléments à la file
        file.enqueue("Premier");
        file.enqueue("Deuxième");
        file.enqueue("Troisième");

        // Affichage de l'élément en tête de la file sans le retirer
        System.out.println("Élément en tête de la file : " + file.peek());

        // Retrait et affichage des éléments de la file
        while (!file.isEmpty()) {
            System.out.println("Élément retiré : " + file.dequeue());
        }

        // Utilisation de la classe Queue de Java pour comparaison
        Queue<String> javaQueue = new ArrayDeque<>(5);
        javaQueue.add("Premier");
        javaQueue.add("Deuxième");
        javaQueue.add("Troisième");

        System.out.println("Élément en tête de la file Java : " + javaQueue.peek());

        while (!javaQueue.isEmpty()) {
            System.out.println("Élément retiré de la file Java : " + javaQueue.poll());
        }
    }
}