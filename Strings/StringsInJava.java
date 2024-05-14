package Strings;

public class StringsInJava {
    public static void main(String[] args) {
        String s1 = "Shardul";
        String s2 = "Shardul";
        System.out.println(s1==s2);
        s1 = s1 + "singh";
        System.out.println(s1);
        System.out.println(s1==s2);
        s1= "Shardul"+"";
        System.out.println(s1==s2);
    }
}
