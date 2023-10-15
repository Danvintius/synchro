import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String r = generateRoute("RLRFL", 100);
        int result = 0;
        for (int i = 0; i < r.length(); i++) {
            if (r.equals('R')) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static String generateRoute(String letters, int length) {
        Random random = new Random();
        StringBuilder route = new StringBuilder();
        for (int i = 0; i < length; i++) {
            route.append(letters.charAt(random.nextInt(letters.length())));
        }
        return route.toString();
    }
}
