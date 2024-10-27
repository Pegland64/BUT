public class Main {
    public static void main(String[] args) {
        AnnuaireComp annuaire = new AnnuaireComp();

        annuaire.adjonction("Doe", "John", "1234567890");
        annuaire.adjonction("Doe", "Jane", "0987654321");
        annuaire.adjonction("Doe", "John", "6789054321");

        annuaire.affiche();

        System.out.println("Accès à John Doe : " + annuaire.acces("Doe", "John"));

        annuaire.changement("Doe", "John", "5432167890");

        annuaire.affiche();

        System.out.println(annuaire);
    }
}
