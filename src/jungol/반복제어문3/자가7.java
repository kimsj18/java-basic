package jungol.반복제어문3;

import java.util.Scanner;

public class 자가7 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 1;
    char c = 'A';

        for(int i=0; i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print(b++ +" ");
            }
            for(int z =0;z<i+1;z++){
                System.out.print(c++ +" ");
            }
        System.out.println();
        }
    }


}
