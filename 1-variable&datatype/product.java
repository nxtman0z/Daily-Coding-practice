//product of two number using input
import java.util.*;
public class product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("product of a  and  b is :"  + product);
    }
    
}
