package jungol.반복제어문3;

import java.util.Scanner;

public class Main549 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;       // 입력된 범위에서 홀수의 합계
        int oddCount = 0;    //홀수의 개수

        for(int i = 0; i<=n;i++){
            if(i%2 == 1){    //홀수의 경우 찾기
                oddCount++;
                total += i;
            }
            if(total >= n) break;

        }
        System.out.printf("%d %d",oddCount,total);
    }
}
