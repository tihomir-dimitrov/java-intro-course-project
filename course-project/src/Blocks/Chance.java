package Blocks;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Chance {
    public static class NumberGenerator {
        private static Object Chance;

        public static void main(String[] args) {
            Random random = new Random();
            int[] ints = random.ints(1, 1, 100).sorted().toArray();
            int[] even = IntStream.of(ints).filter(x -> x % 2 == 0).toArray();
            int[] odd = IntStream.of(ints).filter(x -> x % 2 == 1).toArray();
            System.out.println(Arrays.toString(even));
            System.out.println(Arrays.toString(odd));
            System.out.println("Число което ти се падна: " + random);

            if (Chance != odd) {
                System.out.println("Днес си късметлия!: ");
            } else {
                System.out.println("Падна ти се нечетно число. Повече късмет следващия път!");
            }
        }
    }
}