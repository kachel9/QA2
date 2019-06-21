package home_task3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class HT3_part2 {

    public static void main(String[] args) {
          /*2. Написать программу, которая может находить минимальное и
максимальное число из поданного ряда целых чисел.
Например: пользователь в консоли, вводит числовой ряд разделённый
пробелами: 1 43 4 35 0 56 7 71 96 23. */
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        Scanner sc = new Scanner(System.in);
        String intr = sc.nextLine();
        String[] ss = intr.split(" ");
        int[] numbers = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            numbers[i] = Integer.parseInt(ss[i]);
           // System.out.println(numbers[i]);
        }
        int[] fo = numbers;
        int max=fo[0];
        for (int i = 0; i < fo.length; i++)
            max = Math.max(max,fo[i]);
        int min=fo[0];
        for (int i = 0; i < fo.length; i++)
            min = Math.min(min,fo[i]);
        //Arrays.sort(fo, Collections.reverseOrder());
        System.out.println("Max value: " +max);
        System.out.println("Min value: " +min);
    }
}



        /*List<Integer> ints = Stream.of(intr).collect(Collectors.toList());

        ints.forEach((i) -> {
            System.out.print(i + " ");
        });
        System.out.println("");
        Integer minNumber = ints.stream()
                .min(Comparator.comparing(i -> i)).get();
        Integer maxNumber = ints.stream()
                .max(Comparator.comparing(i -> i)).get();

        System.out.println("Min number is " + minNumber);
        System.out.println("Max number is " + maxNumber);*/








