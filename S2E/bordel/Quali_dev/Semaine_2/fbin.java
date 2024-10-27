import java.io.*;
public class fbin {
    public static void main(String[] args) {
        String fichierDestination = "C:/Users/pegla/OneDrive/Bureau/Vscode/Quali_dev/Semaine_2/fichier_txt/destination.txt";
        try{
            FileOutputStream op = new FileOutputStream(fichierDestination);
            DataOutputStream out = new DataOutputStream(op);
            try{
                out.writeFloat((float)3.4);
                out.writeFloat((float)3.5);
                out.writeFloat((float)3.6);
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
