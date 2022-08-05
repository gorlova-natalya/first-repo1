package Java.lesson8.clinic;

public class Therapist extends Doctor {

    public Therapist(String name) {
        this.name = name;
    }

    @Override
    public void heal() {
        System.out.println("Доктор " + name + ": назначено лечение.");
    }
}
