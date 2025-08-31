//calculate factorial of a number using function
import java.util.*;
public class factorial {
    public static int calFactorial(int n){
        if( n==1){
            return 1;
        }
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact *i;
        }
        
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n <=0 ){
            System.out.println("Negative number ");
        
        }else{
            int result = calFactorial(n);
            System.out.println("Factorial is :" + result);
        }
        
    }
}
