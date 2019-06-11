package hometask8;

    class Circle1 extends Figures implements Shape,FigureParam{
        private double r;
        Circle1 (double r){
            this.r=r;
        }
        @Override
        public String getName() {
            return "This is a Circle";
        }
        @Override
        public double getSquare() {
            return r*r*pi;
        }
        public double getPerimeter() {
            return 2*r*pi;
        }
        @Override
        public void measure() {
        }
        @Override
        public void figWam(){
        };
    }

