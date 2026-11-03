package DSA;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){

        int[] arr = { 5,2,7,6,4,1,8,3,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int i, int length) {
        if(i<length){
            int pivot = findPivot(arr,i,length);

            quickSort(arr,i,pivot-1);
            quickSort(arr,pivot+1,length);
        }
    }

    public static int findPivot(int[] arr, int i, int length) {
        int start = i;
        int end = length-1;
        int pivot  = arr[start];

        while(start < end){
            while(arr[start] < pivot) {
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start < end){
                int temp = arr[start];
                 arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        return end;
    }
}
