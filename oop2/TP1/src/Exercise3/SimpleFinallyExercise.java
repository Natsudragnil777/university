package Exercise3;

     
public class SimpleFinallyExercise { 
 
    // Case 1: No exception 
    public static void case1() { 
        // Write a try/finally block 
        // Inside try: print the message "Case1-Try" 
        // Inside finally: print the message "Case1-Finally" 
        try{
            System.out.println("Case1-Try" );
        }finally{
            System.out.println("Case1-Finally" );
        }

    } 
 
    // Case 2: Caught exception 
    public static void case2() { 
        // Write try/catch/finally 
        // Inside try: print the message "Case2-Try" 
        // Cause a division by zero error 
        // Inside catch: print the message "Case2-Catch" 
        // Inside finally: print "Case2-Finally"
        try{
            System.out.println("Case2-Try" );
            int x = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Case2-Catch" );
        }finally{
            System.out.println("Case2-Finally");
        }
    } 
 
    public static void main(String[] args) { 
 
        System.out.println("=== Test Case 1 ==="); 
         
 case1(); 
 
        System.out.println("\n=== Test Case 2 ==="); 
        
 case2(); 
 
        System.out.println("\nEnd of the program."); 
 
    } 
} 

