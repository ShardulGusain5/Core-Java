package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorInJava {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums);

        //Using Iterable interface
       Iterator <Integer> values = nums.iterator();
       while (values.hasNext()) {
        System.out.println(values.next());
       }
    }
}
