package terminal;

import java.util.stream.Collectors;

public class AppCollect4 {

    public static void main(String[] args) {

        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(i -> i.name().charAt(0)))
                .forEach((k , v )-> System.out.println(k + " => " + v) );


    }
}
