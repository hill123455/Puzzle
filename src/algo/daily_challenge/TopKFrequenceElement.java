package daily_challenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequenceElement {

    // https://leetcode.com/problems/top-k-frequent-elements/description/

    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        map.entrySet()
           .stream()
           .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
           .limit(k)
           .forEach(entry -> res.add(entry.getKey()));

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
