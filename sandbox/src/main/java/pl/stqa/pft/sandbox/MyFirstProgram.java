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


        Point a = new Point(4, 6);
        Point b = new Point(7, 8);

        System.out.println("length for " + a.x + " and " + b.y + " is " + a.distance() );

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