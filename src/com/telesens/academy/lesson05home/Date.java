package com.telesens.academy.lesson05home;

public class Date {//1a-1
    private int day;
    private int month;
    private  int year;

    public Date() {//1a-2
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date (Date date){//1a-3

    }

    public void set(int day,int month,int year) {//1a-4
        if (checkValue(day,31)&&checkValue(month,12)&&checkValue(year,1970)&&checkValue(2019,year)==true) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        else System.out.println("wrong date");
    }

  /*  public set (Date date){//1a-5
        this.day = day;
        this.month = month;
        this.year = year;

    }*/

    public boolean checkValue(int value, int boundaryValue) {//1a-6
        if (value > boundaryValue) return false;
        else return true;
    }

    public void setDay(int day) {
        if (day >31) {
            System.out.println("wrong day number");
            return;
        }
        this.day = day;
    }

    public void setMonth(int month) {
        if (month>12){
            System.out.println("wrong month number");
            return;
        }
        this.month = month;
    }

    public void setDate(int day, int month, int year) {
        this.day= day;
        this.month= month;
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getDate() {
        String string = "ToDay is: " + String.format("%02d/%02d/%d",day, month, year);
        return string;
    }

    public int getYear() {
        return year;
    }

 /*   public int getDate() {
        int date =4;
        return date;
    }*/

//1a-12-13-14
    public void nextYear() {
        this.year++;
    }

    public void nextMonth() {
        this.month++;
    }

    public void nextDay() {
        this.day++;
    }




    @Override
    public String toString() {

        String date = String.format("Date is %02d/%02d/%d",day, month, year);
        return date;
    }
}
