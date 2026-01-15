package terminal;

import java.util.stream.Collectors;

public class AppCollect3 {

    public static void main(String[] args) {

        var itens = Item
                .list()
                .stream()
                .collect(Collectors.toMap(Item::name, Item::price));
        System.out.println(itens);
    }
}
