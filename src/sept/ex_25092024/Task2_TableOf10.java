package ex_25092024;

import java.util.Scanner;

public class Task2_TableOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num= sc.nextInt();
        System.out.println("Table of " +num);
        for (int i=1; i<=10; i++)
        {
            System.out.println(num+" x " +i+" = "+(num*i));
        }
    }
}
