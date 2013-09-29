import java.io.*;
public class SimpleIO{

	//simple Method for entering text
	  public String scanf(String frage) {
      System.out.print(frage + ":");
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
	
	 //simply generates a random int
    public int getRandomInt (int upper,int lower) {
        return (int) (Math.random() * (upper - lower) + lower);
    }

    //generates a Random Boolean with the probability for true as a int param in %   
    public boolean getRandomBool (int probability){
        double temp = (Math.random() * 100);
        if (temp <= probability){
            return (boolean) (true);
        }else{
            return (boolean) (false);
        }
        
    }	
	

	
