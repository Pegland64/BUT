import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;


/**
 * classe de test qui permet de verifier que la classe Paquet
 * fonctionne correctement
 */
public class TestPaquetCartes {

	/**
	 * methode de lancement des tests
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new TestPaquetCartes(), args);
	}

	/**
	 * test du constructeur vide
	 */
	public void test1_constructeur() {
		// cree un paquet de carte vide
		PaquetCartes paquet = new PaquetCartes();
		// verifie que le nombre de carte dans le paquet est egale a zero
		assertEquals("paquet devrait avoir 0 carte", 0, paquet.getNbCartes());
	}

	/**
	 * test du constructeur parametres
	 */
	public void test2_constructeurParam() {
		// cree un tableau de carte specifie
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
		// cree un paquet de carte avec le tableau cree au dessus
		PaquetCartes paquet = new PaquetCartes(tab);
		// verifie que le nombre de carte dans le paquet est egal a 3
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());
	}


     /**
	 * test getCarte valide
	 */
	public void test3_getCarte_ok() {
		//* cree un tableau de carte specifie
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
		// cree un paquet de carte avec le tableau cree au dessus
		PaquetCartes paquet = new PaquetCartes(tab);
		// verifie que le nombre de carte est egale a 3
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());
		// obtien une carte de paquet par son index
        Carte c = paquet.getCarte(1);
		// verifie que la valeur de la carte obtenue est correcte
		assertEquals("la carte 1 a pour valeur 2", 2, c.getValeur());
	}

	/**
	 * test getCarte avec index hors tableau 
	 */
	public void test4_getCarte_horsTableau() {
		//* cree un tableau de carte specifie
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
		// cree un paquet de carte avec le tableau cree au dessus
		PaquetCartes paquet = new PaquetCartes(tab);
		// verifie que le nombre de cartes dans le paquet est egal a 3
		assertEquals("paquet devrait avoir 3 cartes", 3, paquet.getNbCartes());
		// tente d'obtenir une carte en dehors des limites du tableau 
        Carte c = paquet.getCarte(3);
		// verifie que la methode renvoie null dans ce cas
		assertEquals("la carte 3 n'existe pas", null, c);
	}

	/**
	 * test ajoutCarteFin ok
	 */
	public void test5_ajoutCarteFin() {
		// cree un tableau de carte specifie
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
		// cree un paquet de carte avec ce tableau
		PaquetCartes paquet = new PaquetCartes(tab);
		paquet.ajouterCarteFin(new Carte(4));
		// ajoute une carte suppélmentaire a la fin du paquet
		assertEquals("paquet devrait avoir 4 cartes", 4, paquet.getNbCartes());
		// verifie que les valeurs des cartes dans le paquet sont correcte
        for (int i=0;i<3;i++) {
			Carte c = paquet.getCarte(i);
			assertEquals("la carte "+i+"a pour valeur"+(i+1), i+1, c.getValeur());
		}
	}

	/**
	 * test retirerCarte ok
	 */
	public void test6_retirerCarte() {
		// cree un tableau de carte specifie
		Carte[] tab = new Carte[3];
		tab[0] = new Carte(1);
		tab[1] = new Carte(2);
		tab[2] = new Carte(3);
		//cree un paquet de carte avec ce tableau
		PaquetCartes paquet = new PaquetCartes(tab);
		//retire une carte specifie du paquet
		Carte c = paquet.retirerCarte(1);

		// verifie que le nombre de carte dans le paquet est egal a 2
		assertEquals("paquet devrait avoir 2 cartes", 2, paquet.getNbCartes());
		// verifie que les valeurs des cartes dans le paquet  sont correctes
		assertEquals("premiere carte valeur 1", 1, paquet.getCarte(0).getValeur());
		assertEquals("seconde carte valeur 3", 3, paquet.getCarte(1).getValeur());

		// test carte retournee
		assertEquals("carte retiree a pour valeur 2", 2, c.getValeur());
	}

	/**
	 * Test methode remplir ok
	 */
	public void test7_remplir(){
		// cree un tableau de carte specifie
		Carte[] tab = new Carte[6];
		tab[0] = new Carte(2);
		tab[1] = new Carte(3);
		tab[2] = new Carte(4);
		tab[3] = new Carte(5);
		tab[4] = new Carte(6);
		tab[5] = new Carte(7);
		// cree un paquet de carte avec ce tableau
		PaquetCartes paquet = new PaquetCartes();
		// appelle la methode remplir avec une valeur maximale de 8
		paquet.remplir(8);
		// verifie le nombre de carte dans le paquet
		assertEquals("le paquet doit avoir 6 cartes", 6, paquet.getNbCartes());
		//veri

		// verifie que les cartes sont numerote jusqua 7
		assertEquals("les cartes doivent etre numéroté a partir de 2",2, paquet.getCarte(0).getValeur());
		assertEquals("les cartes doivent etre numéroté jusqu'a 7",7, paquet.getDerniereCarte().getValeur());
	}

	/**
     * Test d'insertion dans un paquet vide.
     */
    public void test8_insererTriPaquetVide() {
        // Crée un paquet vide
        PaquetCartes paquet = new PaquetCartes();
        // Insère une carte dans le paquet
        paquet.insererTri(new Carte(5));

        // Vérifie que le paquet a maintenant une carte et qu'elle est bien la carte insérée
        assertEquals("Le paquet doit avoir 1 carte", 1, paquet.getNbCartes());
        assertEquals("La carte insérée doit être dans le paquet", 5, paquet.getCarte(0).getValeur());
    }

    /**
     * Test d'insertion en fin de paquet.
     */
    public void test10_insererTriFinPaquet() {
        // Crée un paquet vide
        PaquetCartes paquet = new PaquetCartes();
        // Insère une carte de valeur 3
        paquet.insererTri(new Carte(3));
        // Insère une carte de valeur 7
        paquet.insererTri(new Carte(7));

        // Vérifie que les cartes sont insérées à la fin du paquet
        assertEquals("Le paquet doit avoir 2 cartes", 2, paquet.getNbCartes());
        assertEquals("La première carte doit être celle ajoutée initialement", 3, paquet.getCarte(0).getValeur());
        assertEquals("La deuxième carte doit être la carte insérée", 7, paquet.getCarte(1).getValeur());
    }

    /**
     * Test d'insertion au milieu du paquet.
     */
    public void test11_insererTriMilieuPaquet() {
        // Crée un paquet vide
        PaquetCartes paquet = new PaquetCartes();
        // Insère une carte de valeur 6
        paquet.insererTri(new Carte(6));
        // Insère une carte de valeur 4
        paquet.insererTri(new Carte(4));
        // Insère une carte de valeur 5
        paquet.insererTri(new Carte(5));

        // Vérifie que les cartes sont insérées au milieu du paquet
        assertEquals("Le paquet doit avoir 3 cartes", 3, paquet.getNbCartes());
        assertEquals("La première carte doit être la carte insérée", 4, paquet.getCarte(0).getValeur());
        assertEquals("La deuxième carte doit être celle ajoutée initialement", 5, paquet.getCarte(1).getValeur());
        assertEquals("La troisième carte doit être la carte insérée", 6, paquet.getCarte(2).getValeur());
    }

	/**
     * Test de prendreCarteDessus sur un paquet vide.
     */
    public void test12_prendreCarteDessusPaquetVide() {
        // Crée un paquet vide
        PaquetCartes paquet = new PaquetCartes();
        // Appelle la méthode prendreCarteDessus sur le paquet vide
        Carte carte = paquet.prendreCarteDessus();

        // Vérifie que la carte retournée est null
        assertEquals("La carte retournée doit être null", null, carte);
        // Vérifie que le paquet reste vide
        assertEquals("Le paquet doit rester vide", 0, paquet.getNbCartes());
    }

    /**
     * Test de prendreCarteDessus sur un paquet avec une carte.
     */
    public void test13_prendreCarteDessusAvecCarte() {
        // Crée un paquet avec une carte de valeur 3
        PaquetCartes paquet = new PaquetCartes();
        paquet.ajouterCarteFin(new Carte(3));
        // Appelle la méthode prendreCarteDessus sur le paquet avec une carte
        Carte carte = paquet.prendreCarteDessus();

        // Vérifie que la carte retournée a la bonne valeur
        assertEquals("La carte retournée doit avoir la valeur 3", 3, carte.getValeur());
        // Vérifie que le paquet est vide après avoir pris la carte
        assertEquals("Le paquet doit être vide", 0, paquet.getNbCartes());
    }

    /**
     * Test de prendreCarteDessus sur un paquet avec plusieurs cartes.
     */
    public void test14_prendreCarteDessusAvecPlusieursCartes() {
        // Crée un paquet avec trois cartes de valeurs 1, 2, 3
        PaquetCartes paquet = new PaquetCartes();
        paquet.ajouterCarteFin(new Carte(1));
        paquet.ajouterCarteFin(new Carte(2));
        paquet.ajouterCarteFin(new Carte(3));
        // Appelle la méthode prendreCarteDessus sur le paquet avec plusieurs cartes
        Carte carte = paquet.prendreCarteDessus();

        // Vérifie que la carte retournée a la bonne valeur
        assertEquals("La carte retournée doit avoir la valeur 1", 1, carte.getValeur());
        // Vérifie que le paquet a une carte en moins après avoir pris la carte
        assertEquals("Le paquet doit avoir 2 cartes restantes", 2, paquet.getNbCartes());
    }

	/**
     * Test de toString sur un paquet vide.
     */
    public void test14_toStringPaquetVide() {
        // Crée un paquet vide
        PaquetCartes paquet = new PaquetCartes();
        // Appelle la méthode toString sur le paquet vide
        String result = paquet.toString();

        // Vérifie que la chaîne résultante est vide
        assertEquals("La chaîne résultante doit être vide", "", result);
    }

    /**
     * Test de toString sur un paquet avec une carte.
     */
	public void test16_toStringAvecCarte() {
        // Crée un paquet avec une carte de valeur 5
        PaquetCartes paquet = new PaquetCartes();
        paquet.ajouterCarteFin(new Carte(5));
        // Appelle la méthode toString sur le paquet avec une carte
        String result = paquet.toString();

        // Vérifie que la chaîne résultante contient la représentation de la carte
        assertEquals("La chaîne résultante doit contenir '0-c5'", " 0-c5", result);
    }

    /**
     * Test de toString sur un paquet avec plusieurs cartes.
     */
    public void test17_toStringAvecPlusieursCartes() {
        // Crée un paquet avec trois cartes de valeurs 2, 4, 6
        PaquetCartes paquet = new PaquetCartes();
        paquet.ajouterCarteFin(new Carte(2));
        paquet.ajouterCarteFin(new Carte(4));
        paquet.ajouterCarteFin(new Carte(6));
        // Appelle la méthode toString sur le paquet avec plusieurs cartes
        String result = paquet.toString();

        // Vérifie que la chaîne résultante contient les représentations des cartes séparées par des espaces
        assertEquals("La chaîne résultante doit contenir '0-c2 1-c4 2-c6'", " 0-c2 1-c4 2-c6", result);
    }

}
