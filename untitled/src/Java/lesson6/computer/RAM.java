package Java.lesson6.computer;

public class RAM {

    public String name;
    public int volumeInGB;

    public RAM() {
    }

    public RAM(String name, int volumeInGB) {
        this.name = name;
        this.volumeInGB = volumeInGB;
    }

    @Override
    public String toString() {
        return "{Название RAM: '" + name + '\'' +
                ", Объем в ГБ: '" + volumeInGB + '\'' +
                '}';
    }
}
