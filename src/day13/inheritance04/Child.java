package day13.inheritance04;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {
//    String name; -> super.name;
//    int age; -> super.age;

    int number;

    public static void main(String[] args) {
        Parent p = new Parent();
        Child child = new Child();

        System.out.println(p.name + p.age);
        System.out.println(child.number+ child.number+child.name);


        //업캐스팅 --> 자식에서 부모로
        Parent p1 = (Parent)child;
        System.out.println(p1.name+p1.age);
        //다운캐스팅 -->부모에서 자식으로
        Child c2 = (Child)p1;
        System.out.println(c2.number+c2.age+c2.name);

        ArrayList arrayList = new ArrayList();
        List<Integer> list = new ArrayList<Integer>();
    }
}
