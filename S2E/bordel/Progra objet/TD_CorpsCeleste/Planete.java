public class Planete extends CorpsRevolution{
/**
      * Constructeur de l'objet Planete
      * 
      * @param ro double qui représente le rayon orbital de la planete
      *
      * @param cc CorpsCeleste autour duquel le corps est en révolution
      *
      * @param n Chaine du nom de la planete
      *
      * @param r double du Rayon de la planete
      *
      * @param m double de la masse de la planete
      */
      
      public Planete(String n, double r,double m,CorpsCeleste cc,double ro){
        super(n,r,m,cc,ro);
      }
     
     /**
      * Méthode avoirMemeSoleil
      * 
      * @param p Planete avec la quelle on compare notre planète
      * 
      * @return Boolean vrai si la p a le meme soleil
      */
 
     public boolean avoirMemeSoleil(Planete p){
         return this.tourneAutourDe().donnerNomClasseCorps().equals(p.tourneAutourDe().donnerNomClasseCorps());
     }
 
     /**
      * Méthode donnerNomClasseCorps
      * 
      * @return "Planète"
      */
     public String donnerNomClasseCorps(){
       return "Planete";
     }
}
