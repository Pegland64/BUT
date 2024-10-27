import java.util.Scanner;

/**
 * Classe principale pour créer un document
 */
public class CreerDocument{

    /**
     * Methode principale
     */
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
// demande de toutes les information
            System.out.println("Titre du document :");
            String titre = sc.nextLine();
            System.out.println("Nom de l'auteur :");
            String auteur = sc.nextLine();
            System.out.println("Texte du corps du document :");
            String corps = sc.nextLine();
            System.out.println("Type du resultat (texte/html) :");
            String type = sc.nextLine();
            //creation du contenu
            ContenuTexte ct = new ContenuTexte(titre, auteur, corps);
            //si le type est html on créer un docuement avec les methodes de HTMLDocuemnt
        if (type.equals("html")){
            HTMLDocument htmltxt = new HTMLDocument();
            htmltxt.genererDocument(ct);
            System.out.println(htmltxt);
        }else{
            //si le type est texte on créer un document avec les lethodes de texteDocument
        if (type.equals("texte")){
            TexteDocument txttxt = new TexteDocument();
            txttxt.genererDocument(ct);
            System.out.println(txttxt);
        }else{
            //sinon on renvoie une erreur explicite
            System.out.println("erreur veuillez inscire texte/html");
        }
        }
    }
}
