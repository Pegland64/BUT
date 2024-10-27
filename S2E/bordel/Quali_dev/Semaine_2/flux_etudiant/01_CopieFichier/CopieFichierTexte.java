import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

import javax.imageio.IIOException;

public class CopieFichierTexte {

  /** nom des fichiers source et destination */
  private String source;
  private String destination;

  /** constructeur **/
  public CopieFichierTexte (String s, String d) {
    this.source =s;
    this.destination = d;
}

  /** effectue une copie caractère par caractère */
  public void copierCaracteres () throws IIOException {
      Reader r = new FileReader(this.source);
      Writer w = new FileWriter(this.destination);
      int caractere = r.read();
      while(caractere != -1){
          w.write(caractere);
          caractere = r.read();
      }
  }

  /** effectue une copie ligne par ligne */
  public void copierLignes() throws ... {
    ...
  }

  /** 
   * main permettant de tester que les copies fonctionnent bien
   */
  public static void main(String[] args) {
    try {
      ...
    } catch (...) {
      System.out.println("erreur : fichier inexistant");
    } catch (...) {
      System.out.println("erreur lors des lectures/ecritures");
    }
  }
}
