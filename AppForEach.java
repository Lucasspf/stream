package terminal;

public class AppForEach {
    public static void main(String[] args) {

        Item
                .list()
                .forEach(System.out::println);
    }
}
