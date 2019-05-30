public class HT5_part2 {
    public static void main(String[] args){
        Point num1 = new Point(1,2);
        num1.info();
        Point num2 = new Point(3,5);
        num2.info();
        Point num3 = new Point(0,0);
        num3.info();
        Point num4 = new Point(5,9);
        num4.info();

        Point[]one = new Point[4];
        one[0]=num1;
        one[1]=num2;
        one[2]=num3;
        one[3]=num4;
        for (int j = 0; j < one.length - 1; j++) {
            one[j].info();}

        /*
        int [] arr=one[j].info;
        for (int j = 0; j < one.length - 1; j++) {
            if (one[j]%2==0)
                System.out.print(j+"");*/
            }
             }
class Point {
    int x;
    int y;
    void info(){
        System.out.println(x+y);
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;

    }
}