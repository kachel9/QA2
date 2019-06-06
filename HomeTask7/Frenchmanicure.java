package HomeTask7;

public class Frenchmanicure extends Hand {
    private int n;
    private int be;

    public void setNail(int n) {
        if (n > 0) {
            this.n = n;
        } else {
            System.out.println("Error FrenchNail");
        }
    }

    Frenchmanicure(int n, int be, int fig) {
        super(fig);
        this.n = n;
        this.be = be;
    }
    @Override
    public void select() {
        System.out.println("Class name: FrenchNail");
    }
}

