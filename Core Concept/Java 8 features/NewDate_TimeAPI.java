
//Java 8 introduced the java.time package to provide a modern API for handling dates, times, durations, and time zones.
//Important classes
//Class	Purpose
//LocalDate	Represents a date without a time or time zone.
//LocalTime	Represents a time without a date or time zone.
//LocalDateTime	Represents a date and time without a time zone.
//ZonedDateTime	Represents a date and time with a time zone.
//Period	Represents a date-based amount of time, such as years, months, and days.
//Duration	Represents a time-based amount of time, such as seconds and nanoseconds.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDate_TimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Date and Time: " + dateTime);
    }
}
