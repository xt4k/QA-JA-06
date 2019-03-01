package com.telesens.academy.lesson09.classwork.home;
import java.math.BigInteger;
import java.util.Random;

public class generateNextNumber {
    private int number;
    private Random random = new Random();
    private String string ="999";
    private String strNum;

    public int getNumber() {

       // System.out.println("BigInteger_MAX"+BigInteger.MAX_VALUE);

        for (int i=0;i<=7;i++){
            strNum = strNum +  String.valueOf(random.nextInt(10));

        }
       // BigInteger min = 9990000000;
       // long max = 9999999995;
        int randomNum = random.nextInt(10);

        return number;
    }
}
