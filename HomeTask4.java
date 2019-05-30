public class HomeTask4 {
    /*  1. Создайте 2 переменных типа int. int x = 3;int y = 4;
Без создания дополнительных переменных выведите на консоль сначало арифметическую сумму,
а затем просто значения двух переменных подряд (должно получиться 7 и 34).  */
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x + y);
        System.out.print(x);
        System.out.print(y+"\n");
        /* 1.2.Пройдитесь по циклу от 1 до 100 и выведите все четные числа.*/
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i + "");
        }
        /* 3 Различие >> и >>> */
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
        /* 4. Напишите программу, которая берет любую строку и меняет ее, сортируя слова в обратном порядке. Например, “я хочу есть” → “есть хочу я”*/
        String str ="я хочу есть";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nПервоначальная строка: "+str);
        System.out.println("Перевернутая Cтрока: "+reverse);

    }
}

