package ex_20092024;

public class Task1_TernaryOperator_20thSept {
    public static void main(String[] args) {
        //✅ By using Ternary Operators max between 3 numbers.
        int a = 90 ;
        int b = 35;
        int c = 105;
        int result= a>b? (a>c ? a:c):(b>c ? b:c);
        System.out.println(result);
//OR
        int max = a>b ? a:b;
        int maxno = max>c ? max : c;
        System.out.println("Max No :" +maxno);
    }
}
