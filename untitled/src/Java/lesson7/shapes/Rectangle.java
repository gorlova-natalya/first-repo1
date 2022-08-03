package Java.lesson7.shapes;

public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateTheArea() {
        double area;
       area = a * b;
       return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter;
        perimeter = (a + b) * 2;
        return perimeter;
    }

    public void printResults () {
        System.out.println("Площадь прямоугольника " + calculateTheArea() + ", периметр прямоугольника "
                + calculatePerimeter());
    }
}
