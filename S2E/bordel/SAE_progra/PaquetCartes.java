import java.util.Random;
/**
 * Classe PaquetCarte qui contient un tableau de cartes
 */
public class PaquetCartes{

  /**
   * attribut privee cartes qui est un tableau de Carte
   */
  private Carte [] cartes;

  /**
   * constructeur sans parametre d'un paquet de carte
   * ne prend aucun parametre
   */
  public PaquetCartes(){
    this.cartes = new Carte[0];
  }

  /**
   * constructeur d'un paquet de carte a partir d'un paquet de carte existant
   * @param pc Tableau pc de carte
   */
  public PaquetCartes(Carte [] pc){
    this.cartes = pc;
  }

  /**
   * methode qui retourne le nombre de carte du paquet
   * ne prend aucun parametre
   * @return le nombre de carte du paquet de carte
   */
  public int getNbCartes(){
    return this.cartes.length;
  }

  /**
   * methode qui retourne la carte a la position i
   * @param i entier designant une position du tableau
   * @return Carte a la position i et null si i est en dehors de porter du tableau
   */
  public Carte getCarte(int i){
    //* initialisation d'une carte p sans valeur
    Carte p = null;
    //* verifie que i peut se situe dans le tableau 
    if (this.cartes.length>i && i>=0){
      p = this.cartes[i];
    }
    return p;
  }

  /**
   * methode qui retourne la derniere carte du tableau
   * ne prend aucun parametre
   * @return retourne la derniere carte du tableau , peut etre egale a null
   */
  public Carte getDerniereCarte(){
    //* initialisation d'une carte p sans valeur
    Carte p = null;
    //* verifie que la derniere carte sois different de null
    if (this.cartes[this.cartes.length-1] != null){
      p = this.cartes[this.cartes.length-1];
    }
    return p;
  }

  /**
   * methode que verifie si le paquet est vide
   * @return vrai si et seulement si le paquet est vide , faux sinon
   */
  public boolean etreVide(){
    //* verifie que la taille du paquet de cartes est egale a 0 et renvoie directement vrai ou faux sinon
    return this.cartes.length == 0;
  }

  /** 
   * methode ajouterCarteFin qui ajoute une carte a la fin du paquet
   * @param c parametre d'une Carte c
  */
  public void ajouterCarteFin(Carte c){

    //* creation d'un tableau de Carte tabderech de la taille du tableau de carte regarder + 1 case
    Carte [] tabderech = new Carte[this.cartes.length+1];

    //* boucle qui va de i = 0 a la taille du tableau de carte regarder 
    for (int i=0 ; i<this.cartes.length ; i++){

      //* pointe et affecte sur tabderech a la position i la valeur de la carte regarder a la position i
      tabderech[i] = this.cartes[i];
    }
    //* ajoute la valeur de la carte c a la denrier position du tableau tabderech
    tabderech[tabderech.length-1] = c;

    //* pointe et affecte au tableau de carte regarder le nouveau tableau tabderech
    this.cartes = tabderech;
  }

  /** 
   * methode qui retire la carte a la position indice du paquet de carte
   * @return la carte c retirer du paquet
  */
  public Carte retirerCarte(int indice){
    //* creation d'une carte c qui prendra la valeur de la carte retirer
    Carte c =  null;

    //* verifie que l'indice est situer dans le tableau regarder
    if (indice>=0 && indice<this.cartes.length){

      //* recupere la valeur de la carte a l'indice indice et l'ajoute a c
      c = this.getCarte(indice);

      //* met la valeur null a la position indice du paquet de cartes regarder
      this.cartes[indice]= null;

      // indice pour remplir le nouveau tableau
      int j = 0;

      //* cree un nouveau tableau tabderech de taille du tableau regarder - 1
      Carte [] tabderech = new Carte[this.cartes.length-1];

      //* boucle qui va de i = 0 a la taille du tableau de carte regarder 
      for (int i=0 ; i<this.cartes.length ; i++){
            // Si la carte à l'indice i n'est pas null, ajoute-la à tabderech
            if (this.cartes[i] != null) {
                tabderech[j++] = this.cartes[i];
            }
        
      }
      //* affecte le nouveau tableau tabderech au tableau de carte regarder
      this.cartes = tabderech;
    }
    return c;
  }

