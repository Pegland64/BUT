public class Principale {
    public static void main(String[] args){
        // Création des corps célestes
        Etoile soleil = new Etoile("Soleil",695000,1.989e27,6273);
		Planete terre = new Planete("Terre",6318.14,5.976e+21,soleil,149.6);
		Planete mars = new Planete("Mars",3397.2,6.421e20,soleil,227.94);
		Satellite lune = new Satellite("Lune",1737.4,7.349e19,terre,0.3844);
        // Insertion des objets dans un tableau de corps célestes
        CorpsCeleste[] systeme={soleil,terre,mars,lune};
        

        // Affichage des caractéristiques de chaque corps
        System.out.println("Caractéristiques des corps célestes :\n###############################\n\n");
        for (CorpsCeleste c : systeme) {
            System.out.println(c);
            // Affichage des planètes dans le même système de chaque planète
            if (c instanceof Planete) {
                Planete p1=(Planete) c;
                System.out.print("Énergie reçu par la planète "+p1.rendreNom());
                Etoile e1=(Etoile) p1.tourneAutourDe();
                System.out.println(" : "+e1.calculerEnergieRecue(p1.rendreRayonOrbital()));
                System.out.println("Planètes dans le même système que la planète " + p1.rendreNom() + " : ");
                for (CorpsCeleste c2 : systeme) {
                    if(c2 instanceof Planete){
                        Planete p2=(Planete) c2;
                        if (!p2.rendreNom().equals(p1.rendreNom()) && p1.avoirMemeSoleil(p2))
                            System.out.println(p2.rendreNom());
                    }
                }
            }
        }
    }
}
