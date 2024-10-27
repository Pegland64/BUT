import java.io.*;
import java.net.*;

/** fichier etudiant **/
public class ConnectionPage {

    public static void main(String[] args) {
        // url web
        String nom = "https://fr.wikipedia.org/wiki/Institut_universitaire_de_technologie_de_Nancy_Charlemagne";

        // creation d'une URL vers une ressorce
        URL monURL = new URL(nom);
        URLConnection connexion = monURL.openConnection();

        // creation d'un flux de lecture
        InputStream flux = connexion.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(flux));

        // lit les 5 premieres lignes du fichier
        for (int i = 0; i < 5; i++)
            System.out.println(reader.readLine());

        // Fermeture de la connexion
        flux.close();
    }
}
