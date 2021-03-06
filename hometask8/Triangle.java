package hometask8;

class Triangle extends Figures implements Shape,FigureParam{
    private double a1;
    private double b1;
    private double c1;
    private double h;
    private double w;
    Triangle(double a1,double b1,double c1,double h,double w){
        this.a1=a1;
        this.b1=b1;
        this.c1=c1;
        this.h = h;
        this.w = w;
    }
    @Override
    public String getName(){
        return "This is a Triangle";
    }
  @Override
  public double getSquare(){
        return w*h;
  }
    @Override
    public double getPerimeter(){
        return (a1+b1+c1);
    }
    @Override
    public void measure() {
    }
    @Override
    public void figWam(){
    }
}
