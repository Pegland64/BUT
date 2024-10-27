import java.awt.Frame;
import java.awt.Color;

public class MixColor extends Color{

    public final static MixColor RED=new MixColor(Color.red);
    public final static MixColor BLUE=new MixColor(Color.blue);
    public final static MixColor GREEN=new MixColor(Color.green);

    public MixColor(int r, int g, int b){
        super(r,g,b);
    }

    public MixColor(Color p){
        super(p.getRed(), p.getGreen(), p.getBlue());
    }

    public MixColor melange(MixColor nouvelleColor, double pourcentage) {
        if (pourcentage >= 0.0 || pourcentage <= 1.0) {
            int nouveauRed = (int) ((1 - pourcentage) * this.getRed() + pourcentage * nouvelleColor.getRed());
            int nouveauGreen = (int) ((1 - pourcentage) * this.getGreen() + pourcentage * nouvelleColor.getGreen());
            int nouveauBlue = (int) ((1 - pourcentage) * this.getBlue() + pourcentage * nouvelleColor.getBlue());
            return new MixColor(nouveauRed, nouveauGreen, nouveauBlue);
        }
        return null;
    }

    public void visu(){
        Frame a = new Frame();
        a.setSize(100, 200);
        a.setBackground(this);
        a.setVisible(true);
    }
}
