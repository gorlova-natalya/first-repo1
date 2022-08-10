package Java.lesson9;

import java.util.Arrays;

public class Vector implements Usable {

    private int[] values;
    private static final String DESCRIPTION = "Это вектор для системы координат c произвольной размерностью";

    public Vector(int[] values) {
        this.values = values;
    }

    protected Vector() {
    }

    @Override
    public double calculationVectorLength() {
        double sum = 0;
        for (double value : values) {
            sum += value * value;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double scalarMultiplication(TwoDimensionalVector vectorB) {
        return 0;
    }

    @Override
    public double scalarMultiplication(Vector vector) {
        double scalar = 0;
        for (int i = 0; i < values.length; i++) {
            scalar += values[i] * vector.values[i];
        }
        return scalar;
    }

    @Override
    public double scalarMultiplication(ThreeDimensionalVector vectorB) {
        return 0;
    }

    @Override
    public void addingVectors(TwoDimensionalVector vectorB) {
    }

    @Override
    public void addingVectors(ThreeDimensionalVector vectorD) {
    }

    @Override
    public void subtractingVectors(TwoDimensionalVector vectorB) {
    }

    @Override
    public void subtractingVectors(ThreeDimensionalVector vectorD) {
    }

    public Vector addingVectors(Vector vector) {
        int[] newVector = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newVector[i] = values[i] + vector.values[i];
        }
        return new Vector(newVector);
    }

    public Vector subtractingVectors(Vector vector) {
        int[] newVector = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newVector[i] = values[i] - vector.values[i];
        }
        return new Vector(newVector);
    }

    private static int[] generateRandomArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        return array;
    }

    public static Vector[] generate(int n, int dimension) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(generateRandomArray(dimension));
        }
        return vectors;
    }

    public static void compareVectorLength(Vector vector, Vector vector1) {
        double length = vector.calculationVectorLength();
        double length1 = vector1.calculationVectorLength();
        if (length < length1) {
            System.out.println("Длина второго вектора больше: " + length + " < " + length1);
        } else if (length > length1) {
            System.out.println("Длина первого вектора больше: " + length + " > " + length1);
        } else if (length == length1) {
            System.out.println("Длины векторов равны : " + length + " = " + length1);
        }
    }

    @Override
    public String toString() {
        return DESCRIPTION + " {" +
                Arrays.toString(values) +
                '}' + "\n";
    }
}
