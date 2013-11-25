import java.io.*;
public class SimpleIO{

    /**
     * simple Method for entering text
     */
      public String readline(String frage) {
      System.out.print(frage);
      try {
         BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
         String number = bufferedreader.readLine();
         return number;
      } catch (IOException ioe) {
         System.out.println("IO error trying to read your command!");
         System.exit(1);
         return "0";
      }
    }
    
    /**
     *simply generates a random int
     */
    public int getRandomInt (int upper,int lower) {
        return (int) (Math.random() * (upper - lower) + lower);
    }

    /**
     *generates a Random Boolean with the probability for true as a int param in %
     */
    public boolean getRandomBool (int probability){
        double temp = (Math.random() * 100);
        if (temp <= probability){
            return (boolean) (true);
        }else{
            return (boolean) (false);
        }
        
    }
    
    /**
     * generates a random emoticon of a defined type
     * Types:
     *    1 happy
     *    2 unhappy
     *    3 crying
     *    4 twinkle
     *    5 sticking tongue out
     *    6 loud laugthing
     *    7 being surprised
     *    
     */
    public String getEmoticon (int type){
        String happy[]={":-)",":)","=)",":]",":>",":c)","x)",":o)"};
        String unhappy[]={":-(",":(","=(",":[",":<",":/","x(",":o(",":C"};
        String crying[]={":'(",":'C"};
        String twinkle[]={";-)",";)",";]",";o)"};
        String tongue[]={":-P",":p",":b","=P",":P","dx","xP",";-P",":oP"};
        String laugth[]={":-D",";D",":D","=D","xD","XD",":oD"};
        String surprised[]={":-0",":-o",":o","=O",":0","=o"};
        
        switch(type){
            case 1: return happy[getRandomInt(happy.length , 0 )];
            case 2: return unhappy[getRandomInt(unhappy.length , 0 )];
            case 3: return crying[getRandomInt(crying.length , 0 )];
            case 4: return twinkle[getRandomInt(twinkle.length , 0 )];
            case 5: return tongue[getRandomInt(tongue.length , 0 )];
            case 6: return laugth[getRandomInt(laugth.length , 0 )];
            case 7: return surprised[getRandomInt(surprised.length , 0 )];
            default: return null;
        
        
        }
    }
    /**
     * Draws a Box with Text onto the terminal
     */
    public void terminalBox (String caption){
    
        System.out.println("");
        terminalLine ('*',caption.length() + 4);
        System.out.println ("* "+caption+" *");
        terminalLine ('*',caption.length() + 4);
 
    }

    /**
     * Draws a line of a definable char onto the terminal
     */
    public void terminalLine (char c, int length){
        for (int i=1 ; i<= length; i++){
            System.out.print(c);
        }
        System.out.println("");
    }
    
    /**
     * searches an array for a string of text
     */
   public boolean searchArray(String search, String input[]){
       boolean found = false;
       for (int i=0; i<input.length; i++){
           if (input[i].equals(search)){
               found = true;
            }else{
            }
        }
        return found;
    }
}
    

    
