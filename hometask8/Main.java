package hometask8;

public class Main {
    public static void shapeMes(Shape arg){
        arg.measure();
    }
    public static void finPar(FigureParam arg){
        arg.figWam();
    }
    public static void main(String[] args) {
       /*Figures circle1 = new Circle1(10);

        System.out.println("Имя фигуры: " + circle1.getName());
        System.out.println("Площадь круга: " + circle1.getSquare());
        System.out.println("Периметр круга: " + circle1.getPerimeter());
        System.out.println();
       Figures triangle = new Triangle(12.5, 13.6, 4, 6, 4.5);
        System.out.println("Имя фигуры: " + triangle.getName());
        System.out.println("Площадь треугольника: " + triangle.getSquare());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println();
         Figures rectangle = new Rectangle(2);
        System.out.println("Имя фигуры: " + rectangle.getName());
        System.out.println("Площадь квадрата: " + rectangle.getSquare());
        System.out.println("Периметр квадрата: " + rectangle.getPerimeter());*/

        Triangle tr1=new Triangle(1.2,2.3,3,4,5.5);
        shapeMes(tr1);

        shapeMes(new Shape() {
            @Override
            public void measure() {
                System.out.println("Имя фигуры: "+tr1.getName());
                System.out.println("Площадь треугольника: "+tr1.getSquare());
                System.out.println("Периметр треугольника: "+tr1.getPerimeter());
            }
        });
        Circle1 cir2=new Circle1(2.4);
        finPar(cir2);
        Triangle tr2=new Triangle(1.2,2.3,3,4,5.5);
        finPar(tr2);
        Rectangle rec2=new Rectangle(2.2);
        finPar(rec2);
        finPar(new FigureParam() {
            @Override
            public void figWam() {
                System.out.println("Имя фигуры #2: "+rec2.getName());
                System.out.println("Площадь квадрата #2: "+rec2.getSquare());
                System.out.println("Периметр квадрата #2: "+rec2.getPerimeter());
                System.out.println("Имя фигуры #2: "+tr2.getName());
                System.out.println("Площадь треугольника #2: "+tr2.getSquare());
                System.out.println("Периметр треугольника #2: "+tr2.getPerimeter());
                System.out.println("Имя фигуры #2: "+cir2.getName());
                System.out.println("Площадь круга #2: "+cir2.getSquare());
                System.out.println("Периметр круга #2: "+cir2.getPerimeter());

            }
        });

    }
}


