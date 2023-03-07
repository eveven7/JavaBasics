package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
//    Calculate cube’s volume and perimeter.

    public static Double calculateVolume(Double args) {
        return args * args * args;

    }

    public static Double calculatePerimeter(Double args) {
        return args * 12;

    }

    public static Double calculateInches(Double feet, Double inch) {
//        Create a method which converts feet and inches to centimeters. It needs to have two parameters.
//        First parameter is feet and second is inches.

        double fullLength = feet * 12 + inch;
        return fullLength * 2.54;

    }

}
