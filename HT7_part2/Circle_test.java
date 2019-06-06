package HT7_part2;

public class Circle_test {
        final double pi = 3.1415926536;
        double r;
        double perimeter;
        Circle_test() {
        }
        Circle_test(double r) {
            this.r = r;
        }
        public double getPerimeter(double r) {
            if (r > 0) {
                return perimeter=2*r*pi;
            } else {
                System.out.println("Радиус должен быть положителным");
            }
            return perimeter=2*r*pi;
        }
        public void select(){
            System.out.println("Perimeter: ");
        }
    }

