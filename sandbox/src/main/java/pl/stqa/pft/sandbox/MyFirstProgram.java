package pl.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {

        hello("word");


        Square s = new Square(5);
        System.out.println("powierzchnia boku kwadratu " + s.l + " = " + s.area());


        Rectangle r = new Rectangle(4, 6);
        //r.a =4;
        //r.b = 5;
        System.out.println("powierzchnia boku prostokąta " + r.a + " i " + r.b + area(r) );

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