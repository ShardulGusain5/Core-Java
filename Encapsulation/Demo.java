package  Encapsulation;

class Human
{
     private int  age;
     private String name;

     public void setName(String naam)
     {
        name = naam;
     }
     public void setAge(int a)
     {
        age = a;
     }
     public int getAge()
     {
        return age;
     }
     public String getName()
     {
        return name;
     }
}
public class Demo {
    public static void main(String[] args) {
        
        Human H = new Human();
        H.setAge(10);
        H.setName("Shardul");
        System.out.println(H.getName()+ " : "+H.getAge() );
    }
}
