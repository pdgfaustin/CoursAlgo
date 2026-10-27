package Files;

/**
 * Classe représentant une file de chaînes de caractères.
 * @author Faustin PADINGANYI
 */
public class QueString {
    // Initialisation de la file avec une taille donnée
    private String[] elements;
    // Indices pour le début et la fin de la file
    private int index;
    /**
     * Constructeur pour initialiser la file avec une taille donnée.
     * @param size la taille de la file
     */
    public QueString(int size) {
        elements = new String[size];
        index = 0;
    }
    /**
     * Ajoute une chaîne de caractères à la fin de la file.
     * @param s la chaîne de caractères à ajouter
     */
    public void enqueue(String s) {
        if (index == elements.length) {
            throw new IllegalStateException("La file est pleine");
        }
        elements[index++] = s;
        }
        // Retire et retourne la chaîne de caractères au début de la file.
    public String dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        String element = elements[0];
        for (int i = 0; i < index - 1; i++) {
            elements[i] = elements[i + 1];
        }
        index--;
        return element;
        }
        // Retourne la chaîne de caractères au début de la file sans la retirer.
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La file est vide");
        }
        return elements[0];
        }
        // Vérifie si la file est vide.
    public boolean isEmpty() {
        return index == 0;
        }
        // Vérifie si la file est pleine.
    public boolean isFull() {
        return index == elements.length;
        }
    }