package jungol.배열1;

import java.util.Scanner;

public class 자가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] a = new char[10];
        for(int i = 0; i<10;i++){
           a[i] = sc.next().charAt(0);
        }for(int j=0;j<a.length;j++){
            System.out.print(a[j]);
        }


    }
}
