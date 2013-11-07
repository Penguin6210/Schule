
/**
 * Write a description of class Uebungen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebungen
{
    public void namenserkennung(String input){
        if (checkUpper(input)){
            System.out.println("Ich bin Unixoid, also kleinbuchstaben bitte");
        }else{
            if (input == "bicher"){
                System.out.println ("Guten Tag herr Bicher");
            } else {
                System.out.println (input + "? Noch nie gehört");
            }
        }
    }
    
    public boolean checkUpper (String input){
        for (int i=0 ; i = input.length()-1; i++){
             if ((input.charAt(1) < 63)&&(input.charAt(1) > 93)){
                 return true;
                }
            }
            return false;
        }
        
        
}
