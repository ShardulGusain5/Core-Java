package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(10);
        nums.add(10);
        nums.add(5);
        System.out.println(nums);
    }
}
