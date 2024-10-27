import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListeIp {
    private Set<String> ips;

    public ListeIp(boolean ordonnee) {
        if(ordonnee) {
            this.ips = new TreeSet<>();
        } else {
            this.ips = new HashSet<>();
        }
    }

    public void chargerFichier(String nomFichier) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
        String ligne;

        while((ligne = reader.readLine()) != null) {
            String ip = ligne.split(" ")[0];
            this.ips.add(ip);
        }

        reader.close();
    }

    @Override
    public String toString() {
        String res = "";
        for(String ip : this.ips) {
            res += ip + "\n";
        }
        return res;
    }
}
