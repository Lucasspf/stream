package terminal;

import java.util.stream.Collectors;

public class AppCollect2 {

    public static void main(String[] args) {

        var name = Item
                .list()
                .stream()
                .map(Item::name)
                .collect(Collectors.joining(",", "==>", "<=="));
        System.out.println(name);

    }
}
