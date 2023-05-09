import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    public static int fibonacci(int num) {
        if (num == 0) {return 0;}
        if (num == 1) {return 1;}
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    private static Map<Integer, Integer> cache = new HashMap<>();

    public static int fibonacci2(int num) {
        if (num == 0) {return 0;}
        if (num == 1) {return 1;}
        if (cache.containsKey(num)) {return cache.get(num);}
        cache.put(num, fibonacci2(num - 1) + fibonacci2(num - 2));
        return cache.get(num);
    }
}
