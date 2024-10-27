import java.io.*;
import java.util.*;

public class EX1 {
    
    public static void creerFichier(int[] tab, String nom)throws IOException{
        FileOutputStream op = new FileOutputStream(nom);
        DataOutputStream out = new DataOutputStream(op);
        for (int i : tab) {
            out.writeFloat((float)(tab[i]));
        }
        out.close();
    }

    public static int afficherEntiers(String nom)throws IOException{
        FileInputStream s = new FileInputStream(nom);
        DataInputStream in = new DataInputStream(s);
        float var;
        int somme = 0;
        while((var = in.readFloat())!=0){
            somme = somme + (int)var;
        }
        return somme;
    }
    public static void fusionner(String f1, String f2, String f3) throws IOException {
        FileInputStream file1 = new FileInputStream(f1);
        FileInputStream file2 = new FileInputStream(f2);
        DataInputStream in1 = new DataInputStream(file1);
        DataInputStream in2 = new DataInputStream(file2);
        FileOutputStream file3 = new FileOutputStream(f3);
        DataOutputStream out = new DataOutputStream(file3);

        float var1 = in1.readFloat();
        float var2 = in2.readFloat();

        while (var1 != 0 && var2 != 0) {
            if (var1 < var2) {
                out.writeFloat(var1);
                var1 = in1.readFloat();
            } else {
                out.writeFloat(var2);
                var2 = in2.readFloat();
            }
        }
        in1.close();
        in2.close();
        out.close();
    }
}
