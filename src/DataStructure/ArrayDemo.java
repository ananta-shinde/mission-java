package DataStructure;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] names = new String[5];

       int[] nums = {20,15,22,40,25,56};


       // sum of array
       int sum = 0;
       for(int i=0;i< nums.length;i++){
           sum  = sum + nums[i];
       }
        System.out.println("sum of array is "+sum);

       // avg of array
        int avg = sum/ nums.length;
        System.out.println("avg of array is :"+avg);

        // largest number of array
        int largerst = nums[0];
        for (int i = 0; i < nums.length; i++) {
                    if (nums[i]>largerst ){
                        largerst = nums[i];
                    }
        }
        System.out.println("largest number of array is :"+largerst);

        // smallest number of array
        int smallest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<smallest ){
                smallest = nums[i];
            }
        }
        System.out.println("smallest number of array is :"+smallest);

    }
}
