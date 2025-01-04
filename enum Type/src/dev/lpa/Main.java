package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.FRI;
        System.out.println(weekDay);

        for (int i=0;i<10;i++) {

            weekDay = getRandom();
//            System.out.printf("Name is %s, Ordinal value is %d%n", weekDay.name(), weekDay.ordinal());

            switchDayOfWeek(weekDay);

//            if (weekDay==DayOfTheWeek.FRI){
//                System.out.println("Found a Friday!!!");
//            }
        }

        for (Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrices());
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek weekday){
        int weekDayInteger = weekday.ordinal()+1;
        switch (weekday){
            case WED -> System.out.println("Wednesday is Day "+weekDayInteger);
            default -> System.out.println(weekday.name().charAt(0) + weekday.name().substring(1).toLowerCase()+"day is Day " +weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandom(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
