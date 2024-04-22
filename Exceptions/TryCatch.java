package Exceptions;

//Runtime errors are called exceptions.
public class TryCatch {
    public static void main(String[] args) {
        int i = 1;
        int  j =0;
        try
        {
            j=18/i;
            System.out.println("hello");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
    }
}
