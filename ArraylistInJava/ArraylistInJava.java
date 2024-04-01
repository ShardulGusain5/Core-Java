package ArraylistInJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistInJava {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(1);
        nums.add(17);

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println(nums);
    }
}
