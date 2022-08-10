package Java.lesson9;

public class TwoDimensionalVector extends Vector implements Usable {

    private int x;
    private int y;
    private static final String DESCRIPTION = "Это вектор для двумерной системы координат";

    public TwoDimensionalVector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double calculationVectorLength() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double scalarMultiplication(TwoDimensionalVector vectorB) {
        return (x * vectorB.x) + (y * vectorB.y);
    }

    @Override
    public double scalarMultiplication(ThreeDimensionalVector vectorB) {
        return 0;
    }

    @Override
    public void addingVectors(TwoDimensionalVector vectorB) {
        System.out.println("Сумма векторов" + "{" + (x + vectorB.x) + ";" + (y + vectorB.y) + "}");
    }

    @Override
    public void addingVectors(ThreeDimensionalVector vectorD) {
        System.out.println(0);
    }

    @Override
    public void subtractingVectors(TwoDimensionalVector vectorB) {
        System.out.println("Разность векторов " + "{" + (x - vectorB.x) + ";" + (y - vectorB.y) + "}");
    }

    @Override
    public void subtractingVectors(ThreeDimensionalVector vectorD) {
    }

    public static TwoDimensionalVector[] randomVectorArray(int N) {
        TwoDimensionalVector[] vectors2DArray = new TwoDimensionalVector[N];
        for (int i = 0; i < N; i++) {
            vectors2DArray[i] = new TwoDimensionalVector((int) (Math.random() * N), (int) (Math.random() * N));
        }
        return vectors2DArray;
    }

    public static void compareVectorLength(TwoDimensionalVector vectorA, TwoDimensionalVector vectorB) {
        double aLength = vectorA.calculationVectorLength();
        double bLength = vectorB.calculationVectorLength();
        if (aLength < bLength) {
            System.out.println("Длина вектора B больше: " + aLength + " < " + bLength);
        } else if (aLength > bLength) {
            System.out.println("Длина вектора A больше: " + aLength + " > " + bLength);
        } else if (aLength == bLength) {
            System.out.println("Длины векторов равны : " + aLength + " = " + bLength);
        }
    }

    @Override
    public String toString() {
        return DESCRIPTION + " {" +
                "x=" + x +
                ", y=" + y +
                '}' + "\n";
    }
}
