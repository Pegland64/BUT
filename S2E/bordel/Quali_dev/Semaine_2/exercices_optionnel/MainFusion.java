import java.io.*;
import java.util.*;

public class MainFusion {
    public static void main(String[] args) {
        try {
            EX1.fusionner(args[0], args[1], args[2]);
        } catch (FileNotFoundException e) {
            System.out.println("fichier non trouvé");
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println("erreur lors de la fusion des fichiers");
            System.out.println(e.getMessage());
        }
    }
}
