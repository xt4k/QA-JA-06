package com.telesens.academy.lesson11;

import java.util.ArrayList;
import java.util.Random;

public class SubscriberConstructor {
    private ArrayList<SubscriberExt> arrayListSubsExt;

    public SubscriberConstructor(NamesCollections file, int subsNumbers, int min, int max) {
        arrayListSubsExt = new ArrayList<>();
        SubscriberExt currentSubscriberExt = new SubscriberExt();
        for (int i = 0; i < subsNumbers; i++) {
            Random random = new Random();

            //set subscriber id
            currentSubscriberExt.setId( Integer.toUnsignedLong( i ) );

            //set subscriber firstname + lastname + gender
            // if (!((random.nextInt() % 2) == 0))

            //set subscriber  gender
            Gender randomGender = Gender.getRandomGender();
            currentSubscriberExt.setGender( randomGender );

            //set subscriber firstname + lastname
            if (String.valueOf( randomGender ).equals( "MALE" )) {
                int randomNum = random.nextInt( file.getArListMaleFirstName().size() );
                currentSubscriberExt.setFirstName( file.getArListMaleFirstName( randomNum ) );

                randomNum = random.nextInt( file.getArListMaleLastNames().size() );
                currentSubscriberExt.setLastName( file.getArListMaleFirstName( randomNum ) );


            } else {
                int randomNum = random.nextInt( file.getArListFemaleFirstNames().size() );
                currentSubscriberExt.setLastName( String.valueOf( file.getArListFemaleFirstNames( randomNum ) ) );

                randomNum = random.nextInt( file.getArListFemaleLastNames().size() );
                currentSubscriberExt.setLastName( file.getArListFemaleLastNames( randomNum ) );
            }
            //set Age
            int randomNum = (int) Math.round( random.nextGaussian() * (max + min) / 2 ) + (max + min) / 2 ;
            while ((randomNum < min) | (randomNum > max))
                randomNum = (int) Math.round( Math.abs( random.nextGaussian() * (max + min) / 2 ) );

            currentSubscriberExt.setAge( randomNum );
            System.out.println("set Age");

            //set PhoneNumber
            OperatorPrefixCode operatorPrefixCode = new OperatorPrefixCode();
            operatorPrefixCode.setRandom();
            currentSubscriberExt.setPhoneNumber(operatorPrefixCode.getPrefixCode() );
            System.out.println("set PhoneNumber");

            //add all info into Array.list
            arrayListSubsExt.add( currentSubscriberExt );
        }
    }
}
