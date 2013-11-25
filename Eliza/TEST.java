public class TEST
{
    public static void main(String args[]){
        TEST test = new TEST();
        test.hallo();
    }
    
    public void hallo() 
    {
        SimpleIO io=new SimpleIO();
        String word=" ";
        while (!(((word.charAt(0)=='S'))||(word.charAt(0)=='s')))

        {
            System.out.println ("Hallo");
            word = io.readline(">");
            if (!(word.equals(""))){
                word = " ";
            }
        }
        System.out.println ( "Sehr gut ! Ihre eingabe lautete " + word);
    }
}