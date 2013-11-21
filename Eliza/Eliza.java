
/**
 * Write a description of class Eliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eliza

{

    public String begruessung[] = {"hi", "hallo", "guten tag", "moin", "grüss Gott", "servus"};
    public String verabschiedung[] = {"tschüss", "ciao", "bye", "auf wiedersehen", "adios", "hasta la vista","ade"};
    public String cnf[] = {"wie bitte", "könntest du das nochmal sagen, ich habe es nicht verstanden", "kapier ich nicht", "was?"};
    public String wieGehts[] = {"wie gehts?","alles gut?","wie gehts dir so?"};
    public String aiHelper[] = new String[5];
    public int aiNum = 0;

    public Eliza()
    {
        
    }
    public static void main(String args[]){
        Eliza eliza = new Eliza();
        eliza.ai();
    }
    public void ai(){
        SimpleIO io = new SimpleIO();
        io.terminalBox("Eliza V0.1");
        String word = " ";
        while (!(io.searchArray(word, verabschiedung))){
            
            word = io.readline("CHAT>").trim().toLowerCase(); 
            if (word.equals("")){
                
            }else if (io.searchArray(word, begruessung)){
                System.out.println(begruessung[io.getRandomInt(begruessung.length, 0)]);
                System.arraycopy(aiHelper,0,begruessung,begruessung.length,aiHelper.length);
                aiHelper= new String [5];
                aiNum=0;
            }else if (io.searchArray(word, verabschiedung)){
                System.out.println(verabschiedung[io.getRandomInt(verabschiedung.length, 0)]);
            }else{
                System.out.println(cnf[io.getRandomInt(cnf.length, 0)]);
                if (aiNum < 4){
                    aiHelper[aiNum] = word;
                    aiNum++;
                }else{
                    aiHelper = new String[5];
                    aiNum=0;
                }
            
            }
  
        }
    }
}