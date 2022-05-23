package com.example.scaler;
import java.lang.*;
import java.util.*;
/*Given an integer array **A** and an integer **B**, you have to print the same array
after rotating it **B** times towards the right.
NOTE: You can use extra memory*/

public class rotationOfNumbers {

    public static void Main (String []args) {

    }
    public static void reverse(int[] A, int start, int end) {
        int i, j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            int B = sc.nextInt() % n;
            reverse(A, 0, n - 1);
            reverse(A, 0, B - 1);
            reverse(A, B, n - 1);

            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println("");

        }
   // }
/*
int [] ans = new int[n];
        int i=0;
        int B= sc.nextInt();
        for (i=0; i<n-B+1;i++){
            ans[i]=A[B+i];
             }
        for(i=0; i<B;i++){
         ans[n-i-1] = A[B-1];
        }
        System.out.print(ans[i]+" ");
*/
}
