public class TypeCompte {
    private final static int CODE_CC = 1, CODE_LEP = 2, CODE_LPP = 3;
    private int code;
    private boolean estplafonne, estcondRev;
    private double plafondDepot, plafondRevenus;
    private final static TypeCompte CC = new TypeCompte(CODE_CC); 
    private final static TypeCompte LEP = new TypeCompte(CODE_LEP);
    private final static TypeCompte LPP = new TypeCompte(CODE_LPP);
    public TypeCompte(int c){
        this.code = c;
        switch (c){
            case CODE_CC:
            this.estplafonne = true;
            this.plafondDepot = 15300;
            this.estcondRev = false;
            break;
        }
    }
    
}
