package day7;

import jdk.swing.interop.DragSourceContextWrapper;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요. : ");
        String name = sc.nextLine();
        System.out.print("연락처를 입력하세요 ; ");
        long phoneNum = sc.nextInt();
        System.out.printf("""                
                *****************************************************
                        Welcome to Shopping Mall
                        Welcome to Book Market!
                *****************************************************
                 1. 고객 정보 확인하기       4.바구니에 항목 추가하기
                 2. 장바구니 상품 목록 보기   5.장바구니의 항목 수량 줄이기
                 3. 장바구니 비우기          6.장바구니의 항목 삭제하기
                 7. 영수증 표시하기          8. 종료
                *****************************************************                
                """);
        while (true) {
            System.out.print("메뉴 번호를 선택해주세요 ");
            int menunum = sc.nextInt();
            System.out.println("현재 고객 정보 :");
            System.out.println("이름 " + name + "   연락처 " + phoneNum);
            System.out.printf("""
                    *****************************************************
                            Welcome to Shopping Mall
                            Welcome to Book Market!
                    *****************************************************
                    """);
            if (menunum == 1) {
                System.out.println("""
                        1. 메뉴 선택
                         김치찌개
                         기타등등
                        """);

            } else if (menunum == 2) {
                System.out.println("""
                        2. 장바구니 상품 목록 보기
                        
                        """);
            }


        }
    }
}