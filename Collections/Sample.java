package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Sample {
    public static void main(String[] args) {
        //Here Integer in the angular brackets in the generic type that tell us about the type of collection
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(6);
        nums.add(6);
        nums.add(6);
        System.out.println(nums);//we can directly print the collection

        for(int n :nums)
        {
            System.out.println(n);
        }
        

    }
}
