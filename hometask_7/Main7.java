package hometask_7;
public class Main7 {
    public static void main(String[] args) {
        God god = new God("It", "Eath", "No Pray");
        Adam ad = new Adam("Adam", "MAN", "dark", "PRAY");
        Eva eva = new Eva("Eva", "WOMAN", "green");
        Earth earth = new Earth("E", 12700);
        ad.setName("ADAMUS");
        eva.setName("EVUSHKA");
        earth.setName("EARTH");
        ad.setHcolor("BLOND");
        eva.setYye("BLUE");
        earth.select();
        God[] arr = {ad, eva, earth};
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i].select();
        }
    }
}
