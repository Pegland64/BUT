import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

/**
 * permet de tester annuaire
 */
public class TestListe{

  /**
   * tests de presence dans la liste
   */
  public void test_00_presence_OK(){
    // creation annuaire
    Annuaire annuaire = new Annuaire();

    // ajout de données de test
    annuaire.ajouter("Alfred","Dupont");
    annuaire.ajouter("Bertrand","Meunier");
    annuaire.ajouter("Claude","Breton");
    annuaire.ajouter("Delphine","Breton");

    // verification de la présence
    boolean test;
    test = annuaire.etrePresent("Alfred","Dupont");
    assertEquals("Alfred devrait etre présent",true,test);

    // verification de la présence en fin de liste
    test = annuaire.etrePresent("Delphine","Breton");
    assertEquals("Delphine devrait etre présente",true,test);
  }

  /**
   * tests de presence dans la liste
   */
  public void test_01_presence_absent(){
    // creation annuaire
    Annuaire annuaire = new Annuaire();

    // ajout de données de test
    annuaire.ajouter("Alfred","Dupont");
    annuaire.ajouter("Bertrand","Meunier");
    annuaire.ajouter("Claude","Breton");
    annuaire.ajouter("Delphine","Breton");

    // verification de l'absence'
    boolean test;
    test = annuaire.etrePresent("Oscar","Dupont");
    assertEquals("Oscar devrait etre absent",false,test);
  }


  /**
	 * main qui lance les tests
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		lancer(new TestListe(), args);
	}
}
