package package2;
import java.util.Scanner;
public class Main1 {
public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double r;
        do{
        System.out.println("enter a positive number");
        r = scr.nextDouble();
        }while(r<0);
        findEvenNumber obj = new findEvenNumber();
        int result = obj.findEvenNumber(r);

        System.out.println("the largest even number strictly less than " + r + " is : " + result);

    
    
}
}
