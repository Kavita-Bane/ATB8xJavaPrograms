package ex_27092024;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of side1");
        double sLength1 = sc.nextDouble();
        System.out.println("Enter length of side2");
        double sLength2 = sc.nextDouble();
        System.out.println("Enter length of side3");
        double sLength3 = sc.nextDouble();
        if (sLength1 >= 1 && sLength2 >= 1 && sLength3 >= 1) {
            if (sLength1 == sLength2 && sLength1 == sLength3 && sLength2 == sLength3) {
                System.out.println("Equilateral Triangle");
            } else if (sLength1 == sLength2 || sLength1 == sLength3 || sLength2 == sLength3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid side lengths");
        }
    }
}
