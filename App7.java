package basic;

import java.util.Arrays;
import java.util.Random;

public class App7 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = random
                .ints(10,0, 10)
                .toArray();
        System.out.println(Arrays.toString(array));

        double[] array2 = random
                .doubles(10,0, 10)
                .toArray();
        System.out.println(Arrays.toString(array2));
    }
}
