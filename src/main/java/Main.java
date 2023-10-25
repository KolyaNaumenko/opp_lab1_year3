import cars.Car;
import cars.Minivan;
import cars.SportUtilityVehicle;
import cars.SportsCar;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = List.of(
                new Minivan("BMW", 33000, 22.7, 180, 8,50),
                new SportsCar("Tesla", 40000, 20, 280, 244,60),
                new SportUtilityVehicle("Mazda", 30000, 30, 180, 6,55),
                new Minivan("Wag", 25000, 18, 220, 6,50),
                new SportsCar("Ford", 55000, 28, 300, 322,120),
                new SportsCar("Audi", 65000, 22, 270, 333,130),
                new SportUtilityVehicle("Peugeot", 22000, 27, 180, 8,50)
        );

        TaxiFleet taxiFleet = new TaxiFleet(cars);
        Scanner scanner = new Scanner(System.in);
        boolean greenLight = true;

        while (greenLight) {
            System.out.print("Enter the command: \n" +
                    "[1] Total Price  \n" +
                    "[2] Sort by Fuel Consumption \n" +
                    "[3] Sort by Maximum and Minimum Speed \n" +
                    "[4] Exit");
            System.out.print("\n");

            int number = scanner.nextInt();
            List<String> result;

            switch (number) {
                case 1:
                    System.out.println("Total price = " + taxiFleet.getTotalPrice());
                    break;
                case 2:
                    result = taxiFleet.sortByFuelConsumption();
                    if (!result.isEmpty()) {
                        System.out.println("Sorted by ascending order: " + result);
                    } else {
                        System.out.println("No cars match the given criteria");
                    }
                    break;
                case 3:
                    System.out.println("Enter the minimum and maximum speed (min, max)");
                    int min = scanner.nextInt();
                    int max = scanner.nextInt();

                    if (min > max) {
                        int temp = max;
                        max = min;
                        min = temp;
                    }

                    result = taxiFleet.getFilteredBySpeed(min, max);

                    if (!result.isEmpty()) {
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("No cars match the given criteria");
                    }
                    break;
                case 4:
                    greenLight = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
            System.out.print("\n");
        }
    }
}