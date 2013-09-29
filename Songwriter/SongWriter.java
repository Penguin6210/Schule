
/**
 * Write a description of class SongWriter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SongWriter
{
    private String consonants[] = {"b","ch","d","f","g","h","j","k","l","m","n","p","s","sch","t","w","x","z"};
    private String vocals[]= {"a","e","i","o","u"};
    private String call[]= {"yeah","yo man","fake that"};
    private int verses;
    private int verseLength;
    private int lineLength;

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

    // Generates a Line of the Song using the rules described in "Songwriter" of the Exercises
    public String getLine(int length){
        String syllable = consonants[getRandomInt (consonants.length, 1)] + vocals[getRandomInt (vocals.length, 1)];
        switch(length){
            default:
                return (String) ("");
            case 1:
                return (String) (syllable + " " + syllable + "p di " + syllable);
            case 2:
                return (String) (syllable + " " + syllable + " " + syllable + "p di " + syllable + " " + syllable);
            case 3:
                return (String) (syllable + " " + syllable + " " + syllable + " " + syllable + "p di " + syllable + " " + syllable +  " " + syllable);
            case 4:
                return (String) (syllable + " " + syllable + " " + syllable + " " + syllable + " " + syllable + "p di " + syllable + " " + syllable + " " + syllable + " " + syllable);
        }
    }
    
    // and now a method to generate a verse
    public void verse (){
        verses = getRandomInt(3,7);
        verseLength = getRandomInt(2,10);
        lineLength = getRandomInt(1,4);
        int x;
        int y;
        for (x=1; x<=verses;x++){
            for (y=1; y<=verseLength; y++){
                System.out.println(getLine (lineLength)); 
            }
            if (getRandomBool(50) == true){
                System.out.println(call[getRandomInt(1,call.length)]);
            }
            System.out.print ("\n");
            lineLength = getRandomInt(1,4);
        }
        
    }
   public static void main(String[] args){
       new SongWriter().verse();
    }
    
}
