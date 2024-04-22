package ThrowsVsThrow;
class ShardulException extends Exception
{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "shardul exceptions";
    }
}

public class MyException {
    public static void main(String[] args) {
        int i =5;
        int j =0;
        try {
            j = j/5;
            if(j==0)
            {
                throw new ShardulException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
