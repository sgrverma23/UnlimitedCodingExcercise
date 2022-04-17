import org.springframework.format.datetime.standard.DateTimeFormatterFactory;

import java.time.LocalDate;

public class DateFormatter {

    public static void main(String[] args) {
        LocalDate processedDate = LocalDate.parse(LocalDate.now().toString());
        String formattedDate  = new DateTimeFormatterFactory("yyyymmdd").createDateTimeFormatter().format(processedDate);
        System.out.println(formattedDate);
    }
}
