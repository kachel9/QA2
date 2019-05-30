import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        /* 1. Написать программу, которая вычисляет корни квадратного уравнения,
        и выводит их в консоль. Коэффициенты для уравнения пользователь должен вводить в консоли. */
       /* System.out.println("Выяисление корней квадратного уравнения вида ax^2+bx+c");
        Scanner x = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        float a, b, c, d, x1, x2;
        a = x.nextFloat();
        System.out.print("Введите значение b: ");
        b = x.nextFloat();
        System.out.print("Введите значение c: ");
        c = x.nextFloat();
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        d = (float) Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            System.out.println("Уравнение не имеет корней.");
        } else {
            if (d == 0) {
                x1 = b / (-2 * a);
                System.out.println("Уравнение имеет 1 корень х= " + x1);
            } else {
                x1 = -b + (float) (Math.sqrt(d)) / 2 * a;
                x2 = -b - (float) (Math.sqrt(d)) / 2 * a;
                System.out.println("x1= " + x1 + "; x2= " + x2);
            }
        } */
      /*2. Написать программу, которая может находить минимальное и
максимальное число из поданного ряда целых чисел.
Например: пользователь в консоли, вводит числовой ряд разделённый
пробелами: 1 43 4 35 0 56 7 71 96 23. */
        System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] numbers = new Integer[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        for (int i = 0; i < size; i++)
            numbers[i] = in.nextInt();



    }



    }





