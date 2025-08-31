/*public class linear {
    public static int linearSearch(int numbers[] , int key){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = linearSearch(numbers,key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("The number found at insex :" +index );
        }
    }
}*/

public class linear{
    public static void linearSearch(String foods[], String key) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == key) {
                System.out.println("Food found at index: " + i);
                return; 
            }
        }
        System.out.println("Food not found");
    }

    public static void main(String[] args) {
        String foods[] = {"pizza", "burger", "chowmin", "manchurian"};
        String key = "burger";
        linearSearch(foods, key);
    }
}
