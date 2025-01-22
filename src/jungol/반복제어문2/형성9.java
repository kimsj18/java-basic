package jungol.반복제어문2;

import java.util.Scanner;

public class 형성9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i =1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.printf("(%d, %d) ",i,j);
            }
            System.out.println();
        }
    }
}
