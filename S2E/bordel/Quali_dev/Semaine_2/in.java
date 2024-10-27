import java.util.Scanner;
public class in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        String nu = sc.nextLine();
        System.out.println("Bonjour, " + nu + " !");
        sc.close();
    }
}   
