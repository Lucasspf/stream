package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App1 {
    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("A" ,"B", "C");

        String[] array = {"A" ,"B", "C"};
        Stream<String> s2 = Arrays.stream(array);


        List<String> list = List.of("A" ,"B", "C");
        Stream<String> s3 = list.stream();


        s1.forEach(System.out::println);
        s2.forEach(System.out::println);
        s3.forEach(System.out::println);
    }
}
