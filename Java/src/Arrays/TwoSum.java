package Arrays;

import java.util.*;

// Time complexity: O(n)
// Space complexity: O(1)
public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] arr = { 11, 3, 7, 9, 14, 2 };
        int target = 17; // sum of two number in the above array should be equals target
        int[] ans = new int[2]; // output is array of indicies of the two numbers

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int second_num = target - arr[i];
            if (map.containsKey(second_num)) {
                ans[0] = map.get(second_num);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
