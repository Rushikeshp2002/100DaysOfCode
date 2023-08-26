package Recursion.Array;

import java.util.ArrayList;

public class ArrayListRecusrion {
    public static void main(String[] args) {
        int[] arr = {1,7,2,7,3,4,5,6,7,8};
        System.out.println(FindEle(arr,7,0,new ArrayList<>()));

    }

    static ArrayList<Integer> FindEle(int[] arr, int target, int index , ArrayList<Integer> list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return FindEle(arr,target,index+1,list);

    }
}
