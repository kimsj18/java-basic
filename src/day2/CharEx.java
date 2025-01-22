package day2;

import javax.swing.event.MouseInputAdapter;
import java.sql.SQLOutput;

public class CharEx {
    public static void main(String[] args) {


        char c1 = 'A';
        char c2 = 65;   // 유니코드 직접 저장

        char c3 = '가';
        char c4 = 44032;

        //char c = ''; //char 타입이ㅡ 변수에 어떤 문자도 대입하지 않으면 에러, 초기화할 목적으로 ' ' 공백(유니코드 :32) 을 넣어야 한다

        System.out.printf("%c %c %c %c",c1,c2,c3,c4);
    }

}
