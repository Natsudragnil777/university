package package2;

public class findEvenNumber {

    public int findEvenNumber(double x){
        int n = (int) x;
        if ((int)n % 2 == 0 ){
            return n - 2;
        }else{
            return n - 1;
        }
    }

}
