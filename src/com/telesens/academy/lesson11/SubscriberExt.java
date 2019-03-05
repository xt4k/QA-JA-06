package com.telesens.academy.lesson11;

public class SubscriberExt {
    private Long id;
    private String firstName;
	private String lastName;
	private Gender gender; // создать перечисление Gender для мужского и женского пола

	private int age;
	private String phoneNumber;
	private Operator operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public  String toString() {
        String string ="SubscriberExt:\n id=" + id + ",\n firstName= " + firstName +",\n lastName= " + lastName  +           ",\n gender=" + gender +",\n age=" + age + ",\n phoneNumber= " + phoneNumber +",\n operator= " + operator +".";
        return string;
    }
}
