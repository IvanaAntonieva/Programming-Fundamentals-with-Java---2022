package vehiclecatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String vehicleType = input.split(" ")[0];
            String vehicleModel = input.split(" ")[1];
            String vehicleColor = input.split(" ")[2];
            int vehicleHorsepower = Integer.parseInt(input.split(" ")[3]);
            Vehicle vehicle = new Vehicle(vehicleType, vehicleModel, vehicleColor, vehicleHorsepower);
            vehicleList.add(vehicle);
            input = scanner.nextLine();
        }

        String modelInput = scanner.nextLine();
        while (!modelInput.equals("Close the Catalogue")) {
            for (Vehicle vehicle:vehicleList) {
                if (vehicle.getModel().equals(modelInput)) {
                    System.out.println(vehicle);
                    break;
                }
            }
            modelInput = scanner.nextLine();
        }

        int countCars = 0;
        double sumHPCars = 0;
        double averHPCars = 0;
        int countTrucks = 0;
        double sumHPTrucks = 0;
        double averHPTrucks = 0;

        for (Vehicle vehicle:vehicleList) {
            if (vehicle.getType().equals("car")) {
                countCars++;
                sumHPCars += vehicle.getHorsepower();
            } else if (vehicle.getType().equals("truck")) {
                countTrucks++;
                sumHPTrucks += vehicle.getHorsepower();
            }
        }
        if (sumHPCars == 0) {
            averHPCars = 0;
        } else {
            averHPCars = sumHPCars / countCars;
        }

        if (sumHPTrucks == 0) {
            averHPTrucks = 0;
        } else {
            averHPTrucks = sumHPTrucks / countTrucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averHPCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averHPTrucks);
    }
}
