package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class App6 {

    public static void main(String[] args) {

        List<Integer> numbers = Stream
                .generate(() -> 5)
                .limit(10)
                .toList();
        System.out.println(numbers);

       double[] array =  DoubleStream.generate(() -> 3.5).limit(3).toArray();
        System.out.println(Arrays.toString(array));
    }
}
