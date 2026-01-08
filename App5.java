package basic;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App5 {
    public static void main(String[] args) {
        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );
        List<String> names =  people
                .stream()
                .map(Person::name)
                .map(String::toUpperCase)
                .filter(n -> !n.startsWith("R"))
                .toList();

        System.out.println(names);

    }
    record Person(String name ,int age ){

    }
}
