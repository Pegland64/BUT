import java.util.*;

public class Annuaire2{
	
	private Map<String,String> hmap;

	public Annuaire2(){
		hmap = new HashMap<String,String>();
	}
	
    public void domaine() {
       Set<String> ks = hmap.keySet();
       for(String s:ks){
           System.out.print(s+" ");
       }
       System.out.println("");
    }
    
    public void domaine2() {
		Set<String> ks = hmap.keySet();
		Iterator it = ks.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("");
    }
    
    public void affiche() {
        Set<String> ks = hmap.keySet();
        for(String s:ks){
            System.out.print(s+" : ");
            System.out.println(hmap.get(s));
        }
        System.out.println("");
     }
    
    public String acces(String nom) {
        String rep = null;
        rep = hmap.get(nom);
        return rep;
    }
    
    public void adjonction(String nom, String numero) {
          if (!hmap.containsKey(nom)){
        	  	hmap.put(nom, numero);
          }
    }
    
    public void suppression(String nom) {
           hmap.remove(nom);
    }
    
    public void changement(String nom, String numero) {
          if (hmap.containsKey(nom)){
        	  	hmap.put(nom, numero);
          }
    }

	@Override
	public String toString() {
		return "Annuaire2 [hmap=" + hmap + "]";
	}

}
