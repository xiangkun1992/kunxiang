package test;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class DateTestTest {

    private DateTest date;

    @Before
    public void setUp() {
        this.date = new DateTest();
    }

    @Test
    public void testStringDateToLocalDateTime_1() {
        String dateString = "20181120180916";
        String actual = date.coverStringDateToLocalDateTime(dateString).toString();
        assertEquals("2018-11-20T18:09:16", actual);
    }

}