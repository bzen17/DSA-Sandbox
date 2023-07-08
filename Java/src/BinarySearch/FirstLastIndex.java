package BinarySearch;

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 5, 5, 5, 5, 5, 5, 7, 7, 7, 7, 7, 8, 8 };
        int target = 7;
        System.out.println(Arrays.toString(arr));
        Solution(arr, target);

    }

    // Time complexity: O(log n)
    // Space complexity: O(1)

    public static void Solution(int[] arr, int target) {
        int first = -1, last = -1;
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                if (first != -1) {
                    if (arr[mid + 1] > target) {
                        last = mid;
                        System.out.println(first + " " + last);
                        break;
                    } else {
                        left = mid + 1;
                    }
                } else {
                    if (arr[mid - 1] < target) {
                        first = mid;
                        left = mid + 1;
                        right = arr.length - 1;
                    } else {
                        right = mid - 1;
                    }
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
