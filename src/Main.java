import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] routes = new String[1000];
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            routes[i] = generateRoute("RLRFL", 100);

            char[] arr = routes[i].toCharArray();
            int result = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 'R') {
                    result++;
                }
            }
            System.out.println(routes);
            System.out.println(result);
        }

    }

    public static final Map<Integer, Integer> sizeToFreq;

    public static String generateRoute(String letters, int length) {
        Random random = new Random();
        StringBuilder route = new StringBuilder();
        for (int i = 0; i < length; i++) {
            route.append(letters.charAt(random.nextInt(letters.length())));
        }
        return route.toString();
    }
}
