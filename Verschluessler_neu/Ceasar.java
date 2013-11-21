
/**
 * Write a description of class Ceasar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ceasar
{
   private int key;
   public Ceasar(int k){
       key = k;
    }
    
   public String entschluesseln(String input){
       if (key < 0){
           System.err.println("FEHLER:Key ist negativ, Programm wird abgebrochen");
           return null;
        }
        
       String textVerschluesselt = "";
           for (int i=0; i<input.length(); i++){
           if ((int) input.charAt(i) != 32){
           int asciiInt = (int) input.charAt(i)-65;
           if (asciiInt < key){asciiInt = asciiInt + 26;}
           asciiInt = asciiInt - key;
           textVerschluesselt = textVerschluesselt + (char)(asciiInt + 65);
        } else {
            textVerschluesselt = textVerschluesselt + input.charAt(i);
        }
            
           
        }
       return textVerschluesselt;
    }
           
}
