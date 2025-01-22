package day5;

import java.util.Scanner;

public class LoopEx02 {
    public static void main(String[] args) {
       /* int sum = 0; //누적값 저장
        System.out.println("5개의 숫자를 입력하세요.");
        int n = 0; // 평균을 구할라면 for문 밖이기 때문에 밖에 지정
        for (n = 1;n <=5;n++){
            Scanner input = new Scanner(System.in);

            System.out.println("순서"+ n + "숫자를 입력해 주세요.");
            int num = input.nextInt();
            sum += num;  //sum = sum + num
        }
        System.out.println("합계 : "+ sum);
        System.out.println("평균 : " + (sum/n));*/

        //for문 작성 시 주의할 점: 초식화식에서 부동소수점 floaat 타입을 사용하지 말아야 한다.
        //부동소수점 float 타입은 연산 과정에서 정확히 0.1을 표현하지 못하기 때문에 증감식에서
        //x에 더해지는 실제값은 0.1 보다 약간 클 수 있다. 따라서 최종 반복횟수가 우리가 의도한 10번이 아닌 9번이 된다
        for(float x=0.1f; x<=1; x+=0.1f){
            System.out.println(x);
        }
    }
}
