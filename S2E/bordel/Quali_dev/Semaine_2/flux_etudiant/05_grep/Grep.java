import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
    /** Nom du fichier a ouvrir. */
    private String nomFichier;

    /** Mot recherche. */
    private String motCherche;

    /** BufferedReader correspondant a nomfich. */
    private BufferedReader src;


    /**
     * Constructeur de la classe Grep. Initialise certains attributs,
     * ouvre le fichier et crée le BufferedReader correspondant
     *
     * @param nom nom du fichier a lire
     * @param mot mot recherche dans le fichier
     * @exception FileNotFoundException fichier non trouvé
     *
     **/
    public Grep(String nom, String mot)throws FileNotFoundException{
        this.nomFichier = nom;
        this.motCherche = mot;
        src = new BufferedReader(new FileReader(this.nomFichier));
    }

    /**
     * methode traiterFichier qui traite le fichier
     * - lit les lignes une par une et les numerote
     * - si le mot est présent dans la ligne en cours
     *      - affiche le fichier traité
     *      - affiche le numero de ligne
     *      - affiche le caractère ou se trouve le mot
     *      - affiche la ligne elle-meme
     *  @exception IOException erreur de lecture
     */
    public void traiterFichier()throws IOException{
    String ligne = this.src.readLine();
    int numLigne = 1;
    while(ligne != null){
        int indice = ligne.indexOf(this.motCherche);
        if(indice != -1){
            System.out.println(src.toString() + " ( " + numLigne + " , " + ligne.indexOf(motCherche) + " ) " + ligne);
        }
        numLigne++;
        ligne = this.src.readLine();
       }
    }
    

    /**
     * la methode close ferme le BufferedReader correspondant 
     * au fichier.
     **/
    
    public void close(){
        this.close();
    }
    /*****************************************************
     * Gestion du lancement / partie Main
     * Methodes statiques
     *****************************************************/

    /**
     * la methode statique lireFichier
     * - cree un objet Grep à partir d'un nom de fichier et du mot recherché
     * - utilise cet objet Grep pour parcourir le fichier et réaliser les impressions demandées
     * - ne pas oublier de fermer le flux
     * Cette méthode doit signaler les noms de fichier inexistants
     *
     * @param nom nom du fichier à analyser
     * @param mot mot recherche
     * @exception IOException exception liée aux entrées/sorties
     */
    public static void lireFichier(String nom, String mot)throws IOException{
        try{
            Grep g = new Grep(nom,mot);
            g.traiterFichier();
            g.close();
        }catch(FileNotFoundException e){
            System.out.println("marche pas");
        }
    }


    /**
     * Methode statique main.
     * - analyse la ligne de commande (variable args)
     * - appelle la methode litFichier sur chacun des noms de fichiers fournis en argument.
     *
     * @param args ligne de commandes
     */

     public static void main(String [] args) throws IOException{
        if(args.length<2){
            System.out.println("nan");
            System.exit(1);
        }
        String mot = args[0];
        
     }
}
