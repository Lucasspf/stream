package terminal;

public class AppFind {
    public static void main(String[] args) {

        Item item = Item
                .list()
                .stream()
                .filter(i -> i.price() >= 5.0)
                .findFirst()
                .orElse(null);

        System.out.println(item);
    }
}
