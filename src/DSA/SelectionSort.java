package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many Values you Have ?");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "Value");
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(selectionSort(nums,n)));
        sc.close();

    }

    private static int[] selectionSort(int[] nums, int n) {
        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if (nums[i]>nums[j]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        return nums;
    }
}
