/**
 * @author Ilan
 */
public class Monstre extends Personnage{
// constructeur d'un monstre
    public Monstre(String nom, int pv){
        super(nom, pv);
    }
// attaque d'un monstre
    public void attaquer(Personnage p){
        if(!this.etreMort()){
            int blessure = p.subirFrappe(this.getVie()/2);
            this.ajouterVie(-blessure);
        }
    }
//comment il subit les degats d'un monstre
    public int subirFrappe(int coup){
        int blessure = this.getVie()/2;
        this.ajouterVie(-blessure);
        return blessure;
    }
//comment il subit les degats d'un sorcier
    public int subirCharme(int coup){
        int blessure = this.getVie()/2;
        this.ajouterVie(-coup);
        return blessure;
    }
}
