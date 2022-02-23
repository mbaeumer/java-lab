package se.mbaeumer.timesamples;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TimeServiceTest {

    @Test
    void getWeekDayOfDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 23);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.YEAR, 2022);
        int actual = TimeService.getWeekDayOfDateDeprecated(calendar.getTime());
        assertEquals(3, actual);
    }

    @Test
    void getWeekDayNotDeprecated() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 20);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.YEAR, 2022);
        int actual = TimeService.getWeekDayOfDateDeprecated(calendar.getTime());
        assertEquals(0, actual);
    }
}