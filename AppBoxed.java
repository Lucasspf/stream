package intermediate;

import java.util.Arrays;
import java.util.List;

public class AppBoxed {
    public static void main(String[] args) {

        var numbers = List.of(1,2,3,4,5);
        var array = numbers
                .stream()
                .mapToInt(i -> i)
                .toArray();

        var list = Arrays
                .stream(array)
                .boxed()
                .toList();
    }
}
