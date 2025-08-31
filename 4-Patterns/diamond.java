public class diamond {
    public static void diamondPattern(int n){
        //upper half
        for(int i =1;i<=n;i++){
            //spaces
            for(int s = 1;s<=n -i;s++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=(2 * i) -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i =n;i>=1;i--){
            //spaces
            for(int s = 1;s<=n -i;s++){
                System.out.print(" ");
            }
            //star
            for(int j =1;j<=(2 * i) -1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(8);
    }
}
