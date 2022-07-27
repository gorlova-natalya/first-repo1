package Java.lesson6.computer;

public class MainComputer {

    public static void main(String[] args) {

        Computer computer1 = new Computer(2229, "HAFF");
        System.out.println("Компьютер 1 " + computer1);

        Computer computer2 = new Computer(2081, "MultiGame", new RAM("Kingston", 8),
                new HDD("Samsung", 1024, "Внешний"));
        System.out.println("Компьютер 2 " + computer2);
    }
}
