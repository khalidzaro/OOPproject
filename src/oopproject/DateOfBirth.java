package oopproject;

import java.time.LocalDate;

public class DateOfBirth {
    private int year;
    private int month;
    private int day;

    public DateOfBirth(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters and setters (optional)

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    // Additional methods (if needed)
    
    public LocalDate toLocalDate() {
        return LocalDate.of(year, month, day);
    }
}
