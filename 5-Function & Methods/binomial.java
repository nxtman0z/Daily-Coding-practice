//calculate factorial of a number using function
import java.util.*;
public class binomial {
    public static int calFactorial(int n){
        
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact *i;
        }
        
        return fact;
    }
    public static int calBinomialCoeeficient(int n ,int r){
        int n_fact = calFactorial(n);
        int r_fact = calFactorial(r);
        int nminusr_fact = calFactorial(n-r);
        int Bc = n_fact/(r_fact * nminusr_fact);
        return Bc;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        System.out.println("Enter R :");
        int r = sc.nextInt();

        if(n <=0  || r <= 0){
            System.out.println("Negative number ");
        
        }else{
            int result = calBinomialCoeeficient(n ,r);
            System.out.println("Binomial coefficient is :" + result);
        }
        
    }
}
