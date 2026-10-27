package Piles;
import java.util.Stack;

/**
 * Classe pour inverser une chaîne de caractères en utilisant une pile.
 * @author Faustin PADINGANYI
 */
public class ReverseClasse {
    /**
     * Inverser une chaîne de caractères.
     * @param s
     * @return
     */
    public String reverse(String s) {
        // Utilisation d'une pile pour inverser la chaîne
        Stack<Character> stack = new Stack<>();
        // Pousser chaque caractère de la chaîne dans la pile
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        // Construire la chaîne inversée en dépilant les caractères
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
