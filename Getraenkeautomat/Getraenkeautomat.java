
/**
 * Write a description of class Getraenk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Getraenkeautomat
{
    private String version = "V0.1Beta";
    private int adminKey;
    private String sorten[] = new String[3];
    private int mengen[] = new int[3];
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
        while (!(command.equals("quit"))){
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
                        System.out.println( mengen[i] + "*" + sorten[i]); 
                    }
                    break;
                    
                case "quit":
                    System.out.println("[info] Verlassen der Einstellungen");
                    break;
                    
                default:
                    System.out.println("Befehl nicht gefunden\nmögliche Befehle:\nsorten setzt die verschiedenen Sorten von Getränken\nmengen setzt die Mengen der Arten\ninfo gibt Informationen aus\nquit Verlässt die Einstellungen");
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
    
    
}
