package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;
public class SphereSecond {
    public static void main(String[] args) {
        // Second version to calculate sphere circumference and volume
                Locale.setDefault(Locale.US);
                Scanner sc = new Scanner(System.in);
                Calculator calc = new Calculator();
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double c = calc.circumference(radius);
                double v = calc.volume(radius);
                System.out.println();
                System.out.printf("Circumference: %.2f%n", c);
                System.out.printf("Volume: %.2f%n", v);
                System.out.printf("Pi: %.2f%n", calc.PI);
                sc.close();

        }
}