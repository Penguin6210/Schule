
/**
 * Write a description of class Eliza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eliza

{

public String begruessung[] = {"hi", "hallo", "guten Tag", "moin", "gr�ss Gott", "Servus"};
public String verabschiedung[] = {"Tsch�ss", "ciao", "bye", "auf Wiedersehen", "adios", "hasta la vista"};
public String cnf[] = {"Wie bitte", "K�nntest du das nochmal sagen, ich habe es nicht verstanden", "kapier ich nicht", "was?"};

    public Eliza()
    {
        
    }
    public static void main(String args[]){
        Eliza eliza = new Eliza();
        eliza.ai();
    }
    public void ai(){
        SimpleIO io = new SimpleIO();
        String word = io.readline("CHAT>");
        while (!(word.equals("ade"))){
            if (word.equals("hi")){
                System.out.println("Hallo auch");
            }else if (word.equals("ade")){
                System.out.println("Tsch�ss auch");
            }else {
                System.out.println(cnf[io.getRandomInt(cnf.length, 0)]);
            }
             word = io.readline("CHAT>");
        }
  
        }
    }
