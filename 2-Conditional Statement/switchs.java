/*import java.util.*;
public class switchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number(1 to 3) :");
        int number = sc.nextInt();

        switch(number){
            case 1:System.out.println("Biryani");
            break ;
            case 2:System.out.println("Samosa");
            break ;
            case 3:System.out.println("Burger");
            break ;
            default :
            System.out.println("kuch bhi nhi ");
        }

    }
}*/

//make a calculator using switch 
/*import java.util.*;
public class switchs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        System.out.println("Enter B :");
        int B = sc.nextInt();
        System.out.println("Enter a operation( +,-,*,/,%) :");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println(A + B);
            break ;
            case '-':System.out.println(A - B);
            break ;
            case '*':System.out.println(A * B);
            break ;
            case '/':System.out.println(A / B);
            break ;
            case '%':System.out.println(A % B);
            break ;
            default:System.out.println("your calculator is in your limits haahahha");
            
        }
    }
}*/


//write a java program to input week number(1 - 7) and print day of week name using switch case
import java.util.*;
public class switchs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(1 -7) :");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("SUNDAY");
                break ;
            case 2:
                System.out.println("MONDAY");
                break ;
            case 3:
                System.out.println("TUESDAY");
                break ;
            case 4:
                System.out.println("WEDNESDAY");
                break ;
            case 5:
                System.out.println("THURSDAY");
                break ;
            case 6:
                System.out.println("FRIDAY");
                break ;
            case 7:
                System.out.println("SATURDAY");
                break ;
            default:
                System.out.println("Enter a valid number");
            
        }
        sc.close();

    }
}