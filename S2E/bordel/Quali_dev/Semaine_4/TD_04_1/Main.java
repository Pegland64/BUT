public class Main {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        annuaire.ajouter("Alfred", "Dupont");
        annuaire.ajouter("Bertrand", "Meunier");
        annuaire.ajouter("Claude", "Breton");
        annuaire.ajouter("Delphine", "Breton");
        System.out.println(annuaire);
        System.out.println(annuaire.etrePresent("Alfred", "Dupont"));
        System.out.println(annuaire.etrePresent("Alfred", "Dupontel"));
        System.out.println(annuaire.etrePresent("Alfredo", "Dupont"));
    }
}
