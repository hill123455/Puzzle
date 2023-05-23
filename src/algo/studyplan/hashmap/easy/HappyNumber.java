package studyplan.hashmap.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    // https://leetcode.com/problems/happy-number/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        while (set.add(n)) {
            sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }

        return false;
    }

    public int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy2(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if (fast == 1) {return true;}
        } while (slow != fast);
        return false;
    }

}
