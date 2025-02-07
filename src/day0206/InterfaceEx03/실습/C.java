package day0206.InterfaceEx03.실습;

import day11.openTest.Member;
import jdk.swing.interop.SwingInterOpUtils;

public class C implements A{
    @Override
    public void method1() {
        System.out.println("c의메소드1");
        method2();
    }

    public void method2(){
        System.out.println("c의메소드2");
    }

}
