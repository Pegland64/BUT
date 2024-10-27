public class ContenuTexte {
    private String Titre;
    private String Corps;
    private String Auteur;
    /*
     * class ContenuTexte
     */
    // constructeur que l'on verifie au cas ou ce soit vide
    public ContenuTexte(String t, String c, String a){
        if(t != null){
            this.Titre = t;
        }else{
            this.Titre = "sans titre";
        }
        if(c != null){
            this.Corps = c;
        }else{
            this.Corps = "vide";
        }
        if(a != null){
            this.Auteur = a;
        }else{
            this.Auteur = "vide";
        }
    }
    //getters
    public String getTitre(){
        return this.Titre;
    }

    public String getCorps(){
        return this.Corps;
    }

    public String getAuteur(){
        return this.Auteur;
    }
}
