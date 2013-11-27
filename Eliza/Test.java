public class Test
{
    public static void main(String args[]){
        Test test = new Test();
        test.hallo();
    }
    
    public void hallo() 
    {
        SimpleIO io=new SimpleIO();
       
        System.out.print("Hallo");
        System.out.print("\b123");
    }
}