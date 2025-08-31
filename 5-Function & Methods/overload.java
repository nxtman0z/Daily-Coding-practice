//function overloading using parameters

/*public class overload {
    //function to add 2 numbers
    public static int sum(int a,int b){
        return a+b;
    }
    //function to add 3 numbers
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,7));

    }
}*/


//function overloading using data types
public class overload{
    //sum of int value
    public static int sum(int a,int b){
        return a+b;
    }
    //sum of two float value
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(4.9f,6.2f));

    }
}