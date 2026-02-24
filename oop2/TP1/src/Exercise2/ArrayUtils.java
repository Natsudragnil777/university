package Exercise2;

public class ArrayUtils {
 public static int getElement(int[] array, int index) {
    try{
        return array[index];
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Error : Array Index Out Of Bounds ");
        return -1;
    }
 }
 public static void main(String[] args) {
    int t [] = {1, 2, 3}; 
    System.out.println(getElement(t, 1));
    System.out.println(getElement(t, 5));
 }


}

