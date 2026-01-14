package intermediate;

import java.time.Year;
import java.util.Comparator;
import java.util.List;

public class ExAverage {
    public static void main(String[] args) {

        var students = List.of(
                new Student("José" ,  List.of(8.5, 10.0, 9.0)),
                new Student("Pedro",  List.of(7.0, 7.0, 7.0)),
                new Student("Maria",  List.of(6.0, 9.0, 4.0)),
                new Student("Sara" ,  List.of(6.5, 7.0, 7.5)),
                new Student("Rodrigo", List.of(4.5, 3.0, 6.5))
        );
        students
             .stream()
                .map(
                s -> new Rank(
                        s.name,
                        s.grades.stream().mapToDouble(g -> g).average().orElse(0)
                )
             )
                .sorted(Comparator.comparing(Rank::average).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    private record Student (String name, List<Double> grades){}

    private record Rank ( String name, double average){}
}
