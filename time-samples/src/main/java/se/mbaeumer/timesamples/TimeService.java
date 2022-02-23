package se.mbaeumer.timesamples;

import java.util.Calendar;
import java.util.Date;

public class TimeService {

    public static int getWeekDayOfDateDeprecated(final Date date){
        return date.getDay();
    }

    public static int getWeekDayNotDeprecated(final Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }
}
