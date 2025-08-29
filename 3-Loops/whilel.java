//print hello world 100+ times using while loop
/*import java.util.*;
public class whilel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(counter <100){
            System.out.println("M");
            counter ++;
        }
        System.out.println("printed M 100 times");
    }
}*/


//print number from 1 to 10
/*public class whilel{
    public static void main(String[] args) {
        int count = 1;
        while(count <= 10){
            System.out.print(count +" ");
            count ++;
        }
        System.out.println();
    }
}*/

//print numbers from 1 to n

/*import java.util.*;
public class whilel{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N :");
        int N = sc.nextInt();
        int count = 1;
        while(count <= N){
            System.out.print(count + " ");
            count ++;
        }
        System.out.println();
    }
}*/


//print sum of first n natural numbers
/*import java.util.*;
public class whilel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr N :");
        int N = sc.nextInt();
        int count = 1;
        int sum =0;

        while(count <= N){
            sum += count;
            count ++;
        }
        System.out.println(sum);
    }
}*/

//print square patterns using whilw loop
/*public class whilel{
    public static void main(String[] args) {
        int line = 1;
        while(line <= 4){
            System.out.println("* * * *");
            line ++;
        }
    }
}*/

//print reverse of a number

/*public class whilel{
    public static void main(String[] args) {
        long n= 45675;
        while( n > 0){
            long lastdigit = n % 10;
            System.out.print(lastdigit);
            n /= 10;
        }
        
    }
}*/

//print reverse of a number taken from user
/*import java.util.*;
public class whilel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed :");
        int n= sc.nextInt();
        int rev = 0;
        while(n > 0){
            int lastdigit = n % 10;
            
            rev = (rev * 10) + lastdigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}*/