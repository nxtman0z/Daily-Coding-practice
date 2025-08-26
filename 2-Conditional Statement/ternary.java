//print even or odd using ternary operator
/*public class ternary {
    public static void main(String[] args) {
        int number = 4;
        //ternary operator
        String type = ((number %2 == 0)?"EVEN" : "ODD");
        System.out.println(type);
    }
}*/

//check if a student will pass or fail
/*import java.util.*;
public class ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student :");
        int marks = sc.nextInt();
        String type =marks >= 33 ? "PASS" : "FAIL";
        System.out.println(type);
    }
}*/

public class ternary{
    public static void main(String[] args) {
        int a =63, b = 36;
        boolean x = (a < b)? true : false;
        int y = (a>b)? a : b;
        System.out.println(x);
        System.out.println(y);
    }
}
