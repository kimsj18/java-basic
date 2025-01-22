package day3;

import java.sql.SQLOutput;

public class moningtest {
    public static void main(String[] args) {
        String str = "수를 출력할 때는 따옴표를 생략합니다.";
        int a = 10;
        int b = 5;
        int result = a+b;
        String str1 = "수내생일은 언제.";
        System.out.printf("%s%n %d + %d = %d%n %s",str,a,b,result,str1);

        //Java13 부터 텍스트 블록 문법을 제공함
        String str2 = """
                
                subject score
                ==============
                  korean    90 
                 english   100 
                computer    80 
                김진수 학생의 점수는 
                최우수로 졸업하였습니다.
                """;
        //역슬래시는 연결문장으로 생각해라
        System.out.println(str2);

        byte bb= 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double ee = ff;

        System.out.println(ee);

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(intValue);

        byte byteValue = 65;
        int charValue3 = byteValue;


    }
}
