package com.org.dateutil;

public class DateUtilMain {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(DateUtil.getFormattedLastDateOfPreviousMonth(args[0]));
        } else {
            System.out.println("Wrong arguments. Usage: " +
                    "date-util.jar datePattern." +
                    "Example: " +
                    "date-util.jar dd/mm/yyyy");
        }
    }
}
