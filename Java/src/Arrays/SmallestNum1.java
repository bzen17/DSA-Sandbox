package Arrays;

import java.util.*;

// Time complexity: O(log n)
// Space complexity: O(1)
public class SmallestNum1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(solution(n));

    }

    public static int solution(int n) {
        String ans = "";
        for (int i = 9; i > 1; i--) {
            while (n % i == 0) {
                n = n / i;
                ans = i + ans;
            }
        }
        if (n != 1) {
            return -1;
        } else {
            return Integer.parseInt(ans);
        }
    }
}
