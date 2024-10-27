/** 
 * Classe Test pour le TD/TP Corps Celeste
 * L'objectif de cette classe est de tester vos classes. 
 * CE FICHIER NE DOIT PAS ETRE MODIFIE !!!
 * La librairie test utilisee ici est celle utilisee en S1.
*/
import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;


public class TestGlobalCorpsCeleste {

	public  void testGlobal(){ 
			CorpsCeleste[] sysSol=new CorpsCeleste[4];
			sysSol[0] = new Etoile("Soleil",695000,1.989e27,6273);
			sysSol[1] = new Planete("Terre",6318.14,5.976e+21,sysSol[0],149.6);
			sysSol[2] = new Planete("Mars",3397.2,6.421e20,sysSol[0],227.94);
			sysSol[3] = new Satellite("Lune",1737.4,7.349e19,sysSol[1],0.3844);

		
			assertEquals("Val. nom est fausse", "Lune", sysSol[3].rendreNom());
			assertEquals("Val. nom est fausse", "Terre",sysSol[1].rendreNom());
			
			assertEquals("Val. nom_classe_corps est fausse", "Etoile",sysSol[0].donnerNomClasseCorps());
			assertEquals("Val. nom_classe_corps est fausse", "Planete",sysSol[1].donnerNomClasseCorps());
			assertEquals("Val. nom_classe_corps est fausse", "Satellite",sysSol[3].donnerNomClasseCorps());
			
			assertEquals("Val. instanceof est fausse", true, sysSol[0] instanceof Etoile);
			assertEquals("Val. instanceof est fausse", true, sysSol[2] instanceof Planete);
			assertEquals("Val. instanceof est fausse", true, sysSol[3] instanceof Satellite);
			assertEquals("Val. instanceof est fausse", true, sysSol[2] instanceof CorpsCeleste);
			assertEquals("Val. instanceof est fausse", true, sysSol[2] instanceof CorpsRevolution);
			assertEquals("Val. instanceof est fausse", true, sysSol[3] instanceof CorpsCeleste);
			assertEquals("Val. instanceof est fausse", true, sysSol[3] instanceof CorpsRevolution);
			assertEquals("Val. instanceof est fausse", true, sysSol[0] instanceof CorpsCeleste);
			assertEquals("Val. instanceof est fausse", false,sysSol[0] instanceof CorpsRevolution);
			
			assertEquals("Val. avoirMemeSoleil est fausse", true,((Planete)(sysSol[1])).avoirMemeSoleil((Planete)sysSol[2]));
			
			double densite= 3345;
			assertEquals("Val. densite est fausse",densite ,Math.rint(sysSol[3].calculerDensite()));
			
			
			double energie = 171; 
			assertEquals("Val. energie est fausse",energie ,
					Math.rint(((Etoile)sysSol[0]).
					calculerEnergieRecue(((CorpsRevolution)sysSol[2]).
					rendreRayonOrbital())*1000));
			
	    }
	
	
	public static void main(String[] args) {
		lancer(new TestGlobalCorpsCeleste(),args);  
	}

}
