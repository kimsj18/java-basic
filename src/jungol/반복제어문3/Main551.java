package jungol.반복제어문3;

import java.util.Scanner;

public class Main551 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i = 0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
                   }
            for(int z = 0;z<=i;z++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
