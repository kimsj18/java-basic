package day0203.package2;

import day0203.package1.A;

public class D extends A{
//D클래스는 A클래스와 다른 패키지에 있지만 A의 자식이므로 A의 protexted필드, 생성자, 메소드 접근이 가능
//하지만, new 연산자를 사용해서 생성자를 직접 호출은 안된다. 하지만 자식 생성자안에서 super()로 A의 생성자를 호출만 가능



    public D(){
        super();    //A 생성자 호출
    }

    public void method1(){
        this.field1 = "value";
        this.method1();;
    }

    public void method2(){
//        A a = new A();
    }
}
