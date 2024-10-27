import static libtest.Lanceur.*;
import static libtest.OutilTest.*;

public class TestTemps {

/**
* main qui lance les tests
*
* @param args
*/
public static void main(String[] args) {
lancer(new TestTemps(), args);
}

/**
* TEEEEEEEEEEST constru
*/
	public void test_constructeur() {
	try{
	Temps t = new Temps(1,2,3);
	assertEquals("secondes : 1 minutes : 2 heures : 3", t.toString());
	}catch(TempsException e){
		fail("exception levee");
	}
}
/**
* test constructeur seconde
*/
	public void test_constructeur2() {
		try{
		Temps t = new Temps(3663);
		assertEquals("secondes : 3 minutes : 1 heures : 1", t.toString());
		}catch(TempsException e){
			fail("exception levee");
		}
	}
/**
* TEST trad
*/
	public void test_traduireEnSecondes() {
	try{
		Temps t = new Temps(3, 2, 1);
		assertEquals(3723, t.traduireEnSecondes());
		}catch(TempsException e){
			fail("exception levee");
		}
	}
/**
* TEEEEEEEEEEEEEEEEEEEEEEEEEEEEST durée jusqu'a
*/
	public void test_dureeJusquA() {
		try {
		Temps t1 = new Temps(1, 2, 3);
		Temps t2 = new Temps(1, 1, 3);
		Temps t3 = t1.dureeJusquA(t2);
		assertEquals("secondes : 0 minutes : 1 heures : 0", t3.toString());
		} catch (TempsException e) {
			fail("exception levee");
		}
	}


	public void test_dureeJusquA_exception() {
	try {
		Temps t1 = new Temps(1, 2, 3);
		Temps t2 = new Temps(1, 3, 3);
		Temps t3 = t1.dureeJusquA(t2);
		fail("exception non levee");
		} catch (TempsException e2) {
			assertEquals("vous etes hors des secondes", e2.getMessage());
		}
	}
/**
* test toString
*/
public void test_toString() {
	try{
	Temps t = new Temps(1, 2, 3);
	assertEquals("secondes : 1 minutes : 2 heures : 3", t.toString());
		}catch(TempsException e1){
			fail("exception levee");
		}
	}

}