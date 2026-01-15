package terminal;

import java.util.stream.Collectors;

public class AppCollect1 {

    public static void main(String[] args) {

        var itens1 = Item
                .list()
                .stream()
                .toList();
        System.out.println(itens1);

        var itens2 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(itens2);

        var itens3 = Item
                .list()
                .stream()
                .collect(Collectors.toSet());
        System.out.println(itens3);

        var itens4 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(itens4);
    }
}
