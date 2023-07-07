import java.util.*;

// Time complexity: O(n^2)
// Space complexity: O(1)
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { 7, -6, 3, 8, -1, 8, -11 };
        int target = 0; // sum of three number in the above array should be equals target
        solution(arr, target, arr.length);
    }

    public static void solution(int[] a, int target, int n) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (i == 0 || (a[i] != a[i - 1])) {
                int j = i + 1, k = n - 1;
                int tar = target - a[i];
                while (j < k) {
                    int twoSum = a[j] + a[k];
                    if (twoSum == tar) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        while (j < k && a[j] == a[j + 1])
                            j++;
                        while (j < k && a[k] == a[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (twoSum < tar) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
    }
}
