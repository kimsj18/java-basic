package jungol.반복제어문3;

import java.util.Scanner;

public class Main554 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char ch = 'A';
        int num = 1;

        for(int i=0; i < a ; i++){
            for(int j=0 ; j<a-i ; j++){
                System.out.print(num++ +" ");    //숫자
            }
            for (int z = 0; z<i+1;z++){
                System.out.print(ch++ +" ");

            }
            System.out.println();
        }

    }
}
