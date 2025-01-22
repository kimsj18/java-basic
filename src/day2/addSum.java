package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 정수형 면수 value 선언
 value 변수에 10을 할당
 value 변수에 사용자에게 숫자를 입력받아 해당 수샂를 더한 후 result 변수에 정장
 result 출력하는 addSum클래스를 작성하여 결과를 확인하세요. */

public class addSum {
    /*
     * 정수형 변수 value 선언
     * value 변수에 10을 할당
     * value 변수에 사용자에게 숫자를 입력받아 해당 숫자를 더한 후 result 변수에 저장
     * result 출력하는 addSum.java*/
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int value = 10;
        sum += value;
        add(sum);
    }

    private static void add(int sum) {
        int value = sc.nextInt();
        sum += value;
        System.out.println(sum);
    }
}