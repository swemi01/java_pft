package pl.stqa.pft.sandbox;

public class Point
{
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {

        double dx = this.x - this.x;
        double dy = this.y - this.y;
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
