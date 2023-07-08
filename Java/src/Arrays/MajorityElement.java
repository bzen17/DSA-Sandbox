package Arrays;

import java.util.*;

// Time complexity: O(n)
// Space complexity: O(1)
public class MajorityElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = { 5, 7, 4, 7, 4, 3, 7, 4, 4, 7, 7, 2, 5, 7 };
        // Start time
        long begin = System.nanoTime();
        System.out.println(solution(arr, n));
        // End time
        long end = System.nanoTime();
        long time = end - begin;
        System.out.println("Elapsed Time: " + time);
    }

    public static int solution(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) == n / 2) {
                return a[i];
            }
        }
        return -1;
    }
}
