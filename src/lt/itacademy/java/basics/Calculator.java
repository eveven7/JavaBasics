package lt.itacademy.java.basics;
import java.util.Scanner;

public class Calculator {
    //Using what you have learned create a calculator which will calculate figures perimeter and area.
    // You must use switch statement for choosing a figure. Program should run as long as you want to continue using calculator.
    // This means that after calculations are done it must ask if you want to run it again. You must check whether input values are correct
    // if not write an error message that values were incorrect. Calculator must be able to calculate Triangle, Rectangle and Square perimeter
    // and area.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Choose a figure from mentioned : Triangle, Rectangle and Square : ");
            myString = input.next();
            switch (myString) {
                case "Triangle":
                    System.out.println("Triangle!");
                    break;
                case "Rectangle":
                    System.out.println("Rectangle!");
                    break;
                case "Square":
                    System.out.println("Square!");
                    break;
                default:
                    System.out.println("Invalid figure. Please choose again.");
                    break;
            }
        } while (!myString.equals("Stop"));
    }

}
