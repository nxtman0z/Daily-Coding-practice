import java.util.*;
public class prime {
    public static boolean isPrime(int n){
        // if(n == 1){
        //     System.out.println("true");
        // }
        boolean isPrime = true;
        for(int i =2;i<= n-1;i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
