
import java.lang.classfile.attribute.SourceIDAttribute;

/*type promotion in expression
1.java automatically promotes each byte ,short or char operand to int when
evaluating an expression
2.if one operand is long,float or double the whole expression is 
promoted to long ,float or double respectively
*/


/*public class typepromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)(b));
        System.out.println((int)(a));
        System.out.println(b-a);
    }
}*/

/*public class typepromotion{
    public static void main(String[] args) {
        int a = 5;
        float b = 4.56f;
        long c = 56;
        double d = 54.65;
        double ans = a + b + c + d;
        System.out.println(ans);
    }
}*/

public class typepromotion{
    public static void main(String[] args) {
        byte a = 5;
        //wrong == byte b = a *2;
        byte b = (byte) (a * 2);
        System.out.println(b);
    }
}
