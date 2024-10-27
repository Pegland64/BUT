import java.util.*;

public class Personne {
        /** attributs * */
      String nom , prenom ;
    
      /**
      * constructeur par defaut
      * @param p prenom de la personne
      * @param n nom de la personne
      * */
      public Personne ( String p , String n ) {
        this.nom = n ;
        this.prenom = p ;
      }

      
      public int compareTo(Personne p) {
        int result = this.nom.compareTo(p.nom);
        if (result == 0) {
          result = this.prenom.compareTo(p.prenom);
        }
        return result;
      }
    }
