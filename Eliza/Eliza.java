import java.util.ArrayList;
/**
 * Write a description of class Eliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eliza

{

    public ArrayList begruessung = new ArrayList();
    public ArrayList verabschiedung = new ArrayList(); 
    public String cnf[] = {"wie bitte", "koenntest du das nochmal sagen, ich habe es nicht verstanden", "kapier ich nicht", "was?"};
    public String wieGehts[] = {"wie gehts?","alles gut?","wie gehts dir so?"};
    public String aiHelper = "";

    public Eliza()
    {
        begruessung.add("hi");
        begruessung.add("hallo");
        begruessung.add("guten tag");
        begruessung.add("moin");
        begruessung.add("gruess Gott");
        begruessung.add("servus");
        verabschiedung.add("hau rein");
        verabschiedung.add("tschoe");
        verabschiedung.add("tschuess");
        verabschiedung.add("ciao");
        verabschiedung.add("bye");
        verabschiedung.add("auf wiedersehen");
        verabschiedung.add("adios");
        verabschiedung.add("hasta la vista");
        verabschiedung.add("ade");
    }
    public static void main(String args[]){
        Eliza eliza = new Eliza();
        eliza.ai();
    }
    public void ai(){
        SimpleIO io = new SimpleIO();
        io.terminalBox("Eliza V0.1");
        String word = " ";
        while (!(verabschiedung.contains(word))){
            
            word = io.readline("CHAT>").trim().toLowerCase(); 
            if (word.equals("")){
                System.out.println("Du solltest mir schon was Schreiben");  
            }else if (begruessung.contains(word)){
                System.out.println(begruessung.get(io.getRandomInt(begruessung.size(), 0)));
                
                if (!(aiHelper.equals(""))){
                    begruessung.add(aiHelper);
                    aiHelper = "";
                }
                
            }else if (verabschiedung.contains(word)){
                System.out.println(verabschiedung.get(io.getRandomInt(begruessung.size(), 0)));
            }else{
                System.out.println(cnf[io.getRandomInt(cnf.length, 0)]);
                    aiHelper = word;
                }
            
            }
  
        }
    }
   
    