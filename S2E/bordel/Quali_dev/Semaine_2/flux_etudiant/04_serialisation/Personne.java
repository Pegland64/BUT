import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Personne {
  /** attribut de personne **/
  private String prenom, nom;
  private Date naissance;

  /** constructeur de personne */
  public Personne(String p, String n, Date d){
    this.prenom = p;
    this.nom = n;
    this.naissance = new Date(d); // constructeur par copie
  }

  /** setNom */
  public void setNom(String n){
    this.nom = n;
  }

  public void sauver() throws IOException{
    String nomFichier = this.nom+"-"+this.prenom+".dat";

    FileOutputStream sortie = new FileOutputStream(nomFichier);
    ObjectOutputStream sortieSerialisation = new ObjectOutputStream(sortie);
    sortieSerialisation.writeObject(this);

    sortieSerialisation.close();
  }

  public static Personne charger(String nomFichier) throws IOException, ClassNotFound{
    FileInputStream entree = new FileInputStream(nomFichier);
    ObjectInputStream entreeSerialisation = new ObjectInputStream(entree);

    Object o = entreeSerialisation.readObject();
    Personne p = (Personne) o;

    entreeSerialisation.close();

    return p;
  }

  public String toString(){
    return (this.nom +" " + this.prenom + this.naissance);
  }
}
