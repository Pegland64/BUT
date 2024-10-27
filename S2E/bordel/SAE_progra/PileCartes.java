/**
 * Classe qui represente une pile de carte
 */
public class PileCartes {
    

    private boolean croissant;
    private PaquetCartes paquet;

    /**
     * Constructeur par defaut
     * @param pCroissant indique si la pile est croissante ou decroissante
     */
    public PileCartes(boolean pCroissant){
        // declaration d'une carte c
        Carte c;
        // verification de la valeur de pCroissant afin dire si la pile est croissante ou decroissante
        if(pCroissant){
            //la pile est croissante 
            this.croissant=true;
            // creation d'une carte a la valeur 1 carte la pile croissante doit commencer avec la carte de valeur 1
            c = new Carte(1);
        }else{
            // la pile est decroissante
            this.croissant = false;
            // creation d'une carte de valeur max par defaut donc 100 carte ma pile decroissante doit commancer avec la valeur maximale
            c = new Carte(100);
        }
        // creation d'un tableau de carte avec une seule carte
        Carte [] tab = new Carte[1];
        // assigniation de la carte cree au tableau 
        tab[0]=c;
        // initialisation du paquet de carte avec le tableau cree
        this.paquet = new PaquetCartes(tab);
    }

    /**
     * Constructeur de la classe PileCartes avec valeur maximal specifie
     * @param pCroissant boolean qui indique si la pile est croissante (true) ou decroissante (false)
     * @param max entier qui indique la valeur maximale pour la carte
     */
    public PileCartes(boolean pCroissant, int max){
        // declaration d'une carte c
        Carte c;
        // verification de la valeur de pCroissant afin dire si la pile est croissante ou decroissante
        if(pCroissant){
            //la pile est croissante 
            this.croissant=true;
            // creation d'une carte a la valeur 1 carte la pile croissante doit commencer avec la carte de valeur 1
            c = new Carte(1);
        }else{
            // la pile est decroissante
            this.croissant = false;
            // creation d'une carte de valeur max carte ma pile decroissante doit commencer avec la valeur maximale
            c = new Carte(max);
        }
        // creation d'un tableau de carte avec une seule carte
        Carte [] tab = new Carte[1];
        // assigniation de la carte cree au tableau 
        tab[0]=c;
        // initialisation du paquet de carte avec le tableau cree
        this.paquet = new PaquetCartes(tab);
    }

    /**
     * methode qui verifie si un carte peut etre posee sur la pile regarder
     * @param c Carte a verifier
     * @return true si la carte est posable, false sinon
     */
    public boolean etrePosable(Carte c){
        // initialise la variable b a false
        boolean b = false;
        // verifie que la pile soit croissante ou decroissante
        //pile croissante
        if(this.croissant == true){
            // verifie si la valeur de la carte c est strictement superieur a la valeur de la derniere carte de la pile
            // ou si la valeur de la carte c a une difference d'exctement 10 avec la derniere carte de la pile
            if(c.etrePlusGrand(paquet.getDerniereCarte()) || (c.etrePlusGrand(paquet.getDerniereCarte()) && this.paquet.getDerniereCarte().avoirDiffDe10(c))){
                // la carte peut etre pose sur la pile croissante
                b = true;
            }
      //pile decroissante
      }else{
            // verifie si la valeur de la carte c est strictement inferieur a la valeur de la denriere carte de la pile
            // ou si la valeur de la carte c a une difference egale a 10 avec la derniere carte de la pile
            if(paquet.getDerniereCarte().etrePlusGrand(c) || (paquet.getDerniereCarte().etrePlusGrand(c) && this.paquet.getDerniereCarte().avoirDiffDe10(c))){
                // la carte peut etre pose sur la pile decroissante
                b = true;
            }
        }
        // retourne la valeur de b (true si la carte est posable false sinon)
        return b;
    }

    /**
     * Pose une carte sur la pile si elle est posable
     * @param c Carte a poser
     * @return true si la carte a ete pose, false sinon
     */
    public boolean poserCarte(Carte c){
        // initialise la variable b a false
        boolean b=false;
        // verifie si la carte c peut etre pose sur la pile
        if (this.etrePosable(c)){
            // ajoute la carte c a la fin du paquet
            this.paquet.ajouterCarteFin(c);
            // met a jour b 
            b= true;
        }
        return b;
    }

    /**
     * representation textuelle de la pile de carte
     * @return chaine de caractere sous la forme "c-c15-(4)" pour une pile croissant avec pour derniere carte c15 et que la pile contient 4 carte
     */
    public String toString(){
        String p;
        if(this.croissant){
            p = "c-"+ this.paquet.getDerniereCarte() +"-("+this.paquet.getNbCartes()+")";
        }else{
            p = "d-"+ this.paquet.getDerniereCarte() +"-("+this.paquet.getNbCartes()+")";
        }
        return p;
    }

    /**
     * methode afin d'obtenir la deniere carte de la pile
     * @return derniere carte de la pile
     */
    public Carte getDerniereCarte(){
        return this.paquet.getDerniereCarte();
    }
}
