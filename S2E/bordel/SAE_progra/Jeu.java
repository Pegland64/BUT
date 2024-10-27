import java.util.Scanner;

/**
 * Classe representant un jeu de cartes
 */
public class Jeu {

    private PaquetCartes main;
    private PaquetCartes pioche;
    private PileCartes [] piles;

    /**
     * Constructeur du jeu initialiser avec un maximum specifie
     * @param max entier correspondant a la valeur maximal des cartes
     */
    public Jeu(int max){
        if(max<10) throw new IllegalArgumentException("il n'y a pas assez carte pour quoicoujouer");

        // initialisation de la pioche avec un paquet de carte allant de 1 a max
        this.pioche = new PaquetCartes();
        this.pioche.remplir(max);
        System.out.println(this.pioche.toString());

        // melange aleatoirement le paquet de carte dans la pioche
        this.pioche.melangerPaquet();
        System.out.println(this.pioche.toString());
        // initialisation du tableau de piles de cartes, avec deux piles croissantes et deux piles decroissantes
        this.piles = new PileCartes[4];
        
        this.piles[0] = new PileCartes(true);
        this.piles[1] = new PileCartes(true);
        this.piles[2] = new PileCartes(false, max);
        this.piles[3] = new PileCartes(false, max);
        
        //initialisation de la main du joueur avec les 8 premiere carte de la pioche 
        this.main = new PaquetCartes();
        System.out.println(this.main.toString());

        for(int i = 0; i<=8; i++){
            this.main.insererTri(this.pioche.prendreCarteDessus());
        }
    }

    /**
     * constructeur du jeu avec un paquet de carte donne
     * @param pc Paquet de carte initial
     */
    public Jeu(PaquetCartes pc){
        if(pc.getNbCartes()<=10){
        //initialisation de la pioche avec le paquet de carte donne
        this.pioche = pc;
        //initialisation du tableau de pile de carte avec deux pile croissante et deux pile decroissante
        this.piles = new PileCartes[4];
        this.piles[0] = new PileCartes(true);
        this.piles[1] = new PileCartes(true);
        //verification si cest getnbcarte ou getnbcarte-1 a verifier
        this.piles[2] = new PileCartes(false, pc.getNbCartes());
        this.piles[3] = new PileCartes(false, pc.getNbCartes());
        //initialisation de la main du joueur avec les 8 premieres cartes de la pioches
        this.main = new PaquetCartes();
        for(int i = 0; i<=8; i++){
        this.main.insererTri(this.pioche.prendreCarteDessus());
            }
        }else{
            throw new IllegalArgumentException("il n'y a pas assez carte pour quoicoujouer");
        }
    }

    /**
     * renvoie la main du jouer
     * @return paquet de carte representant la main du joueur
     */
    public PaquetCartes getMain(){
        return this.main;
    }

    /**
     * renvoie la pioche du jeu
     * @return paquet de carte represantant la pioche du jeu
     */
    public PaquetCartes getPioche(){
        return this.pioche;
    }

    /**
     * renvoie les pile du jeu 
     * @return tableau de pilecarte represantant les piles du jeu
     */
    public PileCartes [] getPiles(){
        return this.piles; 
    }

    /**
     * renvoie une representation du jeu en string
     * @return chaine de caractere representant l'etat du jeu
     */
    public String toString(){
        String p;
        p = "- Pile 0 : "+this.piles[0].toString()+"\n";
        p = p+"- Pile 1 : "+this.piles[1].toString()+"\n";
        p = p+"- Pile 2 : "+this.piles[2].toString()+"\n";
        p = p+"- Pile 3 : "+this.piles[3].toString()+"\n";
        p = p+"Il reste "+ this.pioche.getNbCartes()+" cartes dans la pioche"+"\n";
        p = p+"Main du joueur :\n";
        p = p+ this.main.toString();
        return p;
    }

    /**
     * joue une carte depuis la main du joueur sur une pile specifie
     * @param indice indice de la carte dans la main du jouer
     * @param numPile numero de la pile sur laquelle poser la carte
     * @return true si la carte a ete joue false sinon
     */
    public boolean jouerCarte(int indice, int numPile){
        boolean b = false;
        // verifie si la carte de la main peut etre posee sur la pile specifie
        if(this.piles[numPile].etrePosable(this.main.getCarte(indice))){
            //retire la carte de la main et la pose sur la pile
            this.piles[numPile].poserCarte(this.main.retirerCarte(indice));
            b = true;
        }
        return b;
    }
    
    /**
     * verifie si le jeu est termine
     * @return -1 si le joueur a perdu 0 si le jeu n'est pas termine 1si le jouerur a gane
     */
    public int etreFini(){
        int a = 0;
        // verifie si la main du joueur et la pioche sont vide
        if(this.main.etreVide() && this.pioche.etreVide()){
            a = 1; // le joueur a gagne
        }else{
            boolean b=false;
            // parcourt les carte de la main et tente de les jouer sur la pile
            for(int i = 0; i<this.main.getNbCartes(); i++){
                for (int j=0; j<4; j++){
                    if(this.main.getCarte(i)!=null){
                        b = this.piles[j].etrePosable(this.main.getCarte(i));
                    }
                }
            }if(b==true){
                a=-1; // le joueur a perdu
            }
        }
        return a;
    }

    /**
     * complete la main du joueur si elle contient que 6 carte
     */
    public void completerMain(){
        if(this.main.getNbCartes()==6){
            // ajoute deux carte du dessus de la pioche a la fin de la main
            this.main.ajouterCarteFin(this.pioche.prendreCarteDessus());
            this.main.ajouterCarteFin(this.pioche.prendreCarteDessus());
        }
    }

    /**
     * lance le jeu jusqua sa fin et renvoie le resultat
     * @return resultat du jeu :"vous avez gagne " ou "vous avez perdu"
     */
    public String lancerJeu(){
    int i = 0;
    while (this.etreFini() == 0) {
        this.toString(); 
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle carte poser ?");
        int a = sc.nextInt();
        System.out.println("Sur quelle pile ?");
        int b = sc.nextInt();
        if(i == 2){
            this.completerMain();
            i=0;
        }
        // Vérifie la validité de l'indice de carte
        if (a <= this.main.getNbCartes() - 1 && a >= 0) {
            // Vérifie la validité du numéro de pile
            if (b <= 3 && b >= 0) {
                // Tente de jouer la carte et affiche un message en cas d'échec
                if (jouerCarte(a, b)) {
                    jouerCarte(a, b);
                    i++;
                } else {
                    System.out.println("Ce coup ne peut pas être joué");
                }
            } else {
                System.out.println("Erreur, la pile n'existe pas");
            }
        } else {
            System.out.println("Erreur, la carte n'existe pas");
        }

    }
    
    // Détermine le résultat du jeu
    String c;
    if (this.etreFini() == 1) {
        c = "Vous avez gagné";
    } else {
        c = "Vous avez perdu";
    }
    return c;
}
}
