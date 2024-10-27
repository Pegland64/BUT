/**
 * Classe Satellite
 */

 public class Satellite extends CorpsRevolution{
    
    /**
     * Constructeur de l'objet Satellite
     *
     * @param ro
     *
     * @param cc
     *
     * @param n
     *
     * @param r
     *
     * @param m
     */
 
    public Satellite(String n, double r,double m,CorpsCeleste cc,double ro){
       super(n,r,m,cc,ro);
     }
 
    /**
     * Methode donnerClasseCorps
     *
     * @return Satellite chaine du corps de type Satellite
     */
     public String donnerNomClasseCorps(){
       return("Satellite");
     }
}
