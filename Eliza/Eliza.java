
/**
 * Write a description of class Eliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eliza

{

public String begruessung[] = {"hi", "hallo", "guten Tag", "moin", "grüss Gott", "Servus", "gib Flosse Genosse", "alles fit im Schritt?"};
public String verabschiedung[] = {"Tschüss", "ciao", "bye", "auf Wiedersehen", "adios", "hasta la vista"};
public String cnf[] = {"Wie bitte", "Könntest du das nochmal sagen, ich habe es nicht verstanden", "kapier ich nicht", "was?"};

    public Eliza()
    {
        
    }
    public static void main(String args[]){
        Eliza eliza = new Eliza();
        eliza.ai();
    }
    public void ai(){
        SimpleIO io = new SimpleIO();
        io.terminalBox("Eliza 1.0");
        String word = " ";
        while (!(word.equals("ade"))){
            word = io.readline("CHAT>");
            
            if (word.equals("hi")){
                System.out.println(begruessung[io.getRandomInt(begruessung.length, 0)]);
            }else if (word.equals("ade")){
                System.out.println(verabschiedung[io.getRandomInt(verabschiedung.length, 0)]);
            }else {
                System.out.println(cnf[io.getRandomInt(cnf.length, 0)]);
            }
        }
  
        }
    }
