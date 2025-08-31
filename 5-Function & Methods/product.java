//find product of a & b using function
import java.util.*;
public class product {
    public static int calProduct(int a ,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        int prod = calProduct(a,b);
        System.out.println("A * B :" + prod);


    }
}
