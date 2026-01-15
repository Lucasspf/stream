package terminal;

public class AppRduce2 {

    public static void main(String[] args) {

        var itens = Item
                .list()
                .stream()
                .map(Item::name)
                .reduce("", String::concat);

        System.out.println(itens);
    }
}
