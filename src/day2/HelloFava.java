package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloFava {
    public static void main(String[] args) {
        System.out.println("Hello java");
        callName();
        System.out.println("당신의 이름을 입력해 주세요");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("당신의 이름은 " + name);

        callName();
        String eat = callStringName();
        System.out.println(eat);
        eat = eat + "맛있다. 냠냠";
        System.out.println(eat);
        
        callStringParam(eat);
    }

    public static void callName(){
        System.out.println("내 이르믕ㄹ 불ㄹ줘...아하하하");
    }

    public static String callStringName(){
        String name ="라면";

        return name;
    }

    public static void callStringParam(String eat){
        System.out.println(eat + "callString Param 처리 완료");
    }

}
