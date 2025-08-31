public class reverse {
    public static void reversearray(int numbers[]){
        int first =0,last = numbers.length-1;
        while(first < last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12};
        reversearray(numbers);
        System.out.println("Reversed array is :");
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
}
