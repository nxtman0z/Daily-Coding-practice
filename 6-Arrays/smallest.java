public class smallest {
    public static int findSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[] = {4,3,6,7,2};
        System.out.println("Smallest numnber is :" + findSmallest(numbers));
    }
}
