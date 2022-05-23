package com.example.scaler;

public class goodPair {
    public static void main(String []args){
        int [] A ={1,2,3,4,5,6};

        int result=solve(A,3);
        System.out.println(result);
    }
    public static int solve(int[] A, int B) {

        for(int i=0; i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(i==j){
                    continue;
                }
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}
