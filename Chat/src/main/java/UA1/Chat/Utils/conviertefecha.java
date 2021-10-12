package UA1.Chat.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javafx.util.converter.LocalDateTimeStringConverter;

public class conviertefecha {
    public static LocalDateTimeStringConverter localDate(DateTimeFormatter datetime) {
        return new LocalDateTimeStringConverter(datetime, datetime);
    }
    
    public static String LocalDateToString(LocalDateTime localDateTime) {
        return localDate(DateTimeFormatter.ofPattern("HH:mm:ss")).toString(localDateTime);
    }
}