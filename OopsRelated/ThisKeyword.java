package OopsRelated;

class Human
{
    int age;
    String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
       // age = age;  // Here age is local variable
       this.age= age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
      //  name = name; // Here name is local variable
      this.name = name;
    }
    
}
public class ThisKeyword {
    public static void main(String[] args) {
        Human H = new Human();
        H.setAge(10);
        H.setName("Shardul");
        System.out.println(H.name+ " : "+H.age);

    }
}
