package hometask8;

public class Main {
    public static void main(String[] args) {
        Figures circle1 = new Circle1(10);
        System.out.println("Имя фигуры: " + circle1.getName());
        System.out.println("Площадь круга: " + circle1.getArea());
        System.out.println("Периметр круга: " + circle1.getPerim());
        System.out.println();
       Figures triangle = new Triangle(12.5, 13.6, 4, 6, 4.5);
        System.out.println("Имя фигуры: " + triangle.getName());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerim());
        System.out.println();
         Figures rectangle = new Rectangle(2);
        System.out.println("Имя фигуры: " + rectangle.getName());
        System.out.println("Площадь квадрата: " + rectangle.getArea());
        System.out.println("Периметр квадрата: " + rectangle.getPerim());

    }
}


