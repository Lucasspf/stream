package terminal;

public class AppMath {

    public static void main(String[] args) {

        boolean item = Item
                .list()
                .stream()
                .map(Item::name)
                .anyMatch( n -> n.startsWith("C"));
        System.out.println(item);

        boolean item2 = Item
                .list()
                .stream()
                .map(Item::name)
                .allMatch( n -> n.startsWith("C"));
        System.out.println(item2);

        boolean item3 = Item
                .list()
                .stream()
                .map(Item::name)
                .noneMatch( n -> n.startsWith("Z"));
        System.out.println(item3);
    }
}
