package com.codegym.Model;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class MyTimeZone {
    private String timeZone;
    private final String DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

    public MyTimeZone() {
    }

    public MyTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getLocalTime() {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy h:mm:ss a '-' zzzz");
        df.setTimeZone(cal.getTimeZone());
        return df.format(cal.getTime());
    }
}
