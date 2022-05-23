package com.example.scaler;
import java.lang.*;
import java.util.*;

public class maxAndMin {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int N = sc.nextInt();
        int [] A = new int [N];
        int i=0;
        A[0]=sc.nextInt();
        int max= A[0] , min=A[0];
        for (i=1;i<N;i++){
            A[i] = sc.nextInt();
            if(A[i]>max) max= A[i];
            if(min>A[i]) min= A[i];

        }
        System.out.print(max+ " "+ min);
        //System.out.print(String.valueOf(max)+ " "+ String.valueOf(min));
    }
}
