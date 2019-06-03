import java.util.Scanner;

public class HomeTask4 {
    /*  1. Создайте 2 переменных типа int. int x = 3;int y = 4;
Без создания дополнительных переменных выведите на консоль сначало арифметическую сумму,
а затем просто значения двух переменных подряд (должно получиться 7 и 34).  */
    public static void main(String[] args) {
        /*
        int x = 3;
        int y = 4;
        System.out.println(x + y);
        System.out.print(x);
        System.out.print(y + "\n");
        /* 1.2.Пройдитесь по циклу от 1 до 100 и выведите все четные числа.
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + "");
        }

  4. Напишите программу, которая берет любую строку и меняет ее, сортируя слова в обратном порядке. Например, “я хочу есть” → “есть хочу я”*/
        String str = "я хочу есть";
        String[] arrayStr = str.split("\\s");
        String first;
        String last;
        int numb = arrayStr.length;
        System.out.print(str);
        first = arrayStr[0];
        last = arrayStr[numb - 1];

        for(int i1=0; i1<=numb; i1++) {
            if(i1 == 0) {
                arrayStr[0] = last;
            }
            if(i1 == numb) {
                arrayStr[numb-1] = first;
            }
        }
        System.out.println();

        for(int i1=0; i1 < numb; i1++) {
            System.out.print(arrayStr[i1] + " ");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите фразу: я хочу есть");
        String strr = sc.nextLine();
        String[] text = new String[5];
        String[] arrayStr = strr.split("\\s");
        String first;
        String last;
        int numb = arrayStr.length;

        first = arrayStr[0];
        last = arrayStr[numb - 1];

        for (int i1 = 0; i1 <= numb; i1++) {
            if (i1 == 0) {
                arrayStr[0] = last;
            }
            if (i1 == numb) {
                arrayStr[numb - 1] = first;
            }
        }
        System.out.println();

        for (int i1 = 0; i1 < numb; i1++) {
            System.out.print(arrayStr[i1] + " ");
        }
/*3 Различие >> и >>>
        int i = 5;
        i = i++;
        System.out.println(i);
        i = 5;
        i = i++ + i++;
        System.out.println(i);
        i = 5;
        i = i++ + ++i;
        System.out.println(i);
        i = 5;
        i = ++i + ++i;
        System.out.println(i);

различие между >> and >>>
оператор >> - является арифметическим сдвигом вправо
При каждом сдвиге вправо выполняется деление на два с отбрасыванием любого остатка.

Например,

15 >> 2
15:2 = 7 (отбросили остаток 1)
7:2=3 (отбросили остаток 1)

Итого, 15 >> 2 должно быть равно 3.

оператор >>> является логическим сдвигом вправо по целым числам, а не байтам
сдвиг вправо с заполнением нулями ">>>" и в таком случае знак "-" исчезает.

        int a1 =- 15;
        int b1 = 2;
        System.out.println(a1 >> b1);
        System.out.println(a1 >>> b1);
*/
    }
}
