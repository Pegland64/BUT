/**
 * creation classe carte a pour objectif de representer une carte du jeu 'The Game'
 */
public class Carte{
    /**
     * parametre valeur conrrespond a la valeur de la carte
     */
    private int valeur;

    /**
     * constructeur d'un carte de valeur v
     * @param v int correspondant a la valeur de la carte qui doit se situe entre 2 et 99
     */
    public Carte(int v){
        //* verifie que la valeur de la carte positif et superieur a 0
        if (v <= 0) v = 1; 

        this.valeur=v;
    }

    /**
     * retourne la valeur de la carte
     * @return un int correspondant a la valeur de la carte
     */
    public int getValeur(){
        return this.valeur;
    }
    
    /**
     * methode toString
     * @return une chaine contenant la valeur de la carte precedee de la lettre 'c' 
     */
    public String toString(){
        return ("c"+this.valeur);
    }
    
    /**
     * methode qui prend en parametre une autre carte et retourne true si la carte regarder est plus grande que la carte mise en parametre ou false sinon
     * @param c parametre correspondant a la carte que l'on va comparer avec la carte regarder
     * @return true si et seulement si la carte regarde est plus grande que la carte passee en parametre faux sinon
     */
    public boolean etrePlusGrand(Carte c){
        // comparaison directe des valeur et retour du resultat
        return this.valeur > c.getValeur();
    }

    /**
     * methode qui prend une autre carte en parametre et qui retourne true ou false si il y a une difference de 10 entre les deux
     * @param c parametre correspondant a la carte que l'on va comparer avec la carte regarder
     * @return true si et seulement si la carte regarder a une difference d'exactement 10 (dans un sens ou dans l'autre) avec la carte passee en parametre.
     */
    public boolean avoirDiffDe10(Carte c){
        //* initialisation d'un boolean b qui sera le return de la fonction
        boolean b = false;

        //* on verifie ici la valeur absolue en fesant le carre de (la valeur regarder - la valeur comparer) sois egale a 10*10 donc = a 100  
        if((this.valeur-c.getValeur())*(this.valeur-c.getValeur()) == 100){
            b = true;
        }
        return b;
    }
}