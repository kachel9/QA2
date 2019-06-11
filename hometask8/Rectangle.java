package hometask8;

class Rectangle extends Figures implements Shape,FigureParam{
    private double a2;
   Rectangle (double a2){
        this.a2=a2;
    }
    @Override
    public double getPerimeter() {
        return 4*a2;
    }
    @Override
    public double getSquare() {
        return  a2*a2;
    }
    @Override
    public String getName(){
        return "This is Rectangle";
    }
    @Override
    public void measure() {
    }
    @Override
    public void figWam(){
    }
}
