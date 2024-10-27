public class ListeChaine {
    private ArrayList arrayList;

    public void ajouter (String s){
        arrayList.add(s);
    }

    public String concat(){
        String saucisse = "";
        for (int i = 0; arrayList.length > i; i++){
            saucisse = saucisse + ", " + arrayList.get(i);
        }
        return saucisse;
    }

    public void retirerIndice(int i){

    }
}
