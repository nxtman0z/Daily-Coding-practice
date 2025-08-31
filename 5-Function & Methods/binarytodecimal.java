//convert binary to decimal
public class binarytodecimal {
    public static void binaryToDecimal(int binarynumber){
        int mynumber = binarynumber;
        int pow = 0;
        int decimal =0;
        while(binarynumber>0){
            int lastdigit = binarynumber % 10;
            decimal = decimal + (lastdigit * (int)Math.pow(2,pow));
            pow ++;
            binarynumber = binarynumber/10;
        }
        System.out.println("decimal of " + mynumber+" "   + "is :" + decimal);
    }

    public static void main(String[] args) {
        binaryToDecimal(111);
    }
}
