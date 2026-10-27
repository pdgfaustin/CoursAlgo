package Piles;

import java.util.Stack;

/**
 * Classe principale pour tester l'inversion de chaîne de caractères.
 * @author Faustin PADINGANYI
 */
public class Main {
    public static void main(String[] args) {
        StackString stackString = new StackString();
        stackString.push("Mbikayi Mpanya Jean - Marcel");
        stackString.push("Mohindo Kibwana Innocent");
        stackString.push("Mundadi Filston");
        // Afficher et dépiler les éléments de la pile
        while (!stackString.isEmpty()) {
            System.out.println(stackString.pop());
        }
        //Reajouter des éléments
        stackString.push("Aliango Marachto");
        stackString.push("Byeragi Safiry Georges");
        stackString.push("Montali Olao James");
        //Afficher l'élément au sommet de la pile sans le dépiler
        System.out.println("Element au sommet de la pile: " + stackString.peek());
    }
}
