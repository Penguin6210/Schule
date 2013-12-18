
public class Laufzeittabelle
{
    private String sorten[] = {"Cola","Fanta","Sprite","Wasser","Apfelschorle"};
    private int bestand[] = {50, 100, 23, 25, 88};
    private int preise[] = {150, 50, 110, 120, 88};
    
    public void zeigeInfos(){
        int gS=0;
        System.out.println("Zeile i   aFdS    gS");
        System.out.println("3     -    -     "+gS);
        for (int i=0; i<sorten.length; i++){
            System.out.println("4     "+i+"    -     "+gS);
            int aFdS = bestand[i] * preise[i];
            System.out.println("6     "+i+"   "+aFdS+"   "+gS);
            gS=gS+aFdS;
            System.out.println("8     "+i+"   "+aFdS+"   "+gS);
        }
    }
    /**
     * Mehr Variablen für einfacheres Verständnis des Codes
     */
    public void ace(){
        char t='z';
        System.out.println("Zeile i   j   t");
        System.out.println("3   --   --   "+t);     
        for (int i=32; i<35; i++){
            System.out.println("4   "+i+"   --   "+t);
            int j=2*i+1;
            System.out.println("6   "+i+"   "+j+"   "+t);
            t = (char)j;
            System.out.println("8   "+i+"   "+j+"   "+t);
        }
        System.out.println();
    }
    
    public void shortACE(){
        for(int i=32; i<35; i++)System.out.print((char)(2*i+1)+" ");
        System.out.println();
    }
    
    public static void main(String args[]){
        Laufzeittabelle tabelle = new Laufzeittabelle();
        tabelle.zeigeInfos();
        tabelle.ace();
        tabelle.shortACE();
    }
}
