package com.telesens.academy.lesson05home;

public class DateTime extends Date {
    private int day;
    private int month;
    private int year;
    private int hours;
    private int minutes;
    private int seconds;

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        super(day, month, year);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public DateTime(int extHour, int extMin, int extSec) {
        super();
        this.hours = extHour;
        this.minutes= extMin;
        this.seconds = extSec;
    }

    public DateTime() {
        super();
    }

    public String getDateTime() {
        String string = super.getDate();
        string = string +". ToDayTime is: " + toString();
                //Integer.parseInt(this.hours) + Integer.parseInt(this.minutes) + Integer.parseInt(this.seconds);
        return string;
    }

    public boolean setDateTime(int hours, int minutes, int seconds) {
        this.hours=hours;
        this.minutes =minutes;
        this.seconds= seconds;
        return true;
    }

    public boolean setFullDateTime(int day, int month, int year,int hours, int minutes, int seconds) {
        super.setDate(day,month, year);
        this.hours=hours;
        this.minutes =minutes;
        this.seconds= seconds;
        return true;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        // 01/01/1970 00:00:00
        String dateFormat = super.toString();
        String dateTimeFormat = String.format(", DateTime is %02d:%02d:%02d",this.hours,this.minutes,this.seconds);
        return dateFormat+ dateTimeFormat ;
    }


}