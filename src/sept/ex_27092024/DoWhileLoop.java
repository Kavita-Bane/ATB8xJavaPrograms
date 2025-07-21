package ex_27092024;

public class DoWhileLoop {
    public static void main(String[] args) {
        //While loop= Initialization->Condition->body->increment/decement
        //DoWhile loop= Initialization->body->condition->.increment/decrement
        int a = 0;
            do {
                System.out.println("Value of a =" +a);
                a++;
        }
            while (a<10);  // while(a<0)=> It will print "value of a=0"
        int c = 0;
        do{
            System.out.println("Value of c= " +c);
            c++;
        }while(c<0);  //It will print value of c

        int b=0;
        while(b<0){
            System.out.println("Valu f b=" +b);  //It will print nothing
            b++;
        }
        }
    }

