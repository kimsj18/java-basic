package day0207.ex05.refact;
//로컬 클래스는 생성자와 메소드가 실행될 동안에만 객체를 생성
//메소드의 로컬변수를 로컬 클래스가 사용할 경우 로컬변수는 final특성을 갖게 되므로 값을 읽을수만 있고 쓸수는 없도록 제약되어 있다.
//이유 : 로컬 내부에서 값을 변경하지 못하도록 제한

import java.lang.reflect.Method;


class A{

    //메소드
    void useB(int param){   //= final int param 파이널 자동처리
        //A클래스의 useB()안에 정의된 로컬 클래스 B

            int value = 1;  //= fianl int value = 1; 파이널 자동처리
        class B{
            int field1 = 10;
            static int field2 = 20;

            public B() {
                System.out.println("B-생성자 실행");
            }

            void method1(){
                System.out.println("B-메소드1 실행");
//                System.out.println("원본 필드1"+field1);     //읽기
//                field1 = 30;
//                System.out.println("수정 필드1"+field1);
                System.out.println("param: "+param);    //읽기 가능
                System.out.println("value :"+value);    //읽기 가능
//                param = 10;
//                value = 30;
            }

            static void Method2(){
                System.out.println("B-스태틱 메소드2 실행");
            }
        }
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.Method2();


    }


}


public class ABLocalMain {
    public static void main(String[] args) {
        A a = new A();
        //a.useB();



    }
}
