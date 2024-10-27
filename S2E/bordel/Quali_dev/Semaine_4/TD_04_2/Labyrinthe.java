public class Labyrinthe {
    private static final char MUR = 'X';
    private static final char PJ = 'P';
    private static final char SORTIE = 'S';
    private static final char VIDE = '.';
    private static final String HAUT = "haut";
    private static final String BAS = "bas";
    private static final String GAUCHE = "gauche";
    private static final String DROITE = "droite";
    private boolean[][] murs;
    private Personnage personnage;
    private Sortie sortie;  
    
    public Labyrinthe(){
        this.murs = new boolean[10][10];
        this.personnage = new Personnage();
        this.sortie = new Sortie();
    }

    

}