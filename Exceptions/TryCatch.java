package Exceptions;

//Runtime errors are called exceptions.
public class TryCatch {
    public static void main(String[] args) {
        int i = 0;
        int  j =0;
        try //try this if something happens please throw exception
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
