package lt.itacademy.java.basics;

public class Operators {

    public static void isTriangle(Double a, Double b, Double c) {
//        Create a method which determines whether triangle is Equilateral
//        (has three equal sides), Isosceles (has two equal sides), Scalene (has no equal sides)
//        or is invalid. Program takes 3 input values (triangle sides).

        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("Triangle is not a Triangle : %f %f %f%n", a, b, c);
        } else if (a.equals(b) && b.equals(c)) {
            System.out.printf("Triangle is Equilateral: %f %f %f%n", a, b, c);

        } else if (a.equals(b) || b.equals(c) || c.equals(a)) {
            System.out.printf("Triangle is a Isosceles : %f %f %f%n", a, b, c);
        } else {
            System.out.printf("Scalene Triangle");
        }
    }

    public static String carEvaluator(float distance, float fuelLeft, float fuelUsage, float fuelPrice) {
        //Create a method which determines whether a car will be able to drive to the destination or not.
        // In case if car is not able to drive. Print out how much fuel does it need to fill the tank more to be able to drive
        // to the destination as well as how much will it cost. If it is able to drive to the destination write how much fuel
        // will it have left on the tank. Program has four parameters: distance to the destination, how much fuel does the car
        // have in the tank, car fuel usage per 100km and fuel price per liter.

        float temp_dest = (float) Math.ceil(distance / 100);
        float KmPerLitle = fuelUsage / 100;
        float LitreForTrip = distance * KmPerLitle;
        if (fuelLeft * KmPerLitle * 100 < distance)
            return "Destination is in " + distance + "km. " + "Car is not able to reach the destination.It needs " + (LitreForTrip - fuelLeft) + " liters of fuel more. It will cost " + fuelPrice * (LitreForTrip - fuelLeft);
        else {
            return "Destination is in " + distance + "km. " + "Car Will reach the destination. And will have " + (fuelLeft - LitreForTrip) + " liters of fuel more.";

        }
    }
    }
}
