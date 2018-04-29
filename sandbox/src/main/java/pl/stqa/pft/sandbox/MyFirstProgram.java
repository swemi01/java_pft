package pl.stqa.pft.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.net.SocksProxy;

public class MyFirstProgram {
    public static void main(String[] args) {

        hello("word");

        //tworzymy nowy obiekt
        Square s = new Square(5);
        System.out.println("powierzchnia boku kwadratu " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4, 6);
        //r.a =4;
        //r.b = 5;
        System.out.println("powierzchnia boku prostokąta " + r.a + " i " + r.b + area(r) );


        //Point
        Point p1 = new Point(4,1);
        Point p2 = new Point(3,1);


    }

    public static void hello(String sombody)
    {

        System.out.println("Hello " + sombody);
    }


    public static double area (Rectangle r)
    {
        return r.a * r.b;
    }
}