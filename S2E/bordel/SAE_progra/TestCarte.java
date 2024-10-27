//* importation des librairie de test libtest
import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;

/**
 * nouvelle classe TestCarte afin de tester les methodes et la logique de Carte
 */
public class TestCarte{
    /**
     * Initialisation du main qui lance le TestCarte
     */
    public static void main(String [] args){
        lancer(new TestCarte() , args );
    }
    /**
     * Test du constructeur de base
     */
    public void test1_constructeur(){
        //* creation d'une carte c a la valeur 14
        Carte c = new Carte(14);

        //* verification que celle-ci soit bien egal a 14
        assertEquals("La carte devrait avoir 14 comme valeur", 14, c.getValeur());
    }

    /**
     * Test du constructeur au limite de valeur basse et haute des cartes soit 100>carte.valeur>1
     */
    public void test2_constructeurLimite(){
        //* creation d'une carte c1 a la valeur -1
        Carte c1 = new Carte(-1);

        //* verification du bon fonctionnement de c1 , c2 , quelles ne depasse pas les limites
        assertEquals("La carte a une valeur minimum de 1", 1, c1.getValeur());
    }

    /**
     * Test de la methode getvaleur
     */
    public void test3_getValeur(){
        //* creation d'une carte c de valeur 14
        Carte c = new Carte(14);

        //* verification que la valeur 14 est bien retourner par la methode
        assertEquals("La carte a 14 comme valeur", 14, c.getValeur());
    }

    /**
     * Test de la methode ToString
     */
    public void test4_toString(){
        //* creation de la carte c de valeur 14
        Carte c = new Carte(14);

        //* verification que la methode ToString renvoie bien 'c14'
        assertEquals("Methode to string qui doit etre sous la forme 'c' suivie de la valeur de la carte", "c14", c.toString());
    }

    /**
     * Test de la methode etrePlusGrand fonctionne
     */
    public void test5_etrePlusGrand(){
        //*creation carte c1 de valeur 14
        Carte c1 = new Carte(14);

        //* creation carte c2 de valeur 10
        Carte c2 = new Carte(10);

        //* verification que la methode etreplusgrand renvoie bien le bon boolean
        assertEquals("La carte c1 est plus grande que la carte c2", true, c1.etrePlusGrand(c2));
        assertEquals("La carte c2 est plus petite que la carte c1", false, c2.etrePlusGrand(c1));

    }

    /**
     * Test de la methode avoirDiffDe10 vrai
     */
    public void test6_avoirDiffDe10_Vrai(){
        //* creation carte c1 de valeur 14
        Carte c1 = new Carte(14);

        //* creation de carte c2 de valeur 4
        Carte c2 = new Carte(4);

        //* verification que la methode renvoie bien true car il y a une difference de 10
        
        //*calcul positif
        assertEquals("La carte c1 a 10 de difference avec la carte c2", true, c1.avoirDiffDe10(c2));
        //* calcul negatif
        assertEquals("La carte c2 a 10 de difference avec la carte c1", true, c2.avoirDiffDe10(c1));
    }

    /**
     * Test de la methode avoirDiffDe10 faux
     */
    public void test7_avoirDiffDe10_Faux(){
        //* creation carte c1 de valeur 14
        Carte c1 = new Carte(14);

        //* creation de carte c2 de valeur 10
        Carte c2 = new Carte(10);

        //* verification que la methode renvoie bien false car il y a une difference de 4

        //* calcul positif
        assertEquals("La carte c1 a 4 de difference avec la carte c2", false, c1.avoirDiffDe10(c2));
        //* calcul negatif
        assertEquals("La carte c2 a 4 de difference avec la carte c1", false, c2.avoirDiffDe10(c1));
    }
}

