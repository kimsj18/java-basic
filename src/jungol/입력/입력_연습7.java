package jungol.입력;

import java.util.Scanner;

public class 입력_연습7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.printf("두 수를 입력하시오." +" %d + %d = %d%n",a,b,a+b);
        System.out.printf("%d * %d = %d",a,b,a*b);
    }
}
