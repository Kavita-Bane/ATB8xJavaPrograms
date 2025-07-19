package ex_25092024;

public class Lab75_PrePostIncrement {
    public static void main(String[] args) {
        System.out.println("Post-Increment");
        for(int i = 0; i<5; i++){
            System.out.println(i);
        }
        System.out.println("Pre-Increment");
        //pre-increment
        for (int i=0; i<5; ++i){
            System.out.println(i);
        }
        System.out.println("Alphabets");
        for (char ch = 'A' ; ch<='Z' ; ch++){
            System.out.println(ch);
            if(ch=='P')
                break;
        }
    }
}
