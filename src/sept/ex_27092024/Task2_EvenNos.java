package ex_27092024;

public class Task2_EvenNos {
    public static void main(String[] args) {
        //Create a Java program that prints the first 5 even numbers using a do-while loop.
        int num = 2;
        int count = 1;
        System.out.println("Even Numbers are:");
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count <= 5);
    }
}

