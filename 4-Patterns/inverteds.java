//print inverted star pattern
/*import java.util.Scanner;

public class inverteds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();
        for(int i = n;i>= 1; i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}*/

//inverted star pyramid(another way)
import java.util.*;
public class inverteds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for(int i =1;i<=n;i++){
            for(int j =1;j<= n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


