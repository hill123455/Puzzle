import java.util.HashSet;
import java.util.Set;

public class NearbyDuplicate {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.size() > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {return true;}
        }
        return false;
    }
}
