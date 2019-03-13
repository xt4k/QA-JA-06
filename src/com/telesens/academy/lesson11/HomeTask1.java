package com.telesens.academy.lesson11;


import java.io.IOException;

public class HomeTask1 {
    static String PROP_FILE_PATH = "F:/KypcbI/QA_JA/lesson11/java-part.properties";

    public static void main(String[] args) {
        ReadPropFile readPropFile = null;

        try {
            readPropFile = new ReadPropFile( PROP_FILE_PATH );
        } catch (IOException e) {
            e.printStackTrace();
        }
        FillArrayListsFromFiles arrayListMaleFirstNames = new FillArrayListsFromFiles( readPropFile.getPathM_FirstNames() );
        FillArrayListsFromFiles arrayListMaleLastNames = new FillArrayListsFromFiles( readPropFile.getPathM_LastNames() );
        FillArrayListsFromFiles arrayListFemaleFirstNames = new FillArrayListsFromFiles( readPropFile.getPathF_FirstNames() );
        FillArrayListsFromFiles arrayListFemaleLastNames = new FillArrayListsFromFiles( readPropFile.getPathF_LastNames() );

        NamesCollections namesCollections = new NamesCollections(
                arrayListMaleFirstNames.getArrayList(),
                arrayListMaleLastNames.getArrayList(),
                arrayListFemaleFirstNames.getArrayList(),
                arrayListFemaleLastNames.getArrayList() );

        System.out.println("namesCollections:"+namesCollections);

//        a) Наполнить таблицу абонентов excel(200 строк):
//        - имена фамилии взять в соответстсвующих файлах (см. 'java-part.properties') со списком имен/фамилий (женских/мужских);
//        - возраст генерировать случайно от 5 до 90 (можно использовать Гауссово распределение для этого диапазона)
//        (диапазон брать из файла 'java-part.properties')


        SubscriberConstructor subscriberConstructor = new SubscriberConstructor(namesCollections,200 );

        System.out.println( "++" );

//        b)  Телефонные номера для каждого оператора со следующими префиксами:
//        - Life номера с префиксами: 38063*******, 38093*******, 38073*******
//        - Kievstar номера с префиксами: 38097*******, 38067*******, 38098*******
//        - Vodafone номера с префиксами: 38050*******, 38066*******, 38095*******
//
//        Результат subscribers.xlsx должен выглядеть так:
//        1 | Васильев  | Иван | м | 23 | 380630025465 | Life
//        2 | Петрова   | Катя | ж | 34 | 380670058694 | Kievstar
//		...
//        2000 | Борисов   | Коля | м | 48 | 380500025465 | Vodafone
//        Всего 200 случайных строк
//
//        + с) Реализовать класс Subscriber с приватными полями:
//        - private Long id;
//        - private String firstName;
//        - private String lastName;
//        - private Gender gender; // создать перечисление Gender для мужского и женского пола
//        - private int age;
//        - private String phoneNumber;
//        - private String operator;
//
//        d) Прочитать subscribers.xlsx в коллекцию Map<Long, Subscriber> и сохранить в текстовый файл: subscribers.txt
//                (путь к файлу взять из 'java-part.properties')
//
//        e) Прочитать subscribers.xlsx в коллекцию List<Subscriber> отсортировать сразу по 4 полям:
//        - оператору
//                - по возрасту
//                - по фамилии
//                - по имени
//
//        f) Сохранить результат сортировки в файл 'sort-subscribers.txt'
//        (путь к файлу взять из 'java-part.properties')
//
//
//        g) Прочитать 1-ый десять строк файла sort-subscribers.txt и вывести на экран
//        (путь к файлу взять из 'java-part.properties')
//
//        3)  Упаковать файлы 'subscribers.txt' и 'java-part.properties' в zip архив 'subscriber.zip'
//        (путь к исходным файлам и zip архиву брать из файла 'java-part.properties')
//
//        4)*  Написать тест, который:
//        - запускает 3 задание
//
//        После этого проверяет:
//        - наличие zip архива:  'subscriber.zip'
//                - кол-во упакованных файлов равно 2
//                - наличие в zip архиве файлов:
//        'subscribers.xlsx'
//        'subscribers.txt'


    }
}
