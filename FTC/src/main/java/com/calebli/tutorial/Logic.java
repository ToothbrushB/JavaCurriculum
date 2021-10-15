package com.calebli.tutorial;

public class Logic {
    public static void main(String[] args) {
        boolean rainy = true;
        if (rainy) {
            System.out.println("Use an umbrella!");
        }

        boolean cloudy = false;
        boolean sunny = true;
        if (cloudy) {
            System.out.println("It is cloudy");
        } else if (sunny) {
            System.out.println("It is sunny");
        } else {
            System.out.println("It is not cloudy or sunny");
        }

        String weather1 = "cloudy";
        switch (weather1) {
            case "sunny":
                System.out.println("It is sunny");
                break;
            case "cloudy":
                System.out.println("It is cloudy");
                break;
            case "rainy":
                System.out.println("It is rainy");
                break;
            default:
                System.out.println("It is not sunny, cloudy, or rainy");
        }


        boolean doorOpen = true;
        boolean doorClosed = false;
        if (doorOpen && !doorClosed) {
            System.out.println("The burglar can enter the building!");
        } else {
            System.out.println("The door is closed");
        }
        System.out.println("Hello there!");

        int dishwasherCapacity = 20;
        int dishesInDishwasher = 30;
        if (dishesInDishwasher >= dishwasherCapacity) {
            System.out.println("The dishwasher is full");
        } else {
            System.out.println("The dishwasher isn't full");
        }

        int percentGrade = 87;
        char letterGrade;
        if (percentGrade >= 90) {
            letterGrade = 'A';
        } else if (percentGrade >= 80) {
            letterGrade = 'B';
        } else if (percentGrade >= 70) {
            letterGrade = 'C';
        } else if (percentGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        boolean lightSwitchOn = true;
        if (lightSwitchOn) {
            System.out.println("The light is on");
        } else {
            System.out.println("The light is off");
        }

        String weather = "sunny";
        switch (weather) {
            case "sunny":
                System.out.println("It is sunny");
                break;

            case "stormy":
                System.out.println("It is stormy");

            case "rainy":
                System.out.println("It is rainy");
                break;

            case "windy":
                System.out.println("It is windy");
                break;

            default:
                System.out.println("Invalid weather");

        }

        int power = 5;
        if (power >= 10) {
            System.out.println("Too much power!");
        } else if (power > 2 && power < 8) {
            System.out.println("Just right");
        } else {
            System.out.println("Need more power!");
        }

        int truckCapacity = 100;
        int numItemsInTruck = 100;
        if (numItemsInTruck < truckCapacity)
            System.out.println("There is more room in the truck");
        else
            System.out.println("The truck is full");

        boolean alarmClockGoesOff = true;
        boolean wakeUp;

        if (alarmClockGoesOff) {
            wakeUp = true;
        } else {
            wakeUp = false;
        }

        boolean someCondition = true;
        boolean anotherCondition = false;
        if (someCondition) {
            // do something
        } else if (anotherCondition) {
            // otherwise, do something else if anotherCondition
        } else {
            // otherwise, do something else
        }

        int value = 2;
        switch (value) {
            case 1:
                // do something
            case 2:
                // fall through from case 1 to 2
                // do something else
                break;
            case 3:
                // do something else
                break;
            default:
                // default case
        }

        boolean doorOpen = true;
        String door = "The door is " + (doorOpen ? "open" : "closed");



    }
}
