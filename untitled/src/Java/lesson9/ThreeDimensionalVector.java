package Java.lesson9;

public class ThreeDimensionalVector extends Vector implements Usable {

    private int x;
    private int y;
    private int z;
    private static final String DESCRIPTION = "Это вектор для трехмерной системы координат";

    public ThreeDimensionalVector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public double calculationVectorLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public double scalarMultiplication(ThreeDimensionalVector vectorD) {
        return x * vectorD.x + y * vectorD.y + z * vectorD.z;
    }

    @Override
    public void addingVectors(TwoDimensionalVector vectorB) {
    }

    @Override
    public void addingVectors(ThreeDimensionalVector vectorD) {
        System.out.println("Сумма векторов" + "{" + (x + vectorD.x) + ";" + (y + vectorD.y) + ";" + (z + vectorD.z) +
                "}");
    }

    @Override
    public void subtractingVectors(TwoDimensionalVector vectorB) {
    }

    @Override
    public void subtractingVectors(ThreeDimensionalVector vectorD) {
        System.out.println("Разность векторов " +  "{" + (x - vectorD.x) + ";" + (y - vectorD.y) + ";" + (z - vectorD.z)
                + "}");
    }

    public static ThreeDimensionalVector[] randomVectorArray(int N) {
        ThreeDimensionalVector[] vectors3DArray = new ThreeDimensionalVector[N];
        for (int i = 0; i < N; i++) {
            vectors3DArray[i] = new ThreeDimensionalVector((int) (Math.random() * N), (int) (Math.random() * N),
                    (int) (Math.random() * N));
        }
        return vectors3DArray;
    }

    public static void compareVectorLength(ThreeDimensionalVector vectorC, ThreeDimensionalVector vectorD) {
        double cLength = vectorC.calculationVectorLength();
        double dLength = vectorD.calculationVectorLength();
        if (cLength < dLength) {
            System.out.println("Длина вектора D больше: " + cLength + " < " + dLength);
        } else if (cLength > dLength) {
            System.out.println("Длина вектора C больше: " + cLength + " > " + dLength);
        } else if (cLength == dLength) {
            System.out.println("Длины векторов равны : " + cLength + " = " + dLength);
        }
    }

    @Override
    public String toString() {
        return DESCRIPTION + " {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}' + "\n";
    }
}
