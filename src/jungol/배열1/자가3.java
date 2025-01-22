package jungol.배열1;

import java.util.Scanner;

public class 자가3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] a = new char[10];

        for(int i=0;i<10;i++){
            a[i]=input.next().charAt(0);
        }
        System.out.print(a[0]+" "+a[3]+" "+a[6]);

    }
}
