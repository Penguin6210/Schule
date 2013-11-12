
/**
 * Write a description of class Speedtest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Speedtest
{
   public void speed(int ghz){
       System.out.println("Gestartet");
       long startTime = System.currentTimeMillis();
       for ( int i = 0 ; i>= ghz * 1000000000; i++){
        }
       long stopTime = System.currentTimeMillis();
       long time = stopTime - startTime;
       System.out.println("ENDE, Zeit bei " + ghz + " Mrd. Rechenoperationen: " + time + " ms");
    }
    public static void main(String[] zargs){
        Speedtest speedtest = new Speedtest();
	speedtest.speed(2);
    }
}
