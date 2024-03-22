package IfElseIsStatements;
import java.util.Scanner;

public class WeightOnADifferentPlanet {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double earth = 1;
        double jupiter = 2 + 5.0/8.0;
        double mars = 3.0/8/0;
        double mercury = 3.0/10.0;
        double neptune = 1 + 1.0/10.0;
        double pluto = 7.0/10.0;
        double saturn = 1 + 1.0/5.0;
        double uranus = 9.0/10.0;
        double venus = 7.0/8.0;

        System.out.println("Enter your weight:");
        double weight = scan.nextInt();

        System.out.println("Where do you want to travel?");
        String location = scan.next();
        scan.close();
        
        if (location.equalsIgnoreCase("earth")) {
            weight *= earth;
        } else if (location.equalsIgnoreCase("jupiter")) {
            weight *= jupiter;
        } else if (location.equalsIgnoreCase("mars")) {
            weight *= mars;
        } else if (location.equalsIgnoreCase("mercury")) {
            weight *= mercury;
        } else if (location.equalsIgnoreCase("neptune")) {
            weight *= neptune;
        } else if (location.equalsIgnoreCase("pluto")) {
            weight *= pluto;
        } else if (location.equalsIgnoreCase("saturn")) {
            weight *= saturn;
        } else if (location.equalsIgnoreCase("uranus")) {
            weight *= uranus;
        } else if (location.equalsIgnoreCase("venus")) {
            weight *= venus;
        } else {
            System.out.println("Invalid location entered.");
        }

        System.out.println("Your weight on " + location + " would be " + weight);
    }
}