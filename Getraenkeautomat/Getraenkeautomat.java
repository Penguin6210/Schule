
/**
 * Write a description of class Getraenk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Getraenkeautomat
{
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
