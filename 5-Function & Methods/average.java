//Write a Java method to compute the averageof three numbers
import java.util.*;
public class average {
    public static int  calAverage(int a,int b,int c){
        int average =(a + b + c) / 3;
        System.out.println("Average is :" + average);
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter c :");
        int c = sc.nextInt();

        calAverage(a,b,c);

    }
}
