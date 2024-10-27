import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;


public class TestPileCartes {
       
    public static void main(String args[])
    {
        lancer(new TestPileCartes(),args);
    }

    /**
     * Test de la creation d'une pile croissante pas defaut
     */

    public void test1_ConstructeurParDefautCroissante(){
        // cree une pile croissante par defaut
        PileCartes pileCroissante = new PileCartes(true);
        //verifie que la derniere carte a la valeur attendu
        assertEquals("la derniere carte doit etre egale a 1",1,pileCroissante.getDerniereCarte().getValeur());
    }

    /**
     * Test de la creation d'un pile decroissante par defaut
     */
    public void test2_ConstructeurParDefautDecroissant(){
        // cree une pile decroissante par defaut
        PileCartes pileDecroissante = new PileCartes(false);
        //verifie que la derniere carte a la valeur attendu
        assertEquals("la derniere carte doit etre egale a 100",100,pileDecroissante.getDerniereCarte().getValeur());
    }

    /**
     * Test creation d'une pile croissante avec valeur maximal specifie
     */
    public void test3_ConstructeurMaxCroissant(){
        // cree une pile croissante avec max specifie
        PileCartes pileCroissante = new PileCartes(true,50);
        //verifie que la derniere carte a la valeur attendu
        assertEquals("la derniere carte doit etre egale a 1",1,pileCroissante.getDerniereCarte().getValeur());
    }

    /**
     * Test creation d'une pile croissante avec valeur maximal specifie
     */
    public void test4_ConstructeurMaxDecroissant(){
        // cree une pile decroissante avec max specifie
        PileCartes pileDecroissante = new PileCartes(false,75);
        //verifie que la derniere carte a la valeur attendu
        assertEquals("la derniere carte doit etre egale a 75",75,pileDecroissante.getDerniereCarte().getValeur());
    }

    /**
     * Test pour vérifier si une carte peut être posée sur une pile croissante.
     */
    public void test5_EtrePosableCroissante() {
        // Crée une pile croissante avec une carte de valeur 5
        PileCartes pileCroissante = new PileCartes(true);
        // Carte avec une valeur plus grande que la dernière carte de la pile (5)
        Carte cartePosable = new Carte(10);
        // Vérifie que la carte est posable sur la pile croissante
        assertEquals("La carte doit être posable sur la pile croissante",true, pileCroissante.etrePosable(cartePosable));
    }

    /**
     * Test pour vérifier si une carte ne peut pas être posée sur une pile croissante.
     */
    public void test6_EtrePosableCroissanteFaux() {
        // Crée une pile croissante avec une carte de valeur 8
        PileCartes pileCroissante = new PileCartes(true);
        // Carte avec une valeur moins que la dernière carte de la pile (8)
        Carte carteNonPosable = new Carte(-10);
        // Vérifie que la carte n'est pas posable sur la pile croissante
        assertEquals("La carte ne doit pas être posable sur la pile croissante",false, pileCroissante.etrePosable(carteNonPosable));
    }


    /**
     * Test pour vérifier si une carte peut être posée sur une pile décroissante.
     */
    public void test7_EtrePosableDecroissante() {
        // Crée une pile décroissante avec une carte de valeur 50
        PileCartes pileDecroissante = new PileCartes(false, 50);
        // Carte avec une valeur moins que la dernière carte de la pile (50)
        Carte cartePosable = new Carte(40);
        // Vérifie que la carte est posable sur la pile décroissante
        assertEquals("La carte doit être posable sur la pile décroissante",true, pileDecroissante.etrePosable(cartePosable));
    }

    /**
     * Test pour vérifier si une carte ne peut pas être posée sur une pile décroissante.
     */
    public void test8_EtrePosableDecroissanteFaux() {
        // Crée une pile décroissante avec une carte de valeur 30
        PileCartes pileDecroissante = new PileCartes(false, 30);
        // Carte avec une valeur plus grande que la dernière carte de la pile (30)
        Carte carteNonPosable = new Carte(40);
        // Vérifie que la carte n'est pas posable sur la pile décroissante
        assertEquals("La carte ne doit pas être posable sur la pile décroissante",false, pileDecroissante.etrePosable(carteNonPosable));
    }

    /**
     * Test pour vérifier si une carte peut être correctement posée sur la pile.
     */
    public void test9_PoserCartePosable() {
        // Crée une pile croissante avec une carte de valeur 10
        PileCartes pileCroissante = new PileCartes(true);
        // Carte posable avec une valeur plus grande que la dernière carte de la pile (10)
        Carte cartePosable = new Carte(15);
        // Vérifie que la carte est correctement posée sur la pile croissante
        assertEquals("La carte doit être correctement posée sur la pile",true, pileCroissante.poserCarte(cartePosable));
        // Vérifie que la dernière carte de la pile est la carte posée
        assertEquals("La dernière carte de la pile doit être la carte posée", cartePosable, pileCroissante.getDerniereCarte());
    }

    /**
     * Test pour vérifier si une carte ne peut pas être posée sur la pile.
     */
    public void test10_PoserCarteNonPosable() {
        // Crée une pile décroissante avec une carte de valeur 30
        PileCartes pileDecroissante = new PileCartes(false, 30);
        // Carte non posable avec une valeur moins que la dernière carte de la pile (30)
        Carte cartePoserAvant = new Carte(12);
        pileDecroissante.poserCarte(cartePoserAvant);
        Carte carteNonPosable = new Carte(25);
        // Vérifie que la carte n'est pas posée sur la pile décroissante
        assertEquals("La carte ne doit pas être posée sur la pile",false, pileDecroissante.poserCarte(carteNonPosable));
        // Vérifie que la dernière carte de la pile reste inchangée
        assertEquals("La dernière carte de la pile ne doit pas être la carte non posable", 12, pileDecroissante.getDerniereCarte().getValeur());
    }

    /**
     * Test pour la représentation textuelle de la pile de cartes croissante.
     */
    public void test11_ToStringCroissante() {
        // Crée une pile croissante avec une carte de valeur 20
        PileCartes pileCroissante = new PileCartes(true, 20);
        // Ajoute une carte de valeur 25 à la pile
        pileCroissante.poserCarte(new Carte(25));
        // Vérifie la représentation textuelle attendue de la pile
        assertEquals("La représentation textuelle doit être \"c-25-(2)\"", "c-c25-(2)", pileCroissante.toString());
    }

    /**
     * Test pour la représentation textuelle de la pile de cartes décroissante.
     */
    public void test12_ToStringDecroissante() {
        // Crée une pile décroissante avec une carte de valeur 50
        PileCartes pileDecroissante = new PileCartes(false, 50);
        // Ajoute une carte de valeur 40 à la pile
        pileDecroissante.poserCarte(new Carte(40));
        // Vérifie la représentation textuelle attendue de la pile
        assertEquals("La représentation textuelle doit être \"d-40-(2)\"", "d-c40-(2)", pileDecroissante.toString());
    }

}
 