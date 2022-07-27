package Java.lesson6.computer;

public class Computer {

    public double cost;
    public String model;
    public RAM RAM;
    public HDD HDD;

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.RAM = new RAM();
        this.HDD = new HDD();
    }

    public Computer(double cost, String model, RAM RAM, HDD HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "{" +
                "Стоимость = " + cost +
                ", Модель ='" + model + '\'' +
                ", RAM - " + RAM +
                ", HDD - " + HDD +
                '}';
    }
}
