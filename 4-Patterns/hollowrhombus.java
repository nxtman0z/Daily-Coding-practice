public class hollowrhombus {
    public static void hollowRhombus(int n){
        for(int i =1;i<=n;i++){
            for(int s =1;s<=n -i;s++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                if(i == 1 || i== n || j ==1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
