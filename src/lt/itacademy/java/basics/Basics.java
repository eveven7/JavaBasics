package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//        basics1();
//        basics2();
//        basics3();
//        basics4();
//        basics5();
//        basics6();
     basics7();

    }

    public static void basics1() {
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        // ask users to enter a name
        System.out.print("Enter The name: ");
        String name = scanner.nextLine();
        System.out.print("Enter The  surname : ");
        String surname = scanner.nextLine();
        System.out.print("Enter The  age: ");
        String age = scanner.nextLine();
        System.out.println("Hello my name is ! " + name + " " + surname + " I am  " + age + "years old. I am attending IT & Data Academy 2023!");
    }

    public static void basics2() {
        //Create all of the primitives (except long and double) with different values.
        // Concatenate them into a string and print it to the screen.
        //Output: H3110 w0r1d 2.0 true
        byte lbyte = 3;
        short lshort = 1;
        int lint = 1;
        float lfloat = 2.0f;
        char lchar = 'H';
        boolean lbool = true;
        int zero = 0;
        String lstring = " w0r1d ";

        String output = "" + lchar + lbyte + lshort + lint + zero + " " + "w" + zero + "r" + lshort + "d " + lfloat + " " + lbool;
        System.out.println(output);


    }

    public static void basics3() {
        //  Calculate cube’s volume and perimeter.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        Double number = scanner.nextDouble();

        Double volume = Arithmetic.calculateVolume(number);
        System.out.println("Cube Volume: " + volume);

        Double perimeter = Arithmetic.calculatePerimeter(number);
        System.out.println(" " + "Cube Perimeter: " + perimeter);

    }


    public static void basics4() {
        Scanner scanner = new Scanner(System.in);
//        Create a method which converts feet and inches to centimeters. It needs to have two parameters.
//        First parameter is feet and second is inches.
        System.out.println("Enter The  feet: ");
        Double feet = scanner.nextDouble();
        System.out.println("Enter The  inches: ");
        Double inches = scanner.nextDouble();
        Double fullLength = Arithmetic.calculateInches(feet, inches);
        System.out.println(" " + "The answer: " + fullLength);


    }

    public static void basics5() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first side of Triangle:\n\n");
        Double a = scanner.nextDouble();
        System.out.println("Enter the second side of Triangle:\n\n");
        Double b = scanner.nextDouble();
        System.out.println("Enter the third side of Triangle:\n\n");
        Double c = scanner.nextDouble();

        Operators.isTriangle(a, b, c);

    }

    public static void basics6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance:\n\n");
        Double distance = scanner.nextDouble();
        System.out.println("Enter how much fuel does the car have in the tank:\n\n");
        Double fuelLeft = scanner.nextDouble();
        System.out.println("Enter car fuel usage per 100km :\n\n");
        Double fuelUsage = scanner.nextDouble();
        System.out.println("Enter fuel price per liter:\n\n");
        Double fuelPrice = scanner.nextDouble();
        String output = "Destination is in" + distance + "km" + ". Car is " + "to reach the destination. ";
        System.out.println(output);



    }
    public static void basics7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days:\n\n");
        int a = scanner.nextInt();

        String answer = Loops.calculateHours(a);
        System.out.println("Answer: " + answer);

        String answerWhile = Loops.calculateHoursLoop(a);
        System.out.println("Answer with while loop: " + answerWhile);


        System.out.println("Enter number to calculate factorial:\n\n");
        int b = scanner.nextInt();
        int number = Loops.calculateFactorial(b);
        System.out.println("Answer factorial of a number: " + number);
    }

    public static void basics8() {
        //CALCULATOR

    }
}

