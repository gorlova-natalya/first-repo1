package Java.lesson18;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите адрес"); //./file.xml
        String path = in.nextLine();
        File file = new File(path);
        DomParser domParser = new DomParser();
        System.out.println("введите 1 или 2");
        int value = in.nextInt();
        if (value == 1) {

        } else {
            domParser.domParseAndWrite(file);
        }
    }
}
