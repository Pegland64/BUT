package Quali_dev.TD1.Question1;

public class Question11 {
    public static void main(String[]args){
        String p;
        p = "poulette";

        try{
            int n = p;
        }catch(NumberFormatException e1){
            System.out.println("faux");
        }
    }
}
