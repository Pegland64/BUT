public class Sorcier extends Personnage {
    // pouvoir permettant de calculer la vrai puissance d'un sorcier
    private double pouvoir;

//constructeur d'un sorcier
    public Sorcier(String nom, int pv){
        super(nom, pv);
        pouvoir = Math.random();
    }
// attque d'un sorcier
    public void attaquer(Personnage p){
        if(!this.etreMort()){
            int blessure = p.subirCharme(this.getVie()/2);
            this.ajouterVie(blessure);
        }
    }
//comment il subit les degats d'un monstre
    public int subirFrappe(int coup){
        int blessure = (int)(this.getVie()*this.pouvoir);
        this.ajouterVie(-coup);
        return blessure;
    }
//comment il subit les degats d'un sorcier
    public int subirCharme(int coup){
        return 0;
    }
}
