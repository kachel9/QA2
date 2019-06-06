package HT7_part2;

public class Perimeters {
        public static void main(String[] args) {
            Circle_test p1=new Circle_test(10);
            p1.getPerimeter(10);
            Circle_test p2=new Circle_test(25);
            p2.getPerimeter(25);
            System.out.println(p1.perimeter);
            System.out.println(p2.perimeter);

        }
    }
