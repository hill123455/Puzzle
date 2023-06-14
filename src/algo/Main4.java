import java.util.*;

public class Main4 {

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(map.values());
        int maxFreq = maxHeap.poll();

        int totalIdleTime = (maxFreq - 1) * n;

        // Now looping through all the frequencies
        while (!maxHeap.isEmpty()) {
            int currentFreq = maxHeap.poll();
            // If its equal to max frequency then we need add 1 since we need to consider the last task
            // Example A B idle A B idle A B (so this B needs to be considered)
            if (currentFreq == maxFreq) {
                totalIdleTime -= currentFreq;
                totalIdleTime += 1;
            } else {
                // else we just keep subtracting idle time
                totalIdleTime -= currentFreq;
            }
        }

        // If its greater than zero the add it with tasks length
        if (totalIdleTime > 0) {
            return totalIdleTime + tasks.length;
        } else {
            return tasks.length;
        }
    }
}
