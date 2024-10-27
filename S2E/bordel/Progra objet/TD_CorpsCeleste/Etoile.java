/**
 * Classe Etoile
 */
public class Etoile extends CorpsCeleste {
	/**
	 * Attribut de l'objet Etoile
	 */
	private double temperature; // temperature en Kelvin(K)
	public final static double k = 1.414213; // k une constante de proportionnamité temprature/energie

	/**
	 * Constructeur de Etoile
	 *
	 * @param r double
	 *
	 * @param m double
	 *
	 * @param t double
	 */

	public Etoile(String nom, double r, double m, double t) {
		super(nom, r, m);
		if (t > 0)
			this.temperature = t;
		else
			this.temperature = 0;
	}

	public String donnerNomClasseCorps() {
		return "Etoile";
	}

	/**
	 * Méthode calculerEnergieRecu
	 * 
	 * @param d
	 * 
	 * @return energieRecu double de l'énergie reçu
	 */
	public double calculerEnergieRecue(double d) {
		double energieRecu = 0;
		if (d > 0)
			energieRecu = (k * this.temperature) / (Math.pow(d, 2));
		return energieRecu;
	}

	public String toString() {
		String affichage = super.toString();
		affichage += ", de température de surface : " + this.temperature + " degré K\n###################";
		return affichage;
	}
}