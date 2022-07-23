package Java.lesson6.computer;

public class HDD {

    public String name;
    public int volumeInGB;
    public String type;

    public HDD() {
    }

    public HDD(String name, int volumeInGB, String type) {
        this.name = name;
        this.volumeInGB = volumeInGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{Название жесткого диска: '" + name + '\'' +
                ", Объем в ГБ: '" + volumeInGB + '\'' +
                ", Тип жесткого диска: '" + type + '\'' +
                '}';
    }
}