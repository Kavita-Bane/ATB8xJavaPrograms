package ex_27092024;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        int age = 17;
        do {
            System.out.println("Can Vote");
            age++;
        }while (age<18);  //Here the condition is no satisfying
        int age1 = 17;
        while (age>18){
            System.out.println("Can vote");  //won't print anything
            age++;
        }
    }
}
