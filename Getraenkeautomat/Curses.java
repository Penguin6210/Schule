
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
           for (int j=0; j < xSize; j++){
               screen[i][j] = ' ';
            }
       }
    }
   public void refresh(){
       //clear();
       for (int i = 0 ; i < ySize ; i++){
           for (int j=0; j < xSize; j++){
               System.out.print(screen[i][j]);
            }
           System.out.println("");
       }
   }
   
   public void move(int x , int y){
       xPos = x;
       yPos = y;
    }
   
   public void addstr(String string){
       for (int i = 0; i < string.length(); i++){
           screen[yPos][xPos] = string.charAt(i);
           xPos++;
        }
    
   }
   
   public void mvaddstr(int x, int y,String string){
       move(x,y);
       addstr(string);
    }
    
   public void verticalLine(int y,char c){
       for (int i=0;i<xSize;i++) screen[y][i] = c;
    }
    
   public void horizontalLine(int x,char c){
       for (int i=0;i<ySize;i++)screen[i][x] = c;
    }
    
   public static void main(String[] args){
       Curses term = new Curses();
       term.mvaddstr(15,10,"TEST1");
       term.mvaddstr(12,12,"TEST2");
       term.verticalLine(11,'*');
       term.refresh();
    }
}

