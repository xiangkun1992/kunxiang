package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    /**
     * yyyyMMddHHmmss to LocalDateTime
     * @param dateString yyyyMMddHHmmss
     * @return LocalDateTime
     */
    public LocalDateTime coverStringDateToLocalDateTime(String dateString) {
        return LocalDateTime.parse(dateString, dtf);
    }

}
