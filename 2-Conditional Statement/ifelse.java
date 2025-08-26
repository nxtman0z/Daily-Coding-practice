
/*import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult : drive ,vote");
        }
        if(age >13 && age <18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
        sc.close();
    }
}*/


//print largest  among two number
/*import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        if( a > b){
            System.out.println("First number is biggest");
        }
        else{
            System.out.println("Second number is largest");
        }
    }
}*/


//print if a number is odd or even
/*import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}/* */

//write a java program to get a number from user and print whether it is +Ve or -ve
/*import java.util.*;
public class ifelse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("Positive number");
        }

    }
}*/

//Wap to print u have fever if ur tempreature is above 100 and otherwise prints u dont have fear

public class ifelse{
    public static void main(String[] args) {
        double temp = 103.5;
        if(temp >100.00){
            System.out.println("You have a fever");
        }else{
            System.out.println("your don't have a fever");
        }
    }
}