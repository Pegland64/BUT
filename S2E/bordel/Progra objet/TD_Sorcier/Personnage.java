/**
 * @author Ilan
 */

public abstract class Personnage implements Victime{
    private String nom;
    private int pv;
// constructeur personnage
    public Personnage(String n, int p){
        if (p>0){
            this.pv = p;
        }
        this.nom = n;
    }
// getters de nom
    public String getNom(){
        String p = "ce personnage n'a pas de nom";
        if (this.nom != null){
            p = this.nom;
        }
        return p;
    }
// renvoie un boolean qui dit si le personnage est mort
    public boolean etreMort(){
        boolean b = false;
        if (this.pv <= 0){
            b=true;
        }
        return b;
    }
// getter du nombre de point de vie
    public int getVie(){
        return this.pv;
    }
// permet d'ajouter le nombre de point de vie indiquer
    public void ajouterVie(int num){
        this.pv = this.pv + num;
    }
// methodes a precisé dans les classes suivantes
    public abstract void attaquer(Personnage p);

    public abstract int subirFrappe(int coup);

    public abstract int subirCharme(int coup);
// tostring permettant de renvoyé une phrase precise lors du print
    public String toString(){
        String p = ("je m'appelle "+ this.nom + " et j'ai " + this.pv + " points de vie.");
        if (this.etreMort()){
            p = this.nom + " est mort.";
        }
        return p;
    }
}
