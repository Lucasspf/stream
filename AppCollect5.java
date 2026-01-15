package terminal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AppCollect5 {

    public static void main(String[] args) {

        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(
                        i -> i.name().charAt(0),
                           // Collectors.counting()
                           // Collectors.summingDouble(Item::price)
                            Collectors.maxBy(Comparator.comparing(Item::price))
                        )
                )
                .forEach(
                        (k , v )-> System.out.println(k + " => " + v)
                );
    }
}
