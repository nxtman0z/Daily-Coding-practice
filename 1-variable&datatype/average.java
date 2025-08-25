import java.util.*;
public class average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        int a = sc.nextInt();
        System.out.println("Enter Second number :");
        int b = sc.nextInt();
        System.out.println("Enter Third number :");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println(avg);
    }
}