import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * classe de test
 *
 * _ATTENTION_ : necessite les fichiers textes suivants: 
 * - fichier1.txt => 6 lignes
 * - fichier2.txt => 8 lignes
 * - fichier3.txt => 7 lignes
 */
public class FichierTest {

	/**
	 * test avec trois fichiers existants
	 */
	public void test_01_Moyenne_ok() throws PasDeFichierException {
		// avec fichier1, fichier2, fichier3
		Fichier fichier = new Fichier();
		String[] fichiers={"fichier1.txt","fichier2.txt","fichier3.txt"};

		double resultat = fichier.calculerMoyenneLignes(fichiers);
		assertEquals("les trois fichiers sont bien considérés",6.0, resultat);
	}

	/**
	 * test avec deux fichiers existants
	 */
	public void test_02_Moyenne_2fichiers() throws PasDeFichierException {
		// avec fichier1, fichier2
		Fichier fichier = new Fichier();
		String[] fichiers={"fichier1.txt","fichier2.txt"};

		double resultat = fichier.calculerMoyenneLignes(fichiers);
		assertEquals("les deux fichiers sont bien considérés",7.0, resultat);
	}

	/**
	 * test avec un fichier existant
	 */
	public void test_03_Moyenne_1fichier() throws PasDeFichierException {
		// avec fichier1
		Fichier fichier = new Fichier();
		String[] fichiers={"fichier1.txt"};

		double resultat = fichier.calculerMoyenneLignes(fichiers);
		assertEquals("seul fichier 1 est considéré",6.0, resultat);
	}

	/**
	 * test avec un fichier existant et un inexistant
	 */
	public void test_04_Moyenne_1fichierInexistant() throws PasDeFichierException {
		// avec fichier1, fichierInconnu
		Fichier fichier = new Fichier();
		String[] fichiers={"fichier1.txt","fichierInconnu.txt"};

        	double resultat = fichier.calculerMoyenneLignes(fichiers);
		assertEquals("seul fichier 1 est considéré",6.0, resultat);
	}

	/**
	 * test avec deux fichiers existants et deux inexistants
	 */
	public void test_05_Moyenne_2fichierInexistant() throws PasDeFichierException {
		// avec fichier1, fichierInconnu, fichier2, fichierInconnu2
		Fichier fichier = new Fichier();
		String[] fichiers={"fichier1.txt","fichierInconnu.txt","fichier2.txt", "fichierInconnu3.txt"};

               double resultat = fichier.calculerMoyenneLignes(fichiers);
		assertEquals("seul fichier 1 et 2 sont considérés",7.0, resultat);
	}
	
	/**
	 * test avec deux fichiers inexistants
	 */
	public void test_06_Moyenne_QueFichierInexistant() throws PasDeFichierException {
		// avec fichierInconnu et fichierInconnu2
		Fichier fichier = new Fichier();
		String[] fichiers={"fichierInconnu.txt","fichierInconnu3.txt"};

		boolean exception = false;
 		try{
		  double resultat = fichier.calculerMoyenneLignes(fichiers);
		}
		catch(PasDeFichierException e){
		  exception = true;
		}
                assertEquals("pas de fichier valide -> une exception devrait etre levee", true, exception);
	}


	/**
	 *  test sans fichier
	 */
	public void test_07_Moyenne_0fichier() throws PasDeFichierException {
		// sans fichier
		Fichier fichier = new Fichier();
		String[] fichiers={};

                boolean exception = false;
 		try{
		  double resultat = fichier.calculerMoyenneLignes(fichiers);
		}
		catch(PasDeFichierException e){
		  exception = true;
		}
                assertEquals("une exception devrait etre levee", true,exception);
	}

	
	

	/**
	 * main qui lance les tests
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new FichierTest(), args);
	}
}
