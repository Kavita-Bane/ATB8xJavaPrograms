import java.sql.SQLOutput;

public class MainOverloadExample {

    // Standard main method called by JVM
    public static void main(String[] args) {
        System.out.println("Hello World");
        main(5);  // Calling overloaded version
        main("Hello");
    }

    // Overloaded main method with int parameter
    public static void main(String args) {
        System.out.println("Overloaded main with-Hello world ");
    }

    // Overloaded main method with String parameter
    public static void main(int args) {
        System.out.println("Overloaded main with-Hello world ");
    }
}
