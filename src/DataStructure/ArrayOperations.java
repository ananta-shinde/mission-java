package DataStructure;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {20,25,44,12,56};
        Scanner scanner = new Scanner(System.in);

        // traversal through array
//        for(int i=0;i<numbers.length;i++){
//            System.out.println(numbers[i]);
//        }

        // update by value
//        System.out.println("enter value to be replaced :");
//        int oldValue =scanner.nextInt();
//        System.out.println("enter value to be replaced with :");
//        int newValue = scanner.nextInt();
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] == oldValue){
//                numbers[i] = newValue;
//            }
//        }


        // getting index of value from array
        System.out.println("enter value to be searched :");
        int searchvalue = scanner.nextInt();
        int index = -1;
        for(int i=0;i< numbers.length;i++){
            if(numbers[i] == searchvalue){
                index = i;
            }
        }
        System.out.println("index of value is :"+ index);




    }
}
