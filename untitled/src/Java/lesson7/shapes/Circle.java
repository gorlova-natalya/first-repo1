package Java.lesson7.shapes;

public class Circle extends Shape {

    double radius;
    static final double P = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTheArea() {
        double area;
        area = P * (radius * radius);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = 2 * P * radius;
        return perimeter;
    }

    public void printResults () {
        System.out.println("Площадь круга " + calculateTheArea() + ", периметр круга " + calculatePerimeter());
    }
}
