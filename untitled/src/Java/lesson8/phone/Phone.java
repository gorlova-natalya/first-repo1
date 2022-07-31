package Java.lesson8.phone;

import java.util.Arrays;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public int getNumber() {
        return number;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(int... number) {
        System.out.println("Сообщение отправлено " + Arrays.toString(number));
    }

    @Override
    public String toString() {
        return "Мобильный телефон {" +
                "номер телефона = " + number +
                ", модель = '" + model + '\'' +
                ", вес = " + weight +
                '}';
    }
}
