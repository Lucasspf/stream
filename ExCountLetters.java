package terminal;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExCountLetters {

    public static void main(String[] args) {

        System.out.println(count("JavA"));
        System.out.println(count("Object oriented"));
        System.out.println(count("package"));
        System.out.println(count("override"));
    }

    private static Map<Character, Long> count(String str){
        return Optional
                .ofNullable(str)
                .map(s -> s.toUpperCase())
                .stream()
                .flatMapToInt(String::chars)
                .mapToObj(i -> (char) i )
                .filter(c -> !Character.isWhitespace(c))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                            )
                        );
    }
}
