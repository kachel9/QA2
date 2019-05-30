import java.io.*;
public class HomeTask5_constructor {
    public static void main(String[] args) {
        MyInt a1=new MyInt(0);
        MyInt a2=new MyInt(2);
        a1.x=3;
        a2.x=a1.x;
        System.out.println(a1.x+""+a2.x);
        a1.x=4;
        System.out.println(a1.x+""+a2.x);
    }
}

