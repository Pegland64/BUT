/**
 * Classe CorpsRevolution
 */

 public class CorpsRevolution extends CorpsCeleste {
    // Attiribut de l'objet CorpsRevolution
    double rayonOrbital;
    CorpsCeleste centreRevolution;
  
    /**
     * Méthode rendreRayonOrbital
     * 
     * @return r double du rayonOrbital du Corps Revolution
     */
  
    public double rendreRayonOrbital() {
      return this.rayonOrbital;
    }
  
    /**
     * Méthode donnerClasseCorps
     * 
     * @return Chaine de la classe du corps
     */
  
    public String donnerNomClasseCorps() {
      return "Corps Revolution";
    }
  
    /**
     * Constructeur de l'objet CorpsRevolution
     * 
     * @param ro double qui représente le rayon orbital du corps en révolution
     *
     * @param cc CorpsCeleste autour duquel le corps est en révolution
     *
     * @param n  Chaine du nom du corps en révolution
     *
     * @param r  double du Rayon du corps en révolution
     *
     * @param m  double de la masse du corps en révolution
     */
  
    public CorpsRevolution( String n, double r, double m,CorpsCeleste cc,double ro) {
      super(n, r, m);
      this.rayonOrbital = ro;
      this.centreRevolution = cc;
    }
  
    /**
     * Méthode tourneAutourDe
     * 
     * @return centreRevolution le corps autour duquel tourne Le corps en révolution
     */
  
    public CorpsCeleste tourneAutourDe() {
      return this.centreRevolution;
    }
  
    /**
     * Methode toString
     *
     * @return affichage la chaine d'affichage de l'objet CorpsRevolution
     */
    public String toString() {
      String affichage = super.toString();
      affichage += "effectue des révolutions à une distance de : " + this.rayonOrbital + " millions de kilomètres";
      affichage += "\nautour du corps céleste : " + this.tourneAutourDe().rendreNom();
      affichage += ", qui est un corps de type " + this.tourneAutourDe().donnerNomClasseCorps() + "\n----------------";
      return affichage;
    }
  
  }