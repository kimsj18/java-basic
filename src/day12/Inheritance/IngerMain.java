package day12.Inheritance;

import day10.package2.C;

class Parent{
    int field1 = 10;
    void method1(){
        System.out.println("나는 부모클래스의 method1이야");
    }
}

class Child extends Parent{     //Child클래스는 Parent 클래스에게 상속을 요청
    int field2 = 20;
    Child(){
        super();        //부모먼저호출 결론적으로 최상위인 오브젝트부터 내려온다
    }

    void method2() {
        System.out.println("나는 부모클래스의 method2이야");
    }
}

public class IngerMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Child child = new Child();
        System.out.println(parent.field1);
        parent.method1();

        System.out.println(child.field1 + " "+ child.field2);
        child.method1();
        child.method2();

        child.field1 = 100;
        System.out.println(parent.field1); // 10
        System.out.println(child.field1); // 100
    }
}

