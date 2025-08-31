//print square pattern
import java.util.*;
public class square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();

        //outer loop 
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}