package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Values you Have ?");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"Value");
            nums[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(bubbleSort(nums, n)));
    }

    private static int[] bubbleSort(int[] nums,int n) {
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
