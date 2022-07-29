package Java.lesson7.shapes;

public class ShapeMain {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Triangle(10, 5, 7), new Triangle(11, 9, 8), new Rectangle(2, 4),
                new Rectangle(8, 7), new Circle(6)};

        for (Shape shape : shapes) { //для проверки правильности работы расчетов
            shape.printResults();
        }
        System.out.println();

        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calculatePerimeter();
        }
        System.out.println("Сумма периметров фигур = " + sum);
    }
}
