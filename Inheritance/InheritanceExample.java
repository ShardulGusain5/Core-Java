package Inheritance;

/**
 * InheritanceExample
 */
class Calculator
{
    public void sum()
    {
        System.out.println("i am doing sum");
    }
    public void subtract()
    {
        System.out.println("I am doing subtraction");
    }
}
public class InheritanceExample {

    public static void main(String[] args) {
        Calculator C = new Calculator();
        C.sum();
        AdvanceCalc C1=  new AdvanceCalc();
        C1.Multi();
        C1.sum();
        
    }
}