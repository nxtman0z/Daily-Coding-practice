//income tax calculator
/*import java.util.*;
public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income of person :");
        int income = sc.nextInt();

        if(income <500000){
            System.out.println("0% Tax");
        }else if(income >500000  && income <1000000){
            System.out.println("20% Tax");
        }else{
            System.out.println("30% Tax");
        }
    }
}*/

//anpther way
/*import java.util.*;
public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income of person :");
        int income = sc.nextInt();
        int tax;

        if(income <500000){
            tax = 0;
        }else if(income >500000  && income <1000000){
            tax = (int)(income * 0.2);
        }else{
            tax = (int)(income *0.3);
        }
        System.out.println("your tax is " + tax);
    }
}*/


// print the largest of 3
public class incomeTaxCalculator{
    public static void main(String[] args) {
        int a = 1,b = 3,c = 6;
        if(a >=b && a>= c){
            System.out.println("Largest number is :" + a);
        }else if(b>=c){
            System.out.println("The largest number is :" + b);
        }else{
            System.out.println("The largest number is :" + c);
        }
    }
}

