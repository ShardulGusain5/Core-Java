package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        System.out.println(nums);

        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
