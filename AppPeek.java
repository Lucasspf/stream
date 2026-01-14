package intermediate;

public class AppPeek {

    public static void main(String[] args) {

        var avg = Student
                .list()
                .stream()
                .peek (s -> System.out.println("Inicial stream: " + s))
                .flatMap(s -> s.grandes().stream())
                .peek(s -> System.out.println("After flatMap: " + s))
                .mapToDouble(d -> d)
                .peek(s -> System.out.println("After mapToDouble: " + s))
                .average()
                .orElse(0);
        System.out.println(" = " + avg );
    }
}
