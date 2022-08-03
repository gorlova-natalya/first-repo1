package Java.lesson7.shapes;

public class Triangle extends Shape {

    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateTheArea() {
        double area;
        double p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = a + b + c;
        return perimeter;
    }

    public void printResults () {
        System.out.println("Площадь треугольника " + calculateTheArea() + ", периметр треугольника "
                + calculatePerimeter());
    }
}