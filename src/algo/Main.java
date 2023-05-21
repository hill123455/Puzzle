import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    // BFS Employment hero

    public static void main(String[] args) {
        String name1 = "fred";
        String name2 = "bill";
        String[] connection = { "fred:joe", "joe:mary", "mary:fred", "mary:bill" };

        System.out.println(solution(connection,name1,name2));
    }

    public static int solution(String[] connections, String name1, String name2) {
        Map<String, List<String>> connectionGraph = new HashMap<>();
        for (String connection : connections) {
            String[] names = connection.split(":");
            connectionGraph.putIfAbsent(names[0], new ArrayList<>());
            connectionGraph.putIfAbsent(names[1], new ArrayList<>());
            connectionGraph.get(names[0]).add(names[1]);
            connectionGraph.get(names[1]).add(names[0]);
        }

        Queue<String> queue = new LinkedList<>();
        queue.add(name1);
        Map<String, Integer> degreeMap = new HashMap<>();
        degreeMap.put(name1, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(name2)) {
                return degreeMap.get(current);
            }

            for (String neighbor : connectionGraph.get(current)) {
                if (!degreeMap.containsKey(neighbor)) {
                    queue.add(neighbor);
                    degreeMap.put(neighbor, degreeMap.get(current) + 1);
                }
            }
        }

        return -1;
    }

}
