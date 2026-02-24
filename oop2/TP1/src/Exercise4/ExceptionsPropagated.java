package Exercise4;

public class ExceptionsPropagated {
    public static void method1() throws ArithmeticException{
        System.out.println("Inside method 1 ");
        method2();
    }

    public static void method2() throws ArithmeticException{
        System.out.println("Inside method 2 ");
        method3();
    }

    public static void method3() throws ArithmeticException{
        System.out.println("Inside method 3 ");
        int x = 10 / 0;
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException e){
            System.out.println("Error : division by zero");
        }
    }

}


