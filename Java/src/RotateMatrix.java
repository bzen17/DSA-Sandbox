import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        print(matrix);
        System.out.println("-----------------");
        transpose(matrix);
        print(matrix);
    }

    public static void print(int[][] m) {
        for (int[] a : m) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m[0].length; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        int left = 0, right = m[0].length - 1;
        while (left < right) {
            for (int i = 0; i < m.length; i++) {
                int temp = m[i][left];
                m[i][left] = m[i][right];
                m[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}
