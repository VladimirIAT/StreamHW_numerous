import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> result = new ArrayList<>();
        //List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        for (int x : input) {
            if (x <= 0) continue;
            if (x % 2 != 0) continue;
            result.add(x);
        }
        Collections.sort(result);
        for(int counter: result) {
            System.out.println(counter);
        }
    }
}
