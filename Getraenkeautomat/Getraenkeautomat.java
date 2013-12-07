
public class Getraenkeautomat
{
    private String version = "V0.1Beta";
    private int adminKey;
    private String sorten[] = new String[3];
    private int mengen[] = new int[3];
    private double preise[] = new double[3];
    private double guthaben = 0;
    private SimpleIO io = new SimpleIO();
    public Getraenkeautomat(){

        io.terminalBox("Getränkeautomat "+ version);
        adminKey = io.getRandomInt(9999,1000);
        System.out.println("[info] starten ...");
        System.out.println("[info] neuer Admin-Key:"+ adminKey);
    
    }
    
    public void setup(){
        
        System.out.println("[info] Starten der Einstellungen...");
        String command = "";
        while (!(command.equals("q"))){
            command = io.readline("SETUP>").trim().toLowerCase();
            
            switch (command){
                
                case "sorten":
                    for (int i = 0; i < sorten.length; i++){
                        sorten[i]=io.readline(i+". Sorte:");
                    }
                    break;
                    
                case "mengen":
                    for (int i = 0; i < mengen.length; i++){
                        mengen[i]=Integer.parseInt(io.readline("Menge an " + sorten[i] + ":"));
                    }
                    break;
                
                case "info":
                    for (int i = 0; i < mengen.length; i++){
                        System.out.println( mengen[i] + "*" + sorten[i] + " Preis:" + preise[i] + "€"); 
                    }
                    break;
                    
                case "preise":
                    for (int i = 0; i < preise.length; i++){
                        preise[i]=(Double.parseDouble(io.readline("Preis von " + sorten[i] + " in cent:"))) / 100;
                    }
                    break;
                    
                case "quit":
                    System.out.println("[info] Verlassen der Einstellungen");
                    break;
                    
                default:
                    System.out.println("Befehl nicht gefunden\nmögliche Befehle:\nsorten setzt die verschiedenen Sorten von Getränken\nmengen setzt die Mengen der Arten\npreise setzt die Preise\ninfo gibt Informationen aus\nq    Verlässt die Einstellungen");
                    break;
            }
        }
    }
    
    public void wechselgeldAusgeben(double betrag){
        int guthaben = (int)(betrag*100);
        int eur2 = guthaben / 200;
        guthaben = guthaben % 200;
        int eur1 = guthaben / 100;
        guthaben = guthaben % 100;
        int ct50 = guthaben / 50;
        guthaben = guthaben % 50;
        int ct20 = guthaben / 20;
        guthaben = guthaben % 20;
        int ct10 = guthaben / 10;
        guthaben = guthaben % 10;
        int ct5 = guthaben / 5;
        guthaben = guthaben % 5;
        int ct2 = guthaben / 2;
        guthaben = guthaben % 2;
        int ct1 = guthaben;
        
        System.out.println("Ihr Wechselgeld: \n"+eur2+"*2EUR\n"+eur1+"*1EUR\n"+ct50+"*50ct\n"+ct20+"*20ct\n"+ct10+"*10ct\n"+ct5+"*5ct\n"+ct2+"*2ct\n"+ct1+"*1ct");
    }
    
    public double einwerfen(){
        double einwurf = 0;
        String eingabe = "";
        while(!(eingabe.equals("q"))){
         eingabe = io.readline("EINWURF>").trim().toLowerCase();
         switch (eingabe){
             case "1ct": einwurf = einwurf + 1;break;
             case "2ct": einwurf = einwurf + 2;break;
             case "5ct": einwurf = einwurf + 5;break; 
             case "10ct": einwurf = einwurf + 10;break;
             case "20ct": einwurf = einwurf + 20;break;
             case "50ct": einwurf = einwurf + 50;break;
             case "1eur": einwurf = einwurf + 100;break;
             case "2eur": einwurf = einwurf + 200;break;
             case "q":break;
             default:
                System.out.println("***NICHT VERSTANDEN***\nmögliche Eingaben:\n1ct;2ct;5ct;10ct;20ct;50ct;1EUR;2EUR\nq zum Verlassen");
                break;
        }
         System.out.println("aktuell eingeworfen:"+(einwurf / 100)+"EUR");
      }
      return (einwurf / 100);
   }
   
   public double flascheKaufen(int sorte){
       
     System.out.println("Bitte warten, eine kühle, köstliche Flasche " + sorten[sorte] + " wird ausgegeben...");
     mengen[sorte]--;
     return (preise[sorte]);
    
    }
   
   public void loop(){
       System.out.println("[info] Betriebsbereit");
       boolean leave = false;
       String command;
       while(leave == false){
           command = io.readline("GETRÄNKEAUTOMAT>");
        }
    }
}
