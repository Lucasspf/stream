package terminal;

import java.util.stream.Collectors;

public class AppCollect6 {

    public static void main(String[] args) {

         Item
                .list()
                .stream()
                .collect(Collectors.partitioningBy(i -> i.price() >= 5))
                .forEach((k,v ) -> System.out.println(k + " => " + v));


    }
}
