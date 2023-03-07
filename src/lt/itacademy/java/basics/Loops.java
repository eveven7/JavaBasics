package lt.itacademy.java.basics;

public class Loops {

      static String calculateHours(int days) {
          //Create a method which calculates how many hours and minutes are in one year (365 days).
          // You must use for loop to get the answer. You can’t just multiply days and hours. Only one input is required days per year.
        int hours = 0;
        int minutes = 0;
        for (int i = 0; i < days; i++) hours += 24;
        for (int j = 0; j < hours; j++) {
            minutes += 60;
        }
        return "Hours: " + hours + ". Minutes: " + minutes + ".";
    }

    public static String calculateHoursLoop(int days) {
          //Refactor your for loop into while loop. You should get the same output as in Task 7.
        int hours = 0;
        int minutes = 0;
        while (days > 0) {
            hours += 24;
            minutes += (24 * 60);
            days--;
        }
        ;
        return "Hours: " + hours + ". Minutes: " + minutes + ".";
    }

    public static int calculateFactorial(int num) {
          //Choose while or for loop and calculate factorial of a number.
        // Your program should take an integer number and calculate it’s factorial and output response to the console
        int number = 1;
        for (int i = 1; i <= num; i++) {
            number *= i;
        }
        return number;
    }
}