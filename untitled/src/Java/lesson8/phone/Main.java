package Java.lesson8.phone;

public class Main {

    public static void main(String[] args) {

        Phone phoneSamsung = new Phone(111, "Galaxy", 300);
        Phone phoneIphone = new Phone(222, "13 mini");
        Phone phoneXiaomi = new Phone(333, "Redmi Note 9 Pro", 270);

        System.out.println(phoneSamsung);
        System.out.println(phoneIphone);
        System.out.println(phoneXiaomi);

        phoneIphone.receiveCall("мама", 2189894);
        phoneSamsung.receiveCall("бабушка");
        phoneXiaomi.receiveCall("начальник");

        System.out.println("Номер этого телефона " + phoneSamsung.getNumber());
        System.out.println("Номер этого телефона " + phoneIphone.getNumber());
        System.out.println("Номер этого телефона " + phoneXiaomi.getNumber());

        phoneSamsung.sendMessage(2132567, 2152134, 8747654, 9876543);
        phoneIphone.sendMessage(2134563, 2156788, 9087654);
        phoneIphone.sendMessage(6544321, 4567894);
    }
}
