import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : intList) {
            if (i > 0) {
                if (i % 2 == 0) {
                    result.add(i);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
