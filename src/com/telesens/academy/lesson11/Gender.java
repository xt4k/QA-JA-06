package com.telesens.academy.lesson11;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");
     private String  gender;

   public String getGender () {
        return this.gender();
    }

    Gender(String gender) {
        this.gender = gender;
    }

    private String gender() {
       this.gender= gender;
        return null;
    }

    public void setGender (String string) {
       this.gender= string;    }


}
