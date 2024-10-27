import java.util.Objects;

public class Personne {
    private final String nom, prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne personne)) return false;

        return Objects.equals(nom, personne.nom) && Objects.equals(prenom, personne.prenom);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nom);
        result = 31 * result + Objects.hashCode(prenom);
        return result;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}
