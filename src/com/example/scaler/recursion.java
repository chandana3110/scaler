package com.example.scaler;

public class recursion {
    public static void main(String args[]){
       int result =  findAthFibonacci(30);
       System.out.println(result);
        recursion re = new recursion();
        //re.test(2,3);
        //int r= addNumbers(20,10);
        //System.out.println(r);
    }
    public int addNumbers(int c, int d) {
        return c+d;
    }


    public static int findAthFibonacci(int A) {
        return fib(A);
    }
    static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
