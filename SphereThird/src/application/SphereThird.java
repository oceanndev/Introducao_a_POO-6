package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;
// Third version to calculate sphere circumference and volume

public class SphereThird {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.println();
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi: %.2f%n", Calculator.PI);
        sc.close();
    }
}