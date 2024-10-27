/**
 * Classe CorpsCeleste
 */

 public class CorpsCeleste {
	/**
	 * Attribut de l'objet CorspCeleste
	 */

	String nom;
	// rayon en km et masse en tonne
	double rayon, masse;

	/**
	 * Constructeur de CorpsCeleste
	 *
	 * @param n chaine qui représente le nom du corps celeste
	 *
	 * @param r double rayon du corps celeste
	 *
	 * @param m double masse du corps celeste
	 */

	public CorpsCeleste(String n, double r, double m) {
		this.nom = n;
		this.rayon = r;
		this.masse = m;
	}

	/**
	 * methode donnerNomClasseCorps
	 *
	 * @return Corps Celeste une chaine qui représente le type de corps de
	 *         CorpsCeleste
	 */

	public String donnerNomClasseCorps() {
		return ("Corps céleste");
	}

	/**
	 * methode calculerDensite
	 *
	 * @return densite double qui représente la densité du corps celeste en fonction
	 *         de sa masse et de son volume
	 */

	public double calculerDensite() {
		// calcule du volume a l'aide des methode de MATH
		double volume = 4.0 / 3.0 * Math.PI * Math.pow(this.rayon*1000, 3);
		return ((this.masse * 1000) / volume);
	}

	/**
	 * methode rendreNom
	 *
	 * @return nom chaine du nom du corps celeste
	 */

	public String rendreNom() {
		return this.nom;
	}

	public String toString() {
		String affichage = this.donnerNomClasseCorps() + " :\nde nom : ";
		affichage += this.rendreNom() + ", de rayon : " + this.rayon + " kilomètres, de masse : " + this.masse;
		affichage += " tonnes, de densité : " + this.calculerDensite() + "kg par m3\n";
		return affichage;
	}

}