import java.io.*;
public class Multiples {

  /** le reel dont on veut les multiples */
  private double val;

  /** constructeur qui prend le reel en paramètre */
  public Multiples(double v) {
    this.val = v;
  }
  
  /** methode en charge de creer et de remplir le fichier */
  public void remplirFichier(String s, int n) throws IOException {
    Writer w = new FileWriter(s);
    PrintWriter pw = new PrintWriter(w);
    for (int i = 1; i<n+1; i++){
      pw.printf("%2d;%1.3f%n", i, i*this.val);
    }
    pw.close();
  }

  /** 
   * main permettant de tester votre méthode 
   */
  public static void main(String[] args) {
    try {
      if(args.length !=3){
        System.out.println("3 arg necessaire (reel, entier, String)");
        System.exit(1);
      }

      float val = Float.parseFloat(args[0]);
      int nb = Integer.parseInt(args[1]);

      String nom = args[2];

      Multiples multiples = new Multiples(val);
      multiples.remplirFichier(nom,nb);
    }
    catch (NumberFormatException e) {
      System.out.println("Mauvais format des paramètres passés (reel, entier, String)");
    }
    catch (IOException e) {
      System.out.println("probleme a l'ouverture du fichier");
    }
  }
}
