package com.telesens.academy.lesson04class;

public class Task01 {
    private Subscriber abonent;

    public static void main(String[] args) {
      String abonentRawString = " helen iVanova 35 f 0501234567";
    /*   String fName = parseFname(abonentRawString);
       String lName = parseLname(abonentRawString);
       int age= parseAge(abonentRawString);
       char gender= parseGender(abonentRawString);
       String number= parsePNumber(abonentRawString);
*/
        Subscriber abonent = new Subscriber();
        abonent.setfName(parseFname(abonentRawString));
        abonent.setlName(parseLname(abonentRawString));
        abonent.setAge(parseAge(abonentRawString));
        abonent.setGender(parseGender(abonentRawString));
        abonent.setpNumber(parsePNumber(abonentRawString));

        Subscriber expectedAbonent = new Subscriber("Helen","Ivanova",35,'f',"0501234567");
        expectedAbonent.setlName("Ivanova");

/*        System.out.println(String.format("Subsriber F.Name: %s",abonent.getfName()));
        System.out.println(String.format("Subsriber L.Name: %s",abonent.getlName()));
        System.out.println(String.format("Subsriber Age: %s",abonent.getAge()));
        System.out.println(String.format("Subsriber Gender: %s",abonent.getGender()));
        System.out.println(String.format("Subsriber NUmber: %s",abonent.getpNumber()));*/
        System.out.println();

        System.out.println("Abonent: "+ abonent);
        System.out.println("Abonent: "+ expectedAbonent);

        assert abonent.equals(expectedAbonent);


    }

    private static String parsePNumber(String string) {
        String[] resultString = string.trim().split(" ");
        String num= (resultString[4]);
        return num;
    }

    private static char parseGender(String string) {
        String[] resultString = string.trim().split(" ");
        char gender=resultString[3].charAt(0);
        return gender;
    }

    private static int parseAge(String string) {
        String[] resultString = string.trim().split(" ");
        int age=Integer.parseInt(resultString[2]);
        return age;
    }

    private static String parseLname(String string) {
        String[] resultString = string.trim().split(" ");
        String name = resultString[1];
        name.replaceAll("[0-9]","").split(" ");
        name=resultString[1].toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    private static String parseFname(String string) {
        String[] resultString = string.trim().split(" ");
        String name=resultString[0].toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

}