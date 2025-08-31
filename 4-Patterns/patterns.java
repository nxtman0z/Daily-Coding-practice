public class patterns {
    //hoolow rectangle pattern
    public static void hollowRectangle(int rows,int cols){
        //outer loop 
        for(int i =1;i<=rows;i++){
            //inner loop
            for(int j =1;j<=cols;j++){
                //check boundary condition
                if(i == 1|| i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //inverted rotated star pyramid
    public static void invertedRotatePyramid(int row){
        for(int i =1;i<=row;i++){
            for(int j =1;j<= row -i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted rotated number pyramid
    public static void invertedhalfnumberpyramid(int row){
        for(int i =1;i<=row;i++){
            for(int j=1;j<=row -i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //floyds triangle
    public static void floydsTriangle(int n,int count){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(count + " ");
                count ++;
            }
            System.out.println();
        }
    }

    //0-1 triangle
    public static void zeroOneTriangle(int row){
        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    //butterfly pattern
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

    //solid rhombus
    public static void solidRhombus(int n){
        for(int i =1;i<=n;i++){
            for(int s = 1;s<=n -i;s++){
                System.out.print(" ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hollow rhombus
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

    //diamond pattern
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
        //hollowRectangle(5,6);
        //invertedRotatePyramid(5);
        //invertedhalfnumberpyramid(7);
        //floydsTriangle(6,1);
        //zeroOneTriangle(6);
        //butterflyPattern(4);
        //solidRhombus(7);
        //hollowRhombus(6);
        diamondPattern(7);
    }
}
