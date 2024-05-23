package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingInCollection {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(1);
        nums.add(0);

        Collections.sort(nums);

        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
