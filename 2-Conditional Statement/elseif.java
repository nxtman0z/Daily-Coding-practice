//check largest between 2 numbers
/*import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        if( a > b){
            System.out.println("First number is largest");
        }else if( a == b){
            System.out.println("both are equal");
        }else{
            System.out.println("Second number is largest");
        }
        sc.close();
    }
}*/

//write a java program that takes a year from the usr and print whether that year is leap year or not
import java.util.*;
public class elseif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) !=0;
        boolean z =((year % 100 == 0)  && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year + " is a leap year ");
        }else{
            System.out.println(year +" is not a leap year");
        }
        }

    }

