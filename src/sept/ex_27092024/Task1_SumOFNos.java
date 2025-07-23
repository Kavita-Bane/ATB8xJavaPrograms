package ex_27092024;

public class Task1_SumOFNos {
    public static void main(String[] args) {
//        Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.
        int sum = 0;
        int i = 1;
        System.out.println("Sum of No ");
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of No from 1 to 100 is " + sum);
    }
}
