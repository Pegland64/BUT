import static libtest.Lanceur.lancer;
import static libtest.OutilTest.*;

public class TestJeu {

    /**
     * lancement des tests
     */
    public static void main(String args[])
    {
        lancer(new TestJeu(),args);
    }

    /**
     * Test constructeur avec max specifie
     */
    public void test1_constructeurAvecMax(){
        // initialisation d'un jeu avec une valeur max specifie
        Jeu j = new Jeu(10);
        // verification du bon fonctionnement
        assertEquals("La pioche doit contenir 10 cartes", 10, j.getPioche().getNbCartes());
    }
    
}
