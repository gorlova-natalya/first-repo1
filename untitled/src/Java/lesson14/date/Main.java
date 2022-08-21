package Java.lesson14.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате ДД.ММ.ГГГГ: ");
        String dateIn = in.nextLine();
        Locale locale = new Locale("ru");
        Date date = new SimpleDateFormat("dd.MM.yyyy", locale).parse(dateIn);

        DateService dateService = new DateService();
        dateService.printDayOfWeek(date);

        dateService.nextTuesdayDate();
    }
}
