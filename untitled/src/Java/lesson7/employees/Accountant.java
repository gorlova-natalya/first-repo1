package Java.lesson7.employees;

public class Accountant extends Employee {

    public String workSchedule;

    public Accountant (double experience, String name, String position, String duties, String workSchedule) {
        this.experience = experience;
        this.name = name;
        this.position = position;
        this.duties = duties;
        this.workSchedule = workSchedule;
    }
}