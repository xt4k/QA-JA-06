package com.telesens.academy.lesson05home;

public class DemoMain {
    public static void main(String[] args) {
        System.out.println("lesson 05");

        DemoMain demoMain = new DemoMain();
        System.out.println("demoMain hw");
        System.out.println(demoMain.toString());

        System.out.println("------------");
        Date date = new Date();
        System.out.println("Date is: " + date);

        System.out.println("------------");
        DateTime dateTime = new DateTime(0, 0, 0);
        System.out.println("DateTime is: " + date);
        System.out.println(dateTime); // 01/01/1970 00:00:00

        System.out.println("------------");
        DateTime dateTime2 = new DateTime(10, 2, 2019);
    /*    dateTime.setYear(2019);
        dateTime.setMonth(2);
        dateTime.setDay(11);
        dateTime.setHours(20);
        dateTime.setMinutes(50);
        dateTime.setSeconds(15);
*/
        DateTime dateTimeCurent = new DateTime(11, 02, 2019, 20, 50, 15);
        //11/02/2019 20:50:15
        System.out.println("DateTime is: " + dateTimeCurent);
//        assert dateTimeCurent.toString().equals("11/02/2019 20:50:15");
        // System.out.println(dateTime); // 11/02/2019 20:50:15


        ExtendedTime extendedTime = new ExtendedTime(15, 2, 2018, 16, 42, 4, 231);
        System.out.println("0=========");
        extendedTime.print();
        System.out.println("1=========");
        String str = extendedTime.toString();
        System.out.println("Our extendedTime is: " + str);

        System.out.println("2=========");
        extendedTime.setExtHour(14);
        str = extendedTime.toString();
        System.out.println("Our second extendedTime is: " + str);

        System.out.println("3=========");
        extendedTime.setExtDateTime(22,33,44);
        str = extendedTime.toString();
        System.out.println("Our third extendedTime is: " + str);
        System.out.println("=========");

        System.out.println("4=========");
        extendedTime.setFullDateTime(7,5,1990, 21,34,54, 77);
        str = extendedTime.toString();
        System.out.println("Our fourth extendedTime is: " + str);
        System.out.println("=========");


    }
}
