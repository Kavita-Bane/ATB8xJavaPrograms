package ex_20092024;

public class Task2_TernaryOperator_20thSept {
    public static void main(String[] args) {
      //  ✅ Ternary Operators to handle multiple conditions.
        // String grade →

//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        int score = 90;
        String grade = (score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : "F";
        System.out.println("Grade :" +grade);
    }
}
