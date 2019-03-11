package com.telesens.academy.lesson11;

import java.util.ArrayList;
import java.util.Random;

public class SubscriberConstructor {
    private SubscriberExt[] subscribers;
    private ArrayList <SubscriberExt> arrayListSubsExt;

    public SubscriberConstructor(NamesCollections file, int subsNumbers) {
        for (int i=0;i<subsNumbers;i++)
        {
            SubscriberExt currentSubscriberExt = null;

           // currentSubscriberExt.setId( Integer.toUnsignedLong( i ) );

            Random random = new Random();
            int randomNum = random.nextInt(file.getArListMaleFirstName().size());
            //System.out.println("file.getArListMaleFirstName().size() "+file.getArListMaleFirstName().size());
            currentSubscriberExt.setFirstName( file.getArListMaleFirstName(randomNum) );

            randomNum = random.nextInt(file.getArListMaleLastNames().size());
            currentSubscriberExt.setLastName( file.getArListMaleFirstName(randomNum) );

            randomNum = random.nextInt(file.getArListFemaleFirstNames().size());
            currentSubscriberExt.setLastName( String.valueOf( file.getArListFemaleFirstNames(randomNum) ) );

            randomNum = random.nextInt(file.getArListFemaleLastNames().size());
            currentSubscriberExt.setLastName( file.getArListFemaleLastNames(randomNum) );

            randomNum = random.nextInt(file.getArListFemaleLastNames().size());
            currentSubscriberExt.setLastName( file.getArListFemaleLastNames(randomNum) );

            randomNum = random.nextInt(file.getArListFemaleLastNames().size());
            currentSubscriberExt.setLastName( file.getArListFemaleLastNames(randomNum) );





            String strRandom = String.valueOf(randomNum);
            while (strRandom.length()<7) {
                strRandom="0"+strRandom;
                System.out.println("strRandom "+strRandom);
            }



           // arrayListSubsExt.add( currentSubscriberExt  );

        }


    }
}
