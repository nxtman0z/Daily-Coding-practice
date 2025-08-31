//sum of two number using funnction

import java.util.*;
public class sum {
    public static int calculateSum(int a, int b){
        int sum = a +b;
        System.out.println("sum is : " +sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        calculateSum(a,b);
    }
}
