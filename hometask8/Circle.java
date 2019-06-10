package hometask8;

class Circle1 extends Figures {
    private double r;
   Circle1 (double r){
       this.r=r;
    }
    @Override
    public String getName() {
        return "This is a Circle";
    }
    @Override
    public double getArea() {
        return r*r*pi;
    }
    public double getPerim() {
        return 2*r*pi;
    }
}
