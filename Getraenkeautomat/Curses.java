
/**
 * Write a description of class Curses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curses extends SimpleIO
{
   private int xSize = 80;
   private int ySize = 25;
   private char screen[][] = new char[ySize][xSize];
   private int xPos = 0;
   private int yPos = 0;
   
   
   public void delete(){
       for (int i = 0 ; i < ySize ; i++){
           for (int j=0; i < xSize; i++){
               screen[j][i] = ' ';
            }
       }
    }
   public void refresh(){
       //clear();
       for (int i = 0 ; i < ySize ; i++){
           for (int j=0; i < xSize; i++){
               System.out.println(screen[j][i]);
            }
           System.out.println("");
       }
   }
   
   public void locate(int x , int y){
       xPos = x;
       yPos = y;
    }
   
   public void print(String word){
       for (int i = 0; i < word.length(); i++){
           screen[yPos][xPos] = word.charAt(i);
           xPos++;
        }
    
    }
}

