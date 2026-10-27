package complexite;

/**
 *
 * @author Faustin PADINGANYI
 */
public class OdeN {
    public void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
        }
    }
    void pairs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[i] + ", " + arr[j]);
        }
    }
    }
    
    int rechercheBinaire(int[] arr, int cible) {
    int gauche = 0, droite = arr.length - 1;
    while (gauche <= droite) {
        int milieu = (gauche + droite) / 2;
        if (arr[milieu] == cible) return milieu;
        if (arr[milieu] < cible) gauche = milieu + 1;
        else droite = milieu - 1;
    }
    return -1;
    }

}