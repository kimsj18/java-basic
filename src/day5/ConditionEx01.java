package day5;

import java.util.Scanner;

public class ConditionEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean rainStatus = false;
        rainStatus = true;
        if(rainStatus){
            System.out.println("우산을 챙기세요");
        }
        //====================================================

        int num = 60;
        if(num<50){
            System.out.println("숫자가 50보다 작습니다.");
        }else{
            System.out.println("이 문장은 if문 외부에 이습니다.");
        }
        //=================================================================

        System.out.println("메뉴를 번호로 고르세요. 1.중식 2.양식");
        int menuChoice = 0;
        menuChoice = 1;
        if(menuChoice==1){
            System.out.println("짜장면 맛있게 드세요");
        }else if(menuChoice==2){
            System.out.println("파스타 맛있게 드세요");
        }else {
            System.out.println("비빔밥 맛있게 드세요");
        }
        //=======================================================

        int num1 = input.nextInt();
        if(num1 == 10){
            System.out.println("숫자가 10입니다.");
        }else if(num1 ==15){
            System.out.println("숫자가 15입니다.");
        }else if(num1 == 20){
            System.out.println("숫자가 20입니다.");
        }else{
            System.out.println("숫자가 존재하지 않습니다.");
        }
        //==========================================================

        System.out.println("점수를 입력하세요.");
        int grade = input.nextInt();

        if( 90 <=grade ){
            if(100 >= grade){
                System.out.println("A 학점");
            }}else if( grade < 90 ){
            System.out.println("B 학점");
        }else if( grade < 80){
            System.out.println("C 학점");
        }else if(grade <70){
            System.out.println("D 학점");
        }else{
            System.out.println("F 학점");
        }

        int num2 = input.nextInt();
        if(num < 100){
            System.out.println("숫자가 100보다 작습니다.");
        }if(num2 > 50){
            System.out.println("숫자가 50보다 큽니다.");
        }

    }
}
