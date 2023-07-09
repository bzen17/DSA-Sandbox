package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// Time complexity: O(log n)
// Space complexity: O(1)

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 2, 3, 4, 6 },
                { 16, 19, 33, 36 },
                { 37, 38, 38, 41 },
                { 47, 47, 50, 51 },
                { 55, 57, 58, 62 },
                { 63, 65, 66, 66 },
                { 68, 70, 75, 77 },
                { 78, 84, 84, 86 },
                { 86, 87, 88, 92 },
                { 94, 95, 96, 97 },
        };
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        System.out.println(Arrays.toString(Solution(matrix, target)));
    }

    public static int[] Solution(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
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
