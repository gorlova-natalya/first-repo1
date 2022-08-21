package Java.lesson14.date;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateService {

    public void printDayOfWeek(Date date) {
        System.out.println(new SimpleDateFormat("EEEE").format(date));
    }

    public void nextTuesdayDate() {
        LocalDate today = LocalDate.now();
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Следующий вторник: " + nextTuesday);
    }
}
