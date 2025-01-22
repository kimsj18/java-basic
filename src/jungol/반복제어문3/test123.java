package jungol.반복제어문3;

import java.util.Scanner;

public class test123 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // 사용자로부터 입력 받기
            System.out.print("정수를 입력하세요: ");
            int n = sc.nextInt();  // 입력 값 (n)

            // 첫 번째 부분: 별을 증가시키는 부분
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();  // 줄 바꿈
            }

            // 두 번째 부분: 별을 감소시키는 부분
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
}}
