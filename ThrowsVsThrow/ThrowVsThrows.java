package ThrowsVsThrow;

public class ThrowVsThrows {
    public static void main(String[] args) {
        int i =19;
        int j = 0;

        try
        {
            j =18/i;
            if(j==0)  //calling the catch block even exception is not there
            {
                throw new ArithmeticException("Hahahah"); //object of this class is thrown 
            }
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            //Here we are trying to handle the exceptions like if primary db connection failed connect to backup
            System.out.println(e);
            System.out.println("hello Arithmetic Exception");
        }
    }
}
