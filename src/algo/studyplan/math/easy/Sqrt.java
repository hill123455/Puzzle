package studyplan.math.easy;

public class Sqrt {

    // https://leetcode.com/problems/sqrtx/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        System.out.println(mySqrt(0));
    }

    public static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int res = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > x/mid) {
                right = mid - 1;
            } else if (mid  < x/mid) {
                left = mid + 1;
                res = mid;
            } else {
                return mid;
            }
        }
        return res;
    }

}
