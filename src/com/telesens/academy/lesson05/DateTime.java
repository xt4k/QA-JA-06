package com.telesens.academy.lesson05;

public class DateTime extends Date {
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
        this.hours =0;
        this.minutes=0;
        this.seconds=0;
    }

    public String getDateTime() {
        String string = super.getDate();
        string = string +". DayTime is: " + this.toString();
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

    public String checkTime (DateTime dayTime) {
        if ((hours<0)||(hours>23))
            return "Hours definition error: "+ hours;
        if ((minutes<0)||(minutes>59))
            return "Minutes definition error: "+ minutes;
        if ((seconds<0)||(seconds>59))
            return "Seconds definition error: "+ seconds;
        return "Correct date.";
    }

    public void nextHour(){
        this.hours++;
        if (this.hours==24) {
            super.nextDay();
            hours=0;
        }
    }
    public void nextMinutes(){
        this.minutes++;
        if (this.minutes==60) {
            this.nextHour();
            minutes=0;
        }
    }
    public void nextSeconds() {
        this.seconds++;
        if (this.seconds == 60) {
            this.nextMinutes();
            seconds = 0;
        }
    }

    public void addSeconds(int addedSec) {
        this.seconds = +addedSec;
    }

    public void printTime () {
        System.out.println(String.format(" %02d:%02d:%02d",this.hours,this.minutes,this.seconds));
    }

    public void printTime (boolean isTimeFormat12) {
        if (!isTimeFormat12) this.printTime();
        else {
            this.hours = this.hours%12;
            System.out.println(String.format(" %02d:%02d:%02d pm",this.hours,this.minutes,this.seconds));
        }
    }
    public void printDateTime () {
        super.printDate();
        this.printTime();
    }

    public void printDateTime (boolean is12hFormat) {
        super.printDate();
        if (is12hFormat)
        this.printTime(true);
        else  this.printTime(false);
    }




}