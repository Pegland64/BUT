import java.util.*;

public class AnnuaireComp {

    private Map<Personne,String> hmap;

    public AnnuaireComp(){
        hmap = new HashMap<Personne,String>();
    }

    public void domaine() {
        Set<Personne> ks = hmap.keySet();
        for(Personne s:ks){
            System.out.print(s+" ");
        }
        System.out.println("");
    }

    public void affiche(){
        Set<Personne> ks = hmap.keySet();
        for(Personne s:ks){
            System.out.print(s+" : ");
            System.out.println(hmap.get(s));
        }
        System.out.println("");
    }

    public String acces(String nom, String prenom){
        String rep = null;
        rep = hmap.get(new Personne(nom, prenom));
        return rep;
    }

    public void adjonction(String nom, String prenom, String numero) {
        Personne p = new Personne(nom, prenom);
        if (!hmap.containsKey(p)){
            hmap.put(p, numero);
        }
    }

    public void suppression(String nom, String prenom) {
        hmap.remove(new Personne(nom, prenom));
    }

    public void changement(String nom, String prenom, String numero) {
        Personne p = new Personne(nom, prenom);
        if (hmap.containsKey(p)){
            hmap.put(p, numero);
        }
    }

    @Override
    public String toString() {
        return "AnnuaireComp{" +
                "hmap=" + hmap +
                '}';
    }
}
