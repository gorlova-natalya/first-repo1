package Java.lesson8.clinic;

public class Dentist extends Doctor {

    public Dentist(String name) {
        this.name = name;
    }

    @Override
    public void heal() {
        System.out.println("Доктор " + name + ": зубы вылечены.");
    }
}
