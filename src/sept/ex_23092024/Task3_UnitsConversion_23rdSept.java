package ex_23092024;

public class Task3_UnitsConversion_23rdSept {
    public static void main(String[] args) {
        /*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.
         Input. -
         choice - 1 - km → m, km → 1km
         choice - 2 - f → c, f → c
         */
        int choice = 3 ;
        int Km = 500;
        int Cel = 35;
        int Fer = 95;
        switch (choice) {
            case 1 :
                System.out.println("Km to M :" +(Km *0.621371));
                break;
            case 2 :
                System.out.println("Celcius to Fahrenheit :" +(Cel * 1.8 + 32));
                break;
            case 3 :
                System.out.println("Fahrenheit to celcius : "+(Fer-32*5/9));
                break;
            default:
                System.out.println("Default");

        }

    }
}
