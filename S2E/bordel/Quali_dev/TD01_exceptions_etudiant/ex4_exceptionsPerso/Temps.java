
class Temps{
 private int secondes, minutes, heures;

 public static void validerTemps(int s, int mn, int h)throws TempsException{
    if(s<0 || s>60 ){
        throw new TempsException("vous etes hors des secondes");
    }
    if(mn<0 || mn>60 ){
        throw new TempsException("vous etes hors des minutes");
    }
    if(h<0){
        throw new TempsException("vous etes hors des heures");
    }
 }

 public Temps(int s, int m, int h)throws TempsException{
    validerTemps(s, m, h);
    this.secondes = s;
    this.minutes = m;
    this.heures = h;
 }

 public Temps(int s)throws TempsException{
    if (s<0){
        throw new TempsException("vous etes hors des secondes");
    }
    this.heures = s/3600;
    this.minutes = (s%3600)/60;
    this.secondes = s%60;
 }
 
 public int traduireEnSecondes(){
    return this.heures*3600 + this.minutes*60 + this.secondes;
 }
 public static void main(String [] args)throws TempsException{
    Temps t = new Temps(0, 0, 0);
 }

 public Temps dureeJusquA(Temps t)throws TempsException{
    int sec =this.traduireEnSecondes()- t.traduireEnSecondes();
    if(sec<0){
        throw new TempsException("vous etes hors des secondes");
    }
    Temps tnouv = new Temps(sec);
    return tnouv;
 }

 public String toString(){
    return  ("secondes : " + this.secondes + " minutes : " + this.minutes + " heures : " + this.heures);
 }
}
