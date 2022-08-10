package Java.lesson9;

public interface Usable {

    double calculationVectorLength ();
    double scalarMultiplication (TwoDimensionalVector vectorB);
    double scalarMultiplication (ThreeDimensionalVector vectorD);
    double scalarMultiplication (Vector vector);
    void addingVectors (TwoDimensionalVector vectorB);
    void addingVectors (ThreeDimensionalVector vectorD);
    void subtractingVectors(TwoDimensionalVector vectorB);
    void subtractingVectors(ThreeDimensionalVector vectorD);
}
