//swapping two numbers using function

public class swap {
    public static void swapNumbers(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A after swapping :" + a);
        System.out.println("B after swapping :" + b);
        return;

    }
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swapNumbers(a,b);
    }
}
