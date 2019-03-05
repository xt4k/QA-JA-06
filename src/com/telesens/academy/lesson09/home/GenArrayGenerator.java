package com.telesens.academy.lesson09.home;

import java.math.BigInteger;

public class GenArrayGenerator {
    public static void main(String[] args) throws ExceededArrayBoundException {

        GenArray<BigInteger> genArray= new GenArray<BigInteger>(new BigInteger[20]);


        BigInteger[] arrBigInt = new BigInteger[20];
        GenerateNextNumber generateNextNumber = new GenerateNextNumber();
        for (int i = 0; i < arrBigInt.length; i++) {
            arrBigInt[i] = generateNextNumber.getBigIntRandom();
            genArray.set(i,arrBigInt[i]);
            System.out.println("arrBigInt["+i+"] "+arrBigInt[i]);
        }
        System.out.println("genArray: "+genArray.getArray());

    }
}
