/*import java.util.*;
public class areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square:");
        int size = sc.nextInt();

        int area = size * size;
        System.out.println(area);


    }
}*/


//calculate the total cost
import java.util.*;
public class areas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen :");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of Eraser :");
        float Eraser = sc.nextFloat();

        float totalcost = pencil + pen + Eraser;
        System.out.println(totalcost);

        //add 18% gst
        float finalcost = totalcost + (0.18f * totalcost);
        System.out.println("Final cost after gst :" +finalcost);


    }
}
