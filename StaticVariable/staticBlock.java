package StaticVariable;


class Sample 
{
    static String name;

    static 
    {
        name = "Shardul";
        }
}
public class staticBlock {
    public static void main(String[] args) {
        // Sample S = new Sample();
        Sample s1 =  new Sample();
        s1.name= "gUSAIN";
        System.out.println(Sample.name);

        Sample s2 = new Sample();
        s2.name = "hols";
        System.out.println(Sample.name);

    }
}
