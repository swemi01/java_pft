package pl.stqa.pft.sandbox;

public class my_first {
    public static void main(String[] args) {

        hello("word");
        hello("szymon");

        double l = 5;
        System.out.println("powierzchnia boku kwadratu " + l + " = " + area(l));

        double a =4;
        double b = 6;
        System.out.println("powierzchnia boku prostokąta " + a + " i " + b + area(a, b) );
    }

    public static void hello(String sombody)
    {

        System.out.println("Hello " + sombody);
    }

    public static double area (double len)
    {
        return len * len;
    }

    public static double area (double a, double b)
    {
        return a * b;
    }
}