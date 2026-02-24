package Exercise1;

public class Calculator {
public static int divide(int a, int b) {
    try{
        return a / b ;
    }catch(ArithmeticException e){
       System.out.println("Eroor : devision by zero !!!");
       return 0;
    }

}

public static void main(String[] args) {
System.out.println(Calculator.divide(10, 2)); 
System.out.println(Calculator.divide(10, 0));
}


}


