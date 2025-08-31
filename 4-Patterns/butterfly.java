public class butterfly {
    public static void butterflyPattern(int n){
        //uper half
        for(int i =1;i<=n;i++){
            //star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int s = 1;s<=2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i =n;i>=1;i--){
            //star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int s = 1;s<=2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        butterflyPattern(4);
    }
}
