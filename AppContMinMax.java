package terminal;

public class AppContMinMax {

    public static void main(String[] args) {
        long cont = Item
                .list()
                .stream()
                .count();

        double max = Item
                    .list()
                    .stream()
                    .mapToDouble(Item::price)
                    .max()
                    .orElseThrow();
        double min = Item
                .list()
                .stream()
                .mapToDouble(Item::price)
                .min()
                .orElseThrow();

        double avg = Item
                .list()
                .stream()
                .mapToDouble(Item::price)
                .average()
                .orElseThrow();


        System.out.println("cont = " + cont);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);


    }
}
