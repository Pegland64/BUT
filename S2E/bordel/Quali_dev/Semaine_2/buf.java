import java.io.*;

public class buf {
    public static void main(String[] args) {
        try{
            FileWriter wr= new FileWriter("C:/Users/pegla/OneDrive/Bureau/Vscode/Quali_dev/Semaine_2/fichier_txt/o.txt");
            BufferedWriter b = new BufferedWriter(wr);
            b.write("baaaaaaaaaaaaam");
            b.newLine();
            b.write("fortnite");
            b.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        String s=null;
        try{
            FileReader r = new FileReader("C:/Users/pegla/OneDrive/Bureau/Vscode/Quali_dev/Semaine_2/fichier_txt/o.txt");
            BufferedReader b = new BufferedReader(r);
            try{
                while((s=b.readLine())!=null);
                    System.out.println(s);
            }catch (IOException e){
                e.printStackTrace();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
