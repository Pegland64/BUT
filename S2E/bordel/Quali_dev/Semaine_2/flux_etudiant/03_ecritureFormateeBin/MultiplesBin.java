import java.io.*;

public class MultiplesBin {

  /** le reel dont on veut les multiples */
  private double val;

  /** constructeur qui prend le reel en paramètre */
  public MultiplesBin(double v) {
    this.val = v;
  }

  /** methode en charge de creer et de remplir le fichier */
  public void remplirFichier(String nom, int n ) throws IOException {
    DataOutputStream o = new DataOutputStream(new FileOutputStream(nom));
    for (int i = 1; i<n+1; i++){
      o.writeInt(i);
      o.writeDouble(i*this.val);
    }
    o.close();
  }

  public static void extraireFichier(String s) throws FileNotFoundException, IOException{
    DataInputStream dis new DataInputStream(new FileInputStream(s));

    int n=0;
    double val = 0.0;

    try{
      int i = 
      
      while(true){
        i = dis.readInt();
        v = dis.readDouble();
        n++;
      }
    }catch(EOFException e){
      System.out.println(n + "multiples"+val);
    }

    dis.close();
  }
  /**
   * main permettant de tester votre méthode
   */
  public static void main(String[] args) {
    try {
      new MultiplesBin(0.3).remplirFichier("multiples.dat", 12);
      MultiplesBin.extraireFichier("multiples.dat");
    }
    catch (FileNotFoundException e) {
      System.out.println("Mauvais format des paramètres passés (reel, entier, String)");
    }
    catch (IOException e) {
      System.out.println("probleme a l'ouverture du fichier");
    }
  }
}
