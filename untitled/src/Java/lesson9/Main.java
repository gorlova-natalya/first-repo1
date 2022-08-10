package Java.lesson9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalVector vectorA = new TwoDimensionalVector(5, 6);
        TwoDimensionalVector vectorB = new TwoDimensionalVector(6, 7);

        System.out.println("Длина вектора A = " + vectorA.calculationVectorLength());
        System.out.println("Длина вектора B =  " + vectorB.calculationVectorLength());

        System.out.println("Произведение двумерных векторов " + vectorA.scalarMultiplication(vectorB));

        ThreeDimensionalVector vectorC = new ThreeDimensionalVector(3, 4, 5);
        ThreeDimensionalVector vectorD = new ThreeDimensionalVector(7, 6, 5);

        System.out.println("Длина вектора C = " + vectorC.calculationVectorLength());
        System.out.println("Длина вектора D = " + vectorD.calculationVectorLength());

        System.out.println("Произведение трехмерных векторов " + vectorC.scalarMultiplication(vectorD));

        vectorA.addingVectors(vectorB);
        vectorC.addingVectors(vectorD);

        vectorA.subtractingVectors(vectorB);
        vectorC.subtractingVectors(vectorD);

        System.out.println("Вектор А: " + vectorA);
        System.out.println("Вектор B: " + vectorB);
        System.out.println("Вектор C: " + vectorC);
        System.out.println("Вектор D: " + vectorD);

        System.out.println(Arrays.toString(TwoDimensionalVector.randomVectorArray(4)));
        System.out.println(Arrays.toString(ThreeDimensionalVector.randomVectorArray(5)));

        TwoDimensionalVector.compareVectorLength(vectorA, vectorB);
        ThreeDimensionalVector.compareVectorLength(vectorC, vectorD);

        int[] values = {3, 6, 5, 4};
        Vector vector = new Vector(values);
        int[] values1 = {3, 7, 8, 9};
        Vector vector1 = new Vector(values1);
        System.out.println("Длина " + vector.calculationVectorLength());
        System.out.println("Длина " + vector1.calculationVectorLength());
        System.out.println("Произведение " + vector1.scalarMultiplication(vector));
        System.out.println("Сумма " + vector1.addingVectors(vector));
        System.out.println("Разность " + vector1.subtractingVectors(vector));
        Vector.compareVectorLength(vector, vector1);
        System.out.println(Arrays.toString(Vector.generate(3, 4)));
    }
}
