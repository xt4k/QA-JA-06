package com.telesens.academy.lesson06home;

public class EnumWeek {
    private String dayName;

    public enum WeekDay {
        MONDAY("понедельник"),
        TUESDAY("вторник"),
        WEDNESDY("среда"),
        THURSDAY("четверг"),
        FRIDAY("пятница"),
        SATURDAY("суббота"),
         SUNDAY("воскресенье");

        WeekDay(Object воскресенье) {
        }
    }

    public EnumWeek(String dayName) {
        this.dayName = dayName;
    }

}
