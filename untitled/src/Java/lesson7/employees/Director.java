package Java.lesson7.employees;

public class Director extends Employee {

    public int countOfSubordinates;

    public Director(double experience, String name, String position, String duties, int countOfSubordinates) {
        this.experience = experience;
        this.name = name;
        this.position = position;
        this.duties = duties;
        this.countOfSubordinates = countOfSubordinates;
    }
}
