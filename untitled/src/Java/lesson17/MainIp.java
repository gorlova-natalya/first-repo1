package Java.lesson17;

import java.util.Scanner;

public class MainIp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        IpService ipService = new IpService();

        System.out.println("Введите ip-адрес:");
        String ip = in.nextLine();

        if (ipService.isIpValid(ip)) {
            System.out.println("Верный формат адреса");
        } else System.out.println("Неверный формат адреса");
    }
}
