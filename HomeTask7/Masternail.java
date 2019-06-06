package HomeTask7;

public class Masternail {
    public static void main(String[] args) {
        Hand fig1 = new Hand(10);
        Frenchmanicure n1 = new Frenchmanicure(2, 8, 16);
        Gelpolish str = new Gelpolish();
        n1.setNail(6);

        Classicman c = new Classicman();
        c.select();
        Hand[] arr = {fig1, n1, str};
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i].select();
        }
    }
}

