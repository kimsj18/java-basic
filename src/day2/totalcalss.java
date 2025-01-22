package day2;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class totalcalss {

    //멤버변수
    static Scanner input= new Scanner(System.in);

    //사칙연산 기능 매서드 fourAarthmetic
    static void fourArithmetic() {

        System.out.print("첫번째숫차입력:");
        int a = input.nextInt();
        System.out.print("두번째숫차입력:");
        int b = input.nextInt();
        int result = a + b;
        result = a + b;
        System.out.printf("a + b = %d%n", a, b, result);
        result = a - b;
        System.out.printf("a - b = %d%n", a, b, result);
        result = a * b;
        System.out.printf("a * b = %d%n", a, b, result);
        result = a / b;
        System.out.printf("a / b = %d%n", a, b, result);
    }
    //operator 기능 메서드
    static void operator() {

        System.out.print("국어점수 jungol.입력: ");
        int kor = input.nextInt();
        System.out.print("영어점수 jungol.입력: ");
        int eng = input.nextInt();
        int total = 0;
        double average = 0.0;

        total = kor + eng;
        average = total/2.0;

        System.out.printf("총점:%d%n", total);
        System.out.printf("평균:%.2f", average); //소수점 3번째 자리에서 반올림한 결과 출력
    }
    //실행 메서드
    public static void main(String[] args) {
        fourArithmetic();
        //operator();
    }
}
