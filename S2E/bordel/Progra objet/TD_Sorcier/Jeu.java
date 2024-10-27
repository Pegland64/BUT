import java.util.Scanner;
public class Jeu {
    public static void main(String [] args){
        //initialistaion du scanner
        Scanner sc = new Scanner(System.in);
        //création du tableau de tournoi
        Personnage [] tournoi = new Personnage[10];
        // on nomme les monstre
        for(int i =0; i<5; i++){
            System.out.println("choisir le nom du monstre numero : "+ (i+1));
            String nommonstre = sc.nextLine();
            int pv = (int) (Math.random()*100);
            tournoi[i] = new Monstre(nommonstre,pv);
        }

        // on nomme les sorciers
        for(int i =5; i<10; i++){
            System.out.println("choisir le nom du Sorcier numero : "+ (i+1));
            String nomsorcier = sc.nextLine();
            int pv = (int) (Math.random()*100);
            tournoi[i] = new Sorcier(nomsorcier,pv);
        }
        //création de qqe variable pour plus tard
        boolean b = false;
        String c;
        int k = 1;
        while (b == false){
        // le numero du combat
            System.out.println("Combat numero " + k);
            System.out.println(" ");
        // l'état de chaque personnage avant combat
            for(int i = 0; i<10; i++){
                System.out.println(tournoi[i]);
            }
            System.out.println(" ");
            System.out.println("L'heure du combat a sonne");
            System.out.println(" ");

            // combat 
            boolean m = false;
            boolean l = false;
            int y = 0;
            int x = 0;
            //on verifie si les variables ne sont pas identique et si les personnages ne sont pas mort
            while(m == false && l == false){
                y = (int)(Math.random()*10);
                if (!tournoi[y].etreMort()){
                    l = true;
                }
                while (m == false){
                    x = (int)(Math.random()*10);
                    if(x != y && !tournoi[x].etreMort()){
                        m = true;
                    }
                }
            }
            // on fait une phrase pour decrire le combat
                String p1 = "sorcier";
                String p2 = "sorcier";
                if (y <4){
                    p1 = "monstre";
                }
                if (x <4){
                    p2 = "monstre";
                }
                System.out.println("Le " + p1 + " numero " + (y+1) + " attaque le " + p2 + " numero " + (x+1));
                tournoi[y].attaquer(tournoi[x]);

            System.out.println(" ");
            System.out.println("Resultat des combats ");
            System.out.println(" ");
            // on montre les monstre apres le combat
            for(int i = 0; i<10; i++){
                System.out.println(tournoi[i]);
            }
            int n = 0;
            System.out.println(" ");
            //si tout les monstre sont mort on arrete tout
            for (int i = 0; i<10; i++){
                if (tournoi[i].etreMort()){
                    n++;
                }
            }
            if(){
                System.out.println("Tout les monstre sont mort la partie est termine");
                b = true;
            }else{
                // sinon on demande si il veux continuer le jeu
                System.out.println("Voulez vous continuer ? [o/n]");
                c = sc.nextLine();
                 if (c.equals("n")){
                    b = true;
                }
                k++;
            }
        }
    }
}
