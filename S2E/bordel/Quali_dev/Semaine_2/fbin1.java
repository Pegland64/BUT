import java.io.*;
public class fbin1 {
    public static void main(String[] args) {
        String fichierSource = "C:/Users/pegla/OneDrive/Bureau/Vscode/Quali_dev/Semaine_2/fichier_txt/destination.txt";
        float var;
        try{
            FileInputStream s = new FileInputStream(fichierSource);
            DataInputStream in = new DataInputStream(s);
            try{
                while((var = in.readFloat())!=0){
                    System.out.println(var);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}