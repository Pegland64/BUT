
public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annuaire2 annuaire = new Annuaire2();
		
		annuaire.adjonction("Manu", "0607080910");
		annuaire.adjonction("Sophie", "0601020304");
		annuaire.adjonction("Léa", "0700051015");
		annuaire.adjonction("Lucas", "0710090807");
		annuaire.adjonction("Louise", "0609100709");
		
		annuaire.affiche();
		
		System.out.println("Léa : " + annuaire.acces("Léa") + "\n");
		
		annuaire.changement("Lucas", "0710090809");
		annuaire.changement("Manu", "0607080911");
		
		annuaire.affiche();
		
		System.out.println(annuaire);
	}

}
