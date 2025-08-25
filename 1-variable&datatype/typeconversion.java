/*
it is called as widening conversion
conversion happens when
a.type compatible
b.destination type > source type

byte -> short -> int -> float -> long -> double
 */

/*public class typeconversion {
    public static void main(String[] args) {
        int a = 25;
        long b = a;
        System.out.println(b);
        //if we try reverse will throw a error 

    }
}*/

//implicit conversion 
import java.util.*;
public class typeconversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}

