
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
            System.out.println("Ich bin Unixoid, also in Kleinbuchstaben bitte");
        }else{
            if (input == "bicher"){
                System.out.println ("Guten Tag herr Bicher");
            } else {
                System.out.println (input + "? Noch nie gehört");
            }
        }
    }
    
    public boolean checkUpper (String input){
        boolean upperFound=false;
        for (int i=0 ; i <= (input.length()-1); i++){
             if ((input.charAt(i) > 63) && (input.charAt(i) < 93)){
                 upperFound = true;
                }
            }
            return upperFound;
        }
        
    public boolean checkAFirst (String input){
        switch (input.charAt(0)){
        
            case 65: case 97:
                System.out.println(input + " fängt mit einem A an");
                return true;

        
            default:
                System.out.println(input + " fängt mit einem A an");
                return false;
        }
    }
    
    
}