  /**
   * methode qui prend un entier max en parametre et qui rempli le paquet de 2 a max-1
   * @param max entier qui correspond a la valeur max-1 de la denrier carte
   */
  public void remplir(int max){
    if (max<=2) max = 3;
    //* initialise le tableau en y mettant 1 carte afin d'eviter une erreur
      this.cartes = new Carte [1];
    //* cree une carte a de valeur 2 car la premiere carte du paquet est une carte de valeur 2
      Carte a = new Carte(2);
    //* ajoute la carte a a la premiere place du paquet de carte que l'on regarde
      this.cartes[0] = a; 
    //* i initialiser a 3 car on boucle sur les cartes suivante a la premiere jusqu'a max-1
      for (int i=3; i<max; i++){
        //* cree une nouvelle carte de valeur i et ajouter a la fin du paquet grace a la methode ajouterFin
          Carte c = new Carte(i);
          this.ajouterCarteFin(c);
      }
  }

  /**
   * mehtode permettant de piocher une carte aleatoirement dans le paquet regarder
   * ne prend aucun parametre et retire la carte choisi du paquet
   * @return la carte choisi et retirer du paquet
   */
  private Carte piocherHasard(){
    //* initialisation d'un carte c de valeur null
    Carte c = null;
    //* initialisation de l'objet random r 
    Random r = new Random();
    //* verifie que le paquet de carte ne soit pas vide
    if (this.etreVide() == false){
      //* initialisation d'un entier i qui prend la valeur d'un entier choisi aleatoirement parmis la taille en int du paquet regarder
      int i = r.nextInt(this.cartes.length);
      //* ajoute la carte a la position i du paquet a la viariable c puis la retire du paquet
      c = this.cartes[i];
      this.retirerCarte(i);
    }
    return c;
  }

  /**
   * methode qui melange aleatoirement le paquet regarder
   * ne prend aucun parametre ne retourne rien
   */
  public void melangerPaquet(){
    //* initialisation d'un nouveau paquet de carte pc
    PaquetCartes pc = new PaquetCartes();
    int tailleT = this.cartes.length;
    //* boucle de i =0 a la taille du paquet de carte regarder
    for (int i = 0; i<tailleT;i++){
      //* initialise ou nouvelle carte c qui prend successivement la valeur de la carte piocher au hasard du paquet regarder
      Carte c = this.piocherHasard();
      pc.ajouterCarteFin(c);
    }
    //* nouveau pointage du paquet de carte regarder sur le nouveau tableau de carte cree
    this.cartes = pc.cartes;
  }

  /**
   * methode qui tri insere une carte au bonne endroit dans le paquet
   * @param c Carte que l'on souhaite inserer au bonne endroite du paquet de carte
   */
  public void insererTri(Carte c){
      //* initialisation d'un i qui sera l'index de la valeur juste plus grande que c
      int i = 0;
      //* recherche de cette index grace a la methode etreplusgrand
      while (i < this.cartes.length-1 && this.cartes[i].etrePlusGrand(c)){
        if (i == this.cartes.length-1) i = this.cartes.length-1;
        i++;
      }
      //* initialisation d'un nouveau paquet de carte
      Carte [] pc = new Carte[this.cartes.length+1];
      //* nouvelle boucle avec a qui prendra l'index de 0 a la taille de carte -1
      for(int a= 0 ; a<this.cartes.length ; a++){
        //* verifie que a est egale a l'index de i afin de positionner la carte c passer en parametre a la bonne place
        if (a == i){
          pc[a]=c;
        }else{
            pc[a]=this.cartes[i];
        }
      }
      // verifie si la carte doit etre ajouter a la fin et l'ajoute
      if (i == this.cartes.length-1) {
        pc[this.cartes.length-1] = c;
      }
      //* nouveau pointage du paquet de carte regarder sur le nouveau tableau de carte cree
      this.cartes = pc;
  }

  /**
   * Methode qui doit retirer la carte a l’indice 0 du paquet et la retourner
   * @return La carte retirer 
   */
  public Carte prendreCarteDessus(){
    //* initialise une carte sans valeur
    Carte c = null;
    //* verifie que le paquet de carte n'est pas vide
    if (!this.etreVide()){
      //* c prend la valeur de la premiere carte du tableau et la retire
      c = this.cartes[0];
      this.retirerCarte(0);
    }
    return c;
  }

  /**
   * Methode qui affiche le paquet de carte 
   * @return le paquet sous la forme <INDICE1>-<CARTE1> <INDICE2>-<CARTE2>
   */
  public String toString(){
    String p = "";
    for(int i=0; i<this.cartes.length; i++){
      p = p+" " + i + "-" + this.cartes[i].toString();
    }
    return p;
  }
}
