package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month < 13) {
            if (month == 2) {
                if (year % 4 == 0 && year != 1900) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(30);
            } else {
                System.out.println(31);
            }
        } else {
            System.out.println("invalid date");
        }
    }

}
