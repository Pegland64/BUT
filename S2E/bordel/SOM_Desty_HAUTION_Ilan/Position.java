import java.lang.Math;

/***********************************
 * @author SOM Desty, HAUTION Ilan *
 ***********************************/

 public class Position{
    /**
     * Attributs de Position
     */

    private int[] coordonnees;

    /**
     * Constructeur de Position
     */
    public Position(){
        this.coordonnees=new int[]{(int)(Math.random()*10),(int)(Math.random()*10)};
    }

    /**
     * Constructeur de Position
     */
    public Position(int x,int y){
        this.coordonnees=new int[]{x,y};
    }

    /**
     * Getter de l'attribut x de Position
     */
    public int getX(){
        return this.coordonnees[0];
    }

    
    /**
     * Getter de l'attribut y de Position
     */
    public int getY(){
        return this.coordonnees[1];
    }

    public int[] getPosition(){
        return this.coordonnees;
    }

    /**
     * Méthode memePosition
     * 
     * @param p Position avec laquelle on veut comparer les coordonnees de la position
     * 
     * @return memesCoordonnees Booleen qui vaut true si les 2 positions sont les memes
     */

    public boolean memePosition(Position p){
        boolean memesCoordonnees=false;
        if(p!=null){
            if(this.coordonnees[0]==p.getX() && this.coordonnees[1]==p.getY())
                memesCoordonnees=true;
        }
        return memesCoordonnees;
    }   

    
 }