package Recursion;

public class PassingNumber {
    public static void main(String[] args) {
        fun(5);

    }

    static void fun(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
//    While passing n-- will lead to an infinite loop of 5
        fun(--n);
    }
}
