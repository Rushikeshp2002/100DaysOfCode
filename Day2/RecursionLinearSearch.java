package Recursion.Array;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,3};
        System.out.println(Linear(arr,10,0));

    }

    static boolean Linear(int[] arr, int target , int index){
        if(index == arr.length-1){
            return false;
        }

        return (arr[index]==target) || Linear(arr,target,index+1);
    }
}
