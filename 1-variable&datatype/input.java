//it is a package
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =sc.next();
        System.out.println("your name is :->" + input);
        //next is used for only single word if u have to input spaces between words then use nextLine
        String name = sc.nextLine();
        System.out.println(name);

        boolean m = sc.nextBoolean();
        System.out.println(m);


    }
}
