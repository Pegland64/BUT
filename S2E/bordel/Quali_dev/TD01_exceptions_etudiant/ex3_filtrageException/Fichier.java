import java.io.*;

class Fichier{

  public int donnerNbLignes(String nom) throws ErreurLectureException{
    LectureFichier f = new LectureFichier(nom);
    String [] s = f.lireFichier();
    return s.length;
  }

  public double calculerMoyenneLg(String [] noms){
    int nb=0;
    int somme = 0;
    for (int i=0; i<noms.length; i++){
      try{
        int lignes= donnerNbLignes(noms[i]);
        somme 
      }
    }
  }
}
