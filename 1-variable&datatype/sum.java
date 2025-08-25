
/*public class sum {
    public static void main(String[] args) {
        //calculate sum
        int a = 10;
        int b = 5;
        int sum =a + b;
        System.out.println(sum);
    }
}/* */
// comments in java -> This is for single line 
/*
comment line ->
this is for multiple line
*/

//sum of two number using user input
import java.util.*;
public class sum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a = sc.nextInt();
        System.out.println("Enter second Number:");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("the sum is :"  + sum);
    }
}
