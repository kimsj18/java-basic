package jungol.반복제어문3;

import java.util.Scanner;

public class 연습6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;

        for(int i = 0;i<5;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(b+" ");
                b++ ;
            }
            System.out.println();
        }

    }
}
