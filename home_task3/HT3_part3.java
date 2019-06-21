package home_task3;

public class HT3_part3 {
    public static void main(String[] args) {
        /*3. Создать текстовую строку
“Роняет лес багряный свой убор,
Сребрит мороз увянувшее поле,
Проглянет день как будто поневоле
 скроется за край окружных гор.”
 Пройтись по тексту и вывести сколько букв ‘о’ встречается.
         */

        String str = "Роняет лес багряный свой убор, Сребрит мороз увянувшее поле,, Проглянет день как будто поневоле,, скроется за край окружных гор.";
        str = str.replaceAll(", ", "\n");
        System.out.println(str);
        String o = "о";
        int len = str.length();
        int newstr = str.replaceAll(o, "").length();
        System.out.println("всего букв o - " + (len - newstr));
    }
}
