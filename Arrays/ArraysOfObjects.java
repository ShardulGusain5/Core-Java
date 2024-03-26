package Arrays;

class Student
{
    //Some instance Variables
    int marks;
    int rollno;
    String name;
}


public class ArraysOfObjects {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name = "shardul";
        s1.marks = 0;
        s1.rollno = 1;
        Student s2= new Student();
        s2.name = "Gusain";
        s2.marks = 0;
        s2.rollno = 1;
        Student s3= new Student();
        s3.name = "Yatendra";
        s3.marks = 0;
        s3.rollno = 1;
        //Creating an array that can hold STUDENT refernces
        Student students [] = new Student[3];
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }

    }
}
