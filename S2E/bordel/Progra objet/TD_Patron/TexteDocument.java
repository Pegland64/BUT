public class TexteDocument extends GenererDocument{
    /*
     * Class TexteDocument
     */
    public void genererEnTete(ContenuTexte a) {
        // creation du bon nombre de tirer
        String t = "";
        for (int i = 0; i<a.getTitre().length(); i++){
            t = t + "-";
        }
        //impression des tirer autour du titre
        System.out.println(t);
        System.out.println(a.getTitre());
        System.out.println(t);
    }

    //mettre trois tirer autour de l'auteur
    public void genererFooter(ContenuTexte a){
        System.out.println("---"+a.getAuteur()+"---");
    }
}
