package hometask_7;
public class Circle_test2 {
    final double pi = 3.14159;
    double r1;
    double per1;

    public void setR1(double r1) {
        if (r1 > 0) {
            this.r1 = r1;
        } else {
            System.out.println("Error Radius");
        }
    }
    public double getPer1() {
        return  (per1 = 2 * r1 * pi);
    }
     Circle_test2 (){}
    Circle_test2 (double r1){
        this.r1=r1;
    }
    Circle_test2 (double r1,double per1){
        this.r1=r1;
        this.per1=per1;
    }
    public void select() {
        System.out.println("Circle Perimeter : "+per1);
    }
    public static class Per_Circle {
        public static void main(String[] args) {
            Circle_test2 p11 = new Circle_test2(10);
            p11.getPer1();
            Circle_test2 p12 = new Circle_test2(25);
            p12.getPer1();
            p11.select();
            p12.select();
        }
    }
}
