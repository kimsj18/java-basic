package day0206.InterfaceEx03.실습;

import java.lang.reflect.Method;

public class Main {
    public static void action(A a){
       if(a instanceof C) ((C) a).method2();
       else a.method1();
    }


    public static void main(String[] args) {
        action(new B());
        action(new C());

    }
}