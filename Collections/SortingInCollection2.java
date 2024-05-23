package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Sorting based on our own parameters
public class SortingInCollection2 {
    public static void main(String[] args) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i , Integer j)
            {
                if(i%10>j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
         List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(81);
        nums.add(17);
        nums.add(93);

        Collections.sort(nums, comp);

        for (Integer integer : nums) {
            System.out.println(integer);
        }
    }
}
