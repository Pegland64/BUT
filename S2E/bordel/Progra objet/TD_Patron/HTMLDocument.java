public class HTMLDocument extends GenererDocument{
    /*
     * class HTMLDocument
     */
    public void genererEnTete(ContenuTexte a){
        System.out.println("<html><body>");
        System.out.println("<h1>"+a+"</h1");
    }
    //creation de la tete du texte html
    public void genererCorps(ContenuTexte a){
        System.out.println("<p>");
        super.genererCorps(a);
        System.out.println("<p>");
    }
    //un paragraphe html
    public void genererFooter(ContenuTexte a){
        System.out.println("<h4>"+ a.getAuteur()+"</h4>");
        System.out.println("</body> \n </html>");
    }
    //creation du bas du texte html
}
