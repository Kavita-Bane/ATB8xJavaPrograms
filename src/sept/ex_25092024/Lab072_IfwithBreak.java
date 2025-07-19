package ex_25092024;

public class Lab072_IfwithBreak {
    public static void main(String[] args) {
        for (int i = 0; i<10 ; i++){
            System.out.println(i);
            if(i==5){
                break; // will print 0 to 5
            }
        }
    }
}
