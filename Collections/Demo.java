package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Student
 */
class Student {

    int age;
    String name;

    Student(int a, String naam)
    {
        this.age= a;
        this.name= naam;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }
}


public class Demo {
    public static void main(String[] args) {
        Comparator<Student> comp = new Comparator<Student>() {
            public int compare(Student i , Student j)
            {
                if(i.age>j.age)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(100000, "shardul"));
        studs.add(new Student(100, "gusain"));
        studs.add(new Student(1000, "kabali"));
        studs.add(new Student(10000, "don"));

        System.out.println(studs);

        Collections.sort(studs,comp);

        System.out.println(studs);
    }
}
