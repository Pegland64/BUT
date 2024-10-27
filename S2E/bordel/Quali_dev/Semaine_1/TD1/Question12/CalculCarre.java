package Quali_dev.TD1.Question12;
public class CalculCarre {
    public static void main(String[]args){
        if(args.length==0){
          System.out.println("on attend un arg");
          System.exit(1);
        }
        if(args.length>1){
          System.out.println("on attend un seul argument et pas "+(args.length));
          System.exit(1);
        }

        String valeur = args[0];
        int val = -1;

        /**
         * java CalculCarre 5
         * java CalculCarre
         * java CalculCarre a
         * java CalculCarre 5.2
         */

         try{
          val = Integer.parseInt(valeur);
         }catch(NumberFormatException e){
            System.out.println("L'argument"+ valeur + "n'est pa sde type entier.");
         }
      }
}
