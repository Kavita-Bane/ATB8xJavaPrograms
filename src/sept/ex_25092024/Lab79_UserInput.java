package ex_25092024;

import java.util.Scanner;

public class Lab79_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();   // For Integer
        System.out.println("Entered number :" +num);

        System.out.println("Enter a string");
        String name = sc.next();
        System.out.println("String :" +name);

    }
}
