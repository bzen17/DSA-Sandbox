package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

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
        int row = 0, col = 0, left = 0, right = -1;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int totalSize = rowLength * colLength;
        int[] ans = { -1, -1 };
        for (int i = 0; i < totalSize; i++) {
            if (right != -1) {
                if (left > right) {
                    right = -1;
                    row = row + 1;
                } else {
                    int mid = (left + right) / 2;
                    if (matrix[0][mid] == target) {
                        ans[0] = 0;
                        ans[1] = mid;
                        return ans;
                    } else if (matrix[0][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }

            } else {
                if (row > rowLength - 1 || col > colLength - 1) {
                    return ans;
                }
                if (matrix[row][col] == target) {
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                } else if (matrix[row][col] < target) {
                    if (row == 0 && col == 0 && matrix[row][colLength - 1] < target) {
                        row = row + 1;
                        col = colLength - 1;
                    } else if (row == 0 && col == 0 && matrix[row][colLength - 1] > target) {
                        right = colLength - 1;
                    } else {
                        row = row + 1;
                    }
                } else {
                    col = col - 1;
                }
            }

        }
        return ans;
    }
}
