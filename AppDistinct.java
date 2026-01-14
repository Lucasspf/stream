package intermediate;

public class AppDistinct {
    public static void main(String[] args) {

        var grandes = Student
                .list()
                .stream()
                .flatMap(s -> s.grandes().stream())
                .distinct()
                .toList();
        System.out.println(grandes);
    }
}
