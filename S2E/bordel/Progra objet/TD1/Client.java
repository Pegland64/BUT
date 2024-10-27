
public class Client {
    private String nom, prenom;
    public final static int NB_MAX_COMPTES = 10;
    private Comptes [] comptes;
    private int nbcomptes;
    private double impots;
    
    public Client (String n, String p){
        this.nom = n;
        this.prenom = p;
        this.comptes = new Comptes[NB_MAX_COMPTES];
        this.nbcomptes = 0;
        this.impots = -1;
    }

    public void indiquerImpot(double I){
        if (I>=0){
            this.impots = I;
        }else{
            this.impots = -1;
        }
    }
}
