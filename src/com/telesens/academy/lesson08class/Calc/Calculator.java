package com.telesens.academy.lesson08class.Calc;
//import com.telesens.academy.lesson08class.ExceptionDivisionByZero;

import com.telesens.academy.lesson08class.Calc.Ambiquility;
import com.telesens.academy.lesson08class.ExceptionDivisionByZero;

public class Calculator {
    public double div(double d1,double d2) throws ExceptionDivisionByZero, Ambiquility {
        if (d1==0||d2==0) throw new Ambiquility();
        if (d2 == 0)  throw new ExceptionDivisionByZero();
        else return d1/d2;
    }

}
