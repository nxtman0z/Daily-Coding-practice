//wap to print the sum of the number of an integer

import java.util.*;
public class sumofinteger {
    public static int sumOfNumbers(int number){
        int sum = 0;
        while(number != 0){
            int ld = number % 10;
            sum = sum + ld;
            number = number / 10;
            
        }
        System.out.println("total sum is :" + sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number :");
        int number = sc.nextInt();
        sumOfNumbers(number);
    }
}
