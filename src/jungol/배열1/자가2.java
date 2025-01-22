package jungol.배열1;

import java.util.Scanner;

public class 자가2 {
    public static void main(String[] args) {

                int[] a = new int[10];

        for (int i = 0; i <10;i++){
            a[i]=(1+i);
        }
        for(int j =0; j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }
}