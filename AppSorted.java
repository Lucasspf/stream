package intermediate;

import java.util.Comparator;

public class AppSorted {

    public static void main(String[] args) {

        var name = Student
                .list()
                .stream()
                .map(Student::name)
                .sorted()
                .toList();

        System.out.println(name);
    }
}
