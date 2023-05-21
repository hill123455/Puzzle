package studyplan.array_string.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom {

    // https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&id=top-interview-150

    public static void main(String[] args) {
        InsertDeleteGetRandom insertDeleteGetRandom = new InsertDeleteGetRandom();
        insertDeleteGetRandom.insert(1);
        insertDeleteGetRandom.remove(2);
        insertDeleteGetRandom.insert(2);
        insertDeleteGetRandom.getRandom();
        insertDeleteGetRandom.remove(1);
        insertDeleteGetRandom.insert(2);
        insertDeleteGetRandom.getRandom();
    }

    private Set<Integer> set;
    private List<Integer> list;
    Random random;

    public InsertDeleteGetRandom() {
        set = new HashSet<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (set.add(val)) {
            list.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.remove(val)) {
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
