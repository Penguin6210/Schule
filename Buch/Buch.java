import java.io.*;

/**
 * Write a description of class Buch here.
 * 
 * Christian Poulwey 
 * 9-18-2013
 */
public class Buch
{
   private String titel=null;
   private String autor=null;
   private String isbn=null;
   private int    seitenzahl=0;
   private int    aktuelleSeite=0;
   private boolean offen=false;
   private int temp = 0;
   
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
  
       
   public void automatischeAbfrage (){
       titelSetzen(scanf("Titel"));
       autorSetzen(scanf("Autor"));
       isbnSetzen(scanf("ISBN"));
       temp = Integer.parseInt(scanf("Anzahl der Seiten"));
       seitenzahlSetzen(temp);
       temp=0;
    }
   public void titelSetzen (String t) {
   
       titel=t;
       System.out.println("neuer Titel: " + titel);
    }
   
    public void autorSetzen (String a) {
        autor=a;
        System.out.println("neuer Autor: " + autor);
    }
    
    public void isbnSetzen (String i) {
        isbn=i;
        System.out.println("neue ISBN: " + isbn);
    }
    
    public void seitenzahlSetzen (int s){
        seitenzahl = s;
        System.out.println("neue Seitenzahl: "+ seitenzahl);
    }
    
    public void buchAufschlagen (){
        offen = true;
        System.out.println("Buch Offen");
    }
        
    public void zuSeiteBlaettern (int seite){
        if (offen = true){
        aktuelleSeite=seite;
        System.out.println("Aktuelle Seite: "+ aktuelleSeite);
    }else{
        System.out.println("Das Buch muss erst aufgeschlagen werden!");
    }
    
    }
    public void info (){
        System.out.println("Titel: "+titel+"\n Autor: "+autor+"\n ISBN: "+isbn);
    }
    
    
}
