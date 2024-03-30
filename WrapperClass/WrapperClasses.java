package WrapperClass;

public class WrapperClasses {
    public static void main(String[] args) {
        int n = 10;
        Integer num = new Integer(n);// boxing
        Integer num1 = n;// AutoBoxing
        String str = "155";
        int num3 = Integer.parseInt(str);
        System.out.println(n + " " + num1 + " " + num3);
    }

}
