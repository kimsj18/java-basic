package day4;

import java.sql.SQLOutput;

public class AssignmentOperatorEx {
    public static void main(String[] args) {
        int result = 10;

        result += 10; //result = result + 10;
        //result -= 10; //result = result + 10;
        //result *= 10; //result = result + 10;
        //result /= 10; //result = result + 10;
        //result %= 10; //result = result + 10;
        System.out.println(result);

        //삼항(조건) 연산자 : (변수 비교연산자 변수) ? 값1 : 값2;
        //간단한 비교연산은 삼항 연산자를 쓰는게 빠르다.

        int score = 65;
        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "입니다.");

    }
}
