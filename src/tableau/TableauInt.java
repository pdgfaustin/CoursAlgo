package tableau;
/**
 *
 * @author Faustin PADINGANYI
 */
public class TableauInt {
    private int[] items;
    private int count;

    public TableauInt(int length) {
        this.items = new int[length];
    }

    // ajouter un entier à la fin du tableau
    public void add(int number) {
        // verifier si le tableau est plein
        if (count == items.length) {
            // creer un nouveau tableau (plus grand)
            int[] newItems = new int[items.length * 2];
            // copier l'ancien tableau vers le nouveau
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // referencer le nouveau tableau
            items = newItems;
        }
        // ajouter l'entier à la fin
        items[count++] = number;
    }

    // supprimer un entier à un index donné
    public void delete(int index) {
        // valider l'index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("invalid index");
        }
        // decaler les entiers
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    // rechercher l'index d'un entier donné
    public int indexOf(int item) {
        // si l'entier existe, on retroune son index
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        // sinon on retourne -1
        return -1;
    }

    // afficher les elements du tableau
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
