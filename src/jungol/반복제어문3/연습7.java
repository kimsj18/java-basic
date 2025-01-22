package jungol.반복제어문3;

import java.util.Scanner;

public class 연습7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 1;
        char a = 'a';

        for(int i=0; i<4;i++){
            for(int j=0;j<1+i;j++){
                System.out.print(a++ +" ");
            }
            for(int j =0;j<4-i;j++){
                System.out.print(b++ +" ");
            }
            System.out.println();
        }
    }
}
