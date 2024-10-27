import java.util.*;

public class Annuaire {
    private ArrayList <Personne> personnes;

    public Annuaire() {
        this.personnes = new ArrayList<Personne>();
    }

    public void ajouter(String prenom, String nom) {
        this.personnes.add(new Personne(prenom, nom));
    }

    public String toString() {
        String result = "";
        for ( Personne p : personnes) {
            result +=  "(" + p.nom + " " + p.prenom + ")\n";
        }
        return result;
    }

    /**public boolean etrePresent(String prenom, String nom) {
        for ( Personne p : personnes) {
            if (p.nom.equals(nom) && p.prenom.equals(prenom)) {
                return true;
            }
        }
        return false;
    }**/

    public boolean etrePresent(String prenom, String nom) {
        return personnes.contains(new Personne(prenom, nom));
    }

    public void tri(){
        Collections.sort(this.personnes);
    }

}
