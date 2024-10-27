/***********************************
 * @author SOM Desty, HAUTION Ilan *
 ***********************************/
import java.io.*; 

public class Labyrinthe {
    // Constantes du labyrinthe
    private static final char MUR = 'X';
    private static final char PJ = 'P';
    private static final char SORTIE = 'S';
    private static final char VIDE = '.';
    private static final String HAUT = "haut";
    private static final String BAS = "bas";
    private static final String GAUCHE = "gauche";
    private static final String DROITE = "droite";

    /** 
     * Attribut du labyrinthe
     * */ 
    private boolean[][] murs;
    private Personnage personnage;
    private Sortie sortie;  
    

    /**
     * Constructeur de l'objet Labyrinthe
     */
    public Labyrinthe(){
        this.murs = new boolean[10][10];
        this.personnage = new Personnage();
        this.sortie = new Sortie();
    }

    /**
     * Méthode getChar
     * @param x
     * @param y
     * @return contenu Char correspondant au contenu de la case
     */
    public char getChar(int x,int y){
        char contenu=VIDE;
        if (this.personnage.memePosition(new Position(x,y)))
            contenu=PJ;
        else if (this.sortie.memePosition(new Position(x,y)))
            contenu=SORTIE;
        else if(this.murs[x][y])
            contenu=MUR;

        return contenu;

    }

    /**
     * Méthode getSuivant
     * @param x
     * @param y
     * @param direction
     * @return suivant int[] 
     * @throws ErreurAction
     */
    public int[] getSuivant(int x, int y, String direction)throws ActionInconnueException{
        int w,z;
        switch (direction) {
            case GAUCHE:
                z=y-1;
                break;
            case DROITE:
                z=y+1;
                break;
            case HAUT:
                w=x-1;
                break;
            case BAS:
                w=x+1;
                break;
            default:
                throw new ActionInconnueException(direction);
                break;
        }
        int[] suivant ={w,z};
        return suivant;
    }

    /**
     * Méthode deplacerPerso
     * @param direction
     * @return void 
     * @throws ErreurAction
     */
    public void deplacerPerso(String direction) throws ActionInconnueException{
        // on fait une boucle qui verifie que la prochaine case n'est pas un mur
        while (this.getChar(this.getSuivant(this.personnage.getX(), this.personnage.getY(), direction)[0], this.getSuivant(this.personnage.getX(), this.personnage.getY(), direction)[1]) != MUR){
            // et si ce n'est pas un mur on lui fait aller dans la direction en créant un nouveau personnage et en lui donnant les coordonnées de la case suivante
            this.personnage= new Personnage(this.getSuivant(this.personnage.getX(), this.personnage.getY(), direction)[0], this.getSuivant(this.personnage.getX(), this.personnage.getY(), direction)[1]);
        }
    }
    /**
     * Méthode toString
     * @return labyrinthe String
     */
    public String toString(){
        String labyrinthe="";
        for (int i=0;i<this.murs[0].length;i++){
            for (int j=0;j<this.murs[1].length;j++){
                labyrinthe+=this.getChar(i,j);
            }
            labyrinthe+="\n";
        }
        return labyrinthe;
    }

    public boolean etrefini(){
        return this.personnage.memePosition(this.sortie);
    }

    public void chargerLabyrinthe(String fichier){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fichier));
            String ligne;
            int i=0;
            while ((ligne = br.readLine()) != null) {
                for (int j=0;j<ligne.length();j++){
                    if (ligne.charAt(j)==MUR)
                        this.murs[i][j]=true;
                    else if (ligne.charAt(j)==PJ)
                        this.personnage=new Personnage(i,j);
                    else if (ligne.charAt(j)==SORTIE)
                        this.sortie=new Sortie(i,j);
                }
                i++;
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}