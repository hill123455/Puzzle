import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllPairEqualTarget {

    public static void main(String[] args) {
        System.out.println(find(new int[] { 1, 2, 3, 4 }, 7));
    }

    public static List<List<Integer>> find(int[] nums, int target) {
        List<List<Integer>> subList = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        subList.add(new ArrayList<>());

        for (int num : nums) {
            int n = subList.size();
            for (int j = 0; j < n; j++) {
                List<Integer> list = new ArrayList<>(subList.get(j));
                list.add(num);
                subList.add(list);
                if (list.stream().mapToInt(Integer::intValue).sum() == target) {
                    res.add(list);
                }
            }
        }

        return res;
    }
}
