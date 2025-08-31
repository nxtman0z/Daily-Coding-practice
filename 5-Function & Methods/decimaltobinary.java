//convert decimal to binary
public class decimaltobinary {
    public static void decimalToBinary(int dn){
        int mynum = dn;
        int pow = 0;
        int binary = 0;
        while(dn > 0){
            int rem = dn%2;
            binary = binary +(rem *(int)Math.pow(10,pow));
            pow ++;
            dn = dn /2;
        }
        System.out.println("binary form of " + mynum +" " +"is :" + binary);
    }
    public static void main(String[] args) {
        decimalToBinary(7);
    }
}
