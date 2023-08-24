package Recursion;

public class FactorialOfANum {
    public static void main(String[] args) {
        int ans = fact(5);
        int ans1 = sum(5);
        System.out.println("Factorial of a number= "+ans);
        System.out.println("Sum of a number= "+ans1);
    }
    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
//    Same goes for sum of a number
    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }

}


