import java.lang.reflect.Array;

public class HomeTask2_Arr_String {
    public static void main(String[] args) {
        // 1. Выведите в консоль одну строку с числами из массива разделенными “;

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[0] + ";" + nums[1] + ";" + nums[2] + ";" + nums[3] + ";" + nums[4]);
/*2. Создайте переменную со строкой “Мама мыла раму”.
Создайте массив из всех слов, которые встречаются в этой строке.
(Посмотрите на методы строки и подумайте, какой метод можно использовать)*/

        String s = "Мама мыла раму";
        String[] str = {"Мама", "мыла", "раму"};
        System.out.println(str[0] + " " + str[1] + " " + str[2]);

        /*3. Создайте строку “Я хочу переносы строк.”
 Замените все символы пробела в строке, на символы переноса строк и выведите в консоль.*/

        String s1 = "Я хочу переносы строк.";
        s1 = s1.replaceAll(" ", "\n");
        System.out.println(s1);

        /*1.1. Создайте массив из целых чисел и поместите сразу 10 значений.
        Пройдитесь по ним и поменяйте значения.*/
        int[] nums1 = new int[10];
        nums1[0]=11;
        nums1[1]=22;
        nums1[3]=33;
        nums1[4]=44;
        nums1[5]=55;
        nums1[6]=66;
        nums1[7]=77;
        nums1[8]=88;
        nums1[9]=99;
        int[] nums2 = {10, 20, 30,40,50,60,70,80,90,100};
        nums2[1]=99;
        nums2[0]=0;
        //1.2.Создайте массив из дробных чисел (5 элементов).
        double nums3 [] = {11.1, 12.4, 15.55, 16.4,3.9};
        System.out.println(nums3[2]);
        /* 1.3. Создайте 3 переменных таких типов: byte, int, long. Создайте массив
типа int. Попытайтесь туда положить переменные. */
        byte b=-127;
        int i=0;
        long l=1234567899;
        long[] inter={b,i,l};

        /* 1.4. Создайте любой двумерный массив, заполните любыми данными и
        выведите в консоль     */
        int[][]arr1={{13, 29, 37, 57},{10, 24, 36, 88}};
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[0][3]);
        System.out.println(arr1[0][0]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);
        System.out.println(arr1[1][3]);
        // 3.1. Создайте строку "Hello world!"
        String w="Hello world!";
       // Выведите первый символ
        System.out.println(w.charAt(0));
        //Выведите последний символ
        System.out.println(w.charAt(w.length()-1));
       // Создайте массив символов, положите туда все символы слова world .Вывести массив в консоль
        String st=new String (new char[]{'w','o','r','l','d'});
      /*Вывести в консоль предпоследний элемент массива не используя
      прямой доступ по индексу (arr[3] – не сгодится)*/
        System.out.println(st.charAt(st.length()-1));

        /*2. Another variant
         Создайте переменную со строкой “Мама мыла раму”.
Создайте массив из всех слов, которые встречаются в этой строке.
(Посмотрите на методы строки и подумайте, какой метод можно использовать)*/
      String ma="Мама мыла раму";
      String [] marr=ma.split(" ");
      for (String ww:marr){
      System.out.println(ww);}
      // a++ ; ++a ; b --; --b;

        int y=6;
      int z=5;
      y++;
      int v=y+z;
      System.out.println("Increment1="+v);

      int a1=6;
              int b1=5;
              --b1;
              int c1=a1+b1;
        System.out.println("Decrement2="+c1);












    }


}
