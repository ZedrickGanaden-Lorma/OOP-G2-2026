package OOP_G2_2026.Practice.Week2;

public class Circle {
    public Circle(double radius){
        this.radius = radius;
    }
    double radius;
    final double PI = 3.1416f;

    double getArea() {
        return PI * Math.pow(radius, 2);
    }
}
