import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Nab2 {

    public static void main(String[] args) {
//        System.out.println(solution2("b"));
//        System.out.println(solution2("a"));

//        System.out.println(solution(".X..X"));
//        System.out.println(solution("XX.XXX.."));
//        System.out.println(solution("XXX"));
//        System.out.println(solution("......."));
//        System.out.println(solution("X....X....."));
//        System.out.println(solution("X......XXX.."));

        int[] A = { 1, 2, 1, 3 };
        int[] B = { 2, 4, 3, 4 };
        System.out.println(solution3(4, A, B));
    }

    public static int solution2(String s) {
        int minDeleteB = 0;
        int minDelete = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                minDelete = Math.min(minDeleteB, minDelete + 1);
            } else {
                minDeleteB++;
            }
        }
        return minDelete;
    }

    public static int solution(String S) {
        char[] roads = S.toCharArray();
        int minPatches = 0;

        for (int i = 0; i < roads.length; i++) {
            if (roads[i] == 'X') {
                i += 2;
                minPatches++;
            }
        }
        return minPatches;
    }

    public static boolean solution3(int N, int[] A, int[] B) {
        List<List<Integer>> vertextConnect = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            vertextConnect.add(new ArrayList<>());
        }

        for (int i = 0; i < A.length; i++) {
            vertextConnect.get(A[i]).add(B[i]);
            vertextConnect.get(B[i]).add(A[i]);
        }

        int prevIdx = 0;
        for (int i = 1; i < N + 1; i++) {
            if (vertextConnect.get(i).isEmpty()) {return false;}
            if (i != 1 && !vertextConnect.get(i).contains(prevIdx)) {return false;}
        }

        return true;
    }

    public static boolean solution(int N, int[] A, int[] B) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < A.length; i++) {
            int u = A[i];
            int v = B[i];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        boolean[] visited = new boolean[N + 1];
        visited[1] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        int nextVertex = 2;

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (nextVertex == N + 1) {
                return true;
            }

            if (adjacencyList.get(current).contains(nextVertex)) {
                visited[nextVertex] = true;
                stack.push(nextVertex);
                nextVertex++;
            } else if (adjacencyList.get(current).contains(nextVertex - 1)) {
                visited[nextVertex - 1] = true;
                stack.push(nextVertex - 1);
                nextVertex++;
            }

            for (int neighbor : adjacencyList.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }

        return false;
    }
}
