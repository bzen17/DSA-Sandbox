package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// Time complexity: O(log n)
// Space complexity: O(1)

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 4, 6, 8, 10 },
                { 2, 7, 9, 12, 15 },
                { 3, 11, 20, 22, 24 },
                { 5, 16, 25, 30, 40 }
        };
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        System.out.println(Arrays.toString(Solution(matrix, target)));
    }

    public static int[] Solution(int[][] matrix, int target) {
        int i = 0, j = matrix.length - 1;
        int[] ans = { -1, -1 };
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
