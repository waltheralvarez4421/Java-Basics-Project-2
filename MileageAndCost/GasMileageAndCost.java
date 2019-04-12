import java.util.Scanner;

/**
   Walther Alvarez
   CISC 500
   Assignment #2
   This program asks the user to input the gas in the tank, 
   fuel efficiency of the vehicle in miles per gallon,
   and the price per a gallon of gas. It then computes the price per 100 miles 
   and how far the vehicle can travel with the gas in the tank.
*/
public class GasMileageAndCost
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      final int distanceToBeTraveled = 100;
      
      System.out.print("Number of gallons of gas in tank: ");
      double gasInTank = in.nextDouble();
      System.out.println();
      System.out.print("Fuel effiency (in miles per gallon): ");
      double fuelEfficiency = in.nextDouble();
      System.out.println();
      System.out.print("Price per gallon of gas: ");
      double pricePerGallon = in.nextDouble();
      System.out.println();
      
      double gallonsNeededToTravel = distanceToBeTraveled / fuelEfficiency;
      double cost = gallonsNeededToTravel * pricePerGallon;
      System.out.printf("Price per 100 miles:       %5.2f", cost);
      System.out.println();
      double distanceAbleToBeTraveled = gasInTank * fuelEfficiency;
      System.out.printf("Miles able to be traveled: %5.2f", distanceAbleToBeTraveled);
      }
}