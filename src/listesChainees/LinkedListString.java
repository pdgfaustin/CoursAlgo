package listesChainees;
/**
 * @author Faustin PADINGANYI
 */

public class LinkedListString {
    class Noeud {
        private String data;
        private Noeud suivant;

        Noeud(String data) {
            this.data = data;
        }
    }
    private Noeud premier;
    private int taille;
    private Noeud dernier;
    //ajouter un élément à la fin de la liste
    public void ajouterFin(String data) {
        var nouveauNoeud = new Noeud(data);
        if (estVide()) {
            premier = dernier = nouveauNoeud;
        } else {
            dernier.suivant = nouveauNoeud;
            dernier = nouveauNoeud;
        }
        taille++;
    }
    //ajouter un élément au début de la liste
    public void ajouterDebut(String data) {
        var nouveauNoeud = new Noeud(data);
        if (estVide()) {
            premier = dernier = nouveauNoeud;
        } else {
            nouveauNoeud.suivant = premier;
            premier = nouveauNoeud;
        }
        taille++;
    }
    private boolean estVide() {
        return premier == null;
    }
    //trouver l'index d'un élément
    public int trouverIndex(String data) {
        var courant = premier;
        int index = 0;
        while (courant != null) {
            if (courant.data.equals(data)) {
                return index;
            }
            courant = courant.suivant;
            index++;
        }
        return -1; // élément non trouvé
    }
    //trouver un élément à un index donné
    public boolean elementExiste(String data) {
        var courant = premier;
        while (courant != null) {
            if (courant.data.equals(data)) {
                return true;
            }
            courant = courant.suivant;
        }
        return false; // élément non trouvé
    }
    //supprimer un élément
    public void supprimerPremier() {
        if (estVide()) 
            throw new IllegalStateException("La liste est vide");
        if (premier == dernier) {
            premier = dernier = null;
        } else {
            var deuxieme = premier.suivant;
            premier.suivant = null;
            premier = deuxieme;
        }
            taille--;
    }
    //Supprimer le dernier élément
    public void supprimerDernier() {
        if (estVide()) 
            throw new IllegalStateException("La liste est vide");
        if (premier == dernier) {
            premier = dernier = null;
        } else {
            var courant = premier;
            while (courant.suivant != dernier) {
                courant = courant.suivant;
            }
            courant.suivant = null;
            dernier = courant;
        }
        taille--;
    }
    
    //obtenir la taille de la liste
    public int obtenirTaille() {
        return taille;
    }
    //vider la liste
    public void viderListe() {
        premier = dernier = null;
        taille = 0;
    }
    //convertir la liste chaînée en tableau
    public String[] convertirEnTableau() {
        String[] tableau = new String[taille];
        var courant = premier;
        int index = 0;
        while (courant != null) {
            tableau[index++] = courant.data;
            courant = courant.suivant;
        }
        return tableau;
    }
}
