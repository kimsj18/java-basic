package remind;
//하나의 인터페이스를 여러 형태를 가질수 있다 : 다형성

import javax.swing.*;

interface A{
    void method1();
}

class B implements A{

    @Override
    public void method1() {
        System.out.println("b의 메소드1");
    }
}

class C implements A{

    @Override
    public void method1() {
        System.out.println("C의 메소드1");
    }
    public void method2(){
        System.out.println("C의 메소드2");
    }
}


public class day250206 {
    public static void action(A a){
        if(a instanceof C) ((C)a).method2();
        else a.method1();
    }

    public static void main(String[] args) {
        action(new B());
        action(new C());

    }
}
