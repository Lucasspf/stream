package intermediate;

public class AppFilter {

    public static void main(String[] args) {

        var studaent = Student
                .list()
                .stream()
                .filter(s -> s.yearOFBiRth().getValue() >= 2005)
                .toList();
        System.out.println(studaent);
        System.out.println("_______________");

        var gramde = Student
                .list()
                .stream()
                .flatMap(s -> s.grandes().stream())
                .filter(g -> g >= 7.0)
                .toList();

        System.out.println(gramde);
    }
}
