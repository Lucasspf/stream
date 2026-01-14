package intermediate;

import java.time.Year;

public class AppMap {
    public static void main(String[] args) {

        var years = Student
                .list()
                .stream()
                .map(Student::yearOFBiRth)
                .mapToInt(Year::getValue)
                .toArray();

    }
}
