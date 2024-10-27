public abstract class GenererDocument{
    /*
     * class GenererDocument
     * 
     *  toutes les methodes en abstract sont créer dans TexteDocument et HTMLDocument
     */
    public abstract void genererEnTete(ContenuTexte a);
    // entete du document
    public void genererCorps(ContenuTexte a){
        System.out.println(a.getCorps());
    }
    //milieu du document
    public abstract void genererFooter(ContenuTexte a);
    // bas du document
    public final void genererDocument(ContenuTexte a){
        this.genererEnTete(a);
        this.genererCorps(a);
        this.genererFooter(a);
    }
    //création du document en entier avec les 3 methodes ci dessus
}
