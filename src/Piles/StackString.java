package Piles;

import java.util.Stack;

/**
 * Classe représentant une pile de chaînes de caractères.
 * @author Faustin PADINGANYI
 */
public class StackString {
    Stack<String> stack;
    public StackString() {
        // Initialisation de la pile avec une taille donnée
        stack = new Stack<>();
    }
    /**
     * Retire et retourne l'élément en haut de la pile.
     * @return l'élément en haut de la pile
     */
    public String pop() {
        if (isEmpty())
            throw new IllegalStateException("La pile est vide");
        return stack.pop();
    }
    /**
     * Ajoute un élément au sommet de la pile.
     * @param s l'élément à ajouter
     */
    public void push(String s) {
        stack.push(s);
    }
    /**
     * Retourne l'élément en haut de la pile sans le retirer.
     * @return l'élément en haut de la pile
     */
    public String peek() {
        if (isEmpty())
            throw new IllegalStateException("La pile est vide");
        return stack.peek();
    }
    /**
     * Vérifie si la pile est vide.
     * @return true si la pile est vide, false sinon
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
