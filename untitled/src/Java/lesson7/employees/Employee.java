package Java.lesson7.employees;

public abstract class Employee implements Printable {

    double experience;
    String name;
    String position;
    String duties;

    @Override
    public void printPosition() {
        System.out.println("Должность: " + position);
    }
}
