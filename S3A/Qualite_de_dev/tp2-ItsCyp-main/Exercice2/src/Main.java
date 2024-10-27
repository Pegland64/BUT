import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ListeIp listeIp = new ListeIp(true);
        try {
            listeIp.chargerFichier("resources/logs.txt");
            System.out.println(listeIp);
        } catch(IOException e) {
            System.out.println("Erreur lors de la lecture du fichier");
        }

    }
}
