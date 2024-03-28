package AccessModifiers.Demo;

import AccessModifiers.Sample;

public class Demo {
    public static void main(String[] args) {
        Sample S = new Sample();
        S.marks = 10;//As the variable is outside of this package hence need to be declared public variable to be accessible.
    }
}
