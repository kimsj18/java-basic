package jungol.반복제어문1;

//100아히의 정수
//입력기 생성
//1부터 입력반은 정수 => 루프(반복문) for(반복구간이 정해져 있다)
//1~마지막 입력받은 수까지의 합
//최종합을 출력한다

import java.util.Scanner;

public class 반복제어문1_자가2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;

        for(int b =1; b <=a;b++){
            sum += b;

        }
        System.out.println(sum);



//        do {
//            sum += a;
//            a--;
//            } while (a>=1);
//        System.out.println(sum);
    }
}
