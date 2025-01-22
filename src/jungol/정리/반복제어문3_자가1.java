package jungol;

import java.util.Scanner;

public class 반복제어문3_자가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //변수 선언 (자연수 n, 홀수의 합, 홀수의 개수)
        int num = in.nextInt();
        int total = 0;   //1~num사이의 홀수의 누적값
        int count = 0;

        for (int i =0; i<num ;i++){
            if(i%2==1){       //홀수를 찾기위한
                count++;      //홀수 카운트
                total += i;   //홀수 누적값
            }
            if(total >= num) break;
        }
        System.out.printf("%d %d",count,total);

    }
}
