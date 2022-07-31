package Java.lesson8.clinic;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        this.name = name;
    }

    @Override
    public void heal() {
        System.out.println("Доктор " + name + ": проведена операция.");
    }
}
