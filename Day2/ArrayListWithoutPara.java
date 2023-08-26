package Recursion.Array;

import java.util.ArrayList;

public class ArrayListWithoutPara {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,7,7,4,5,6,7};
        System.out.println(findNum(arr,7,0));

    }
    static ArrayList<Integer> findNum(int[] arr, int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findNum(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
