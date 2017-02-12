package com.org.dateutil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateUtil {
    public static LocalDate getLastDateOfPreviousMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 0);
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DATE));
    }

    public static String getFormattedLastDateOfPreviousMonth(String format) {
        return getLastDateOfPreviousMonth().format(DateTimeFormatter.ofPattern(format));
    }
}
