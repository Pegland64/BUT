import java.awt.Frame;
import java.awt.Color;

public class Main {
    public static void main (String[] args){
        MixColor m = new MixColor(0,0,0);
        MixColor p = new MixColor(255,255,255);
        MixColor r = m.melange(p,0.5);
        m.visu();
        p.visu();
        r.visu();
    }
}
