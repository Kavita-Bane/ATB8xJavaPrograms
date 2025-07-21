package ex_27092024;

public class Task3_DoWhile {
    public static void main(String[] args) {
        int weight = 45;
        System.out.println("DoWhile Loop");
        do {
            System.out.println("Can donate a blood");
            weight++;
        } while (weight >= 48);

        System.out.println("While Loop");
        int weight1 = 45;
        while (weight1 > 48) {
            System.out.println("Can donate a blood");
            weight1++;
        }
    }
}
