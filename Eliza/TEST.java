public class TEST
{
    public void hallo() 
    {
        Eingabeleser io=new Eingabeleser();
        String word=" ";
        while (!(((word.charAt(0)=='S'))||(word.charAt(0)=='s')))

        {
            System.out.println ("Hallo");
            word = io.gibEingabe();
        }
        System.out.println ( "Sehr gut ! Ihre eingabe lautete " + word);
    }
}