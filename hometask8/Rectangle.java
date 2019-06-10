package hometask8;

public class Rectangle extends Figures {
    private double a2;

   Rectangle (double a2){
        this.a2=a2;
    }
    @Override
    public String getName(){
        return "This is Rectangle";
    }
    @Override
    public double getArea(){
        return a2*a2;
    }
    @Override
    double getPerim(){
        return 4*a2;
    }
}
