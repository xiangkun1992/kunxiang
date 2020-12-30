package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    /**
     * yyyyMMddHHmmss to localdatetime
     * @param dateString yyyyMMddHHmmss
     * @return localdatetime
     */
    public LocalDateTime coverStringDateToLocalDateTime(String dateString) {
        return LocalDateTime.parse(dateString, dtf);
    }

}
