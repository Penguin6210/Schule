
/**
 * Write a description of class Encrypt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Encrypt
{
    private char messageChars[];
    private String messageString;
    
    /**public void parseChar(String input){
        //for (int x = 0;
    }
    */
    public void asciiAusgeben(){
        for (int x=0; x<=255; x++){
            char c = (char)x;
            System.out.println(x + ": " +c);
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        new Encrypt().asciiAusgeben();
    }

}
