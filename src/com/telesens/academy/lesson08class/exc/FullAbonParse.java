package com.telesens.academy.lesson08class.exc;
import static com.telesens.academy.lesson04.Task01.*;

public class FullAbonParse {
    private String fName;
    private String lName;
    private int age;
    private char gender;
    private String pNumber;

    public FullAbonParse(String abonentRawString) throws Exception {
        this.setfName(parseFname(abonentRawString));
        this.setlName(parseLname(abonentRawString));
        this.setAge(parseAge(abonentRawString));
        this.setGender(parseGender(abonentRawString));
        this.setpNumber(parsePNumber(abonentRawString));
        String string = String.format("Abon::\nName: %s \nLastName: %s \nAge: %s \nGender: %s \nPhoneNUmber: %s",this.getfName(),this.getlName(),this.getAge(),this.getGender(),this.getpNumber());
        System.out.println(string);
        //return string;
    }

    public String getfName() {
        return this.fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getpNumber() {
        return this.pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
