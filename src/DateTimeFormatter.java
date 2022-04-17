import org.springframework.format.datetime.standard.DateTimeFormatterFactory;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public class DateTimeFormatter {

    public static void main(String[] args) {
        getFormattedDate();
    }

    private static void getFormattedDate() {
        String formattedDate = "";
        OffsetDateTime date = OffsetDateTime.now();
        System.out.println(date);
        formattedDate  = new DateTimeFormatterFactory("yyyyMMdd000000")
                .createDateTimeFormatter()
                .format(date);
        System.out.println(formattedDate);
    }
}
