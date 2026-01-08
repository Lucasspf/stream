package basic;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        var people = List.of(
                new Person("Pedro", 15),
                new Person("Manoel", 21),
                new Person("Joana", 30),
                new Person("Rita", 29),
                new Person("Ricardo", 45)
        );

        people
                .stream()
                .map(Person::name)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
    record Person(String name ,int age ){

    }
}
