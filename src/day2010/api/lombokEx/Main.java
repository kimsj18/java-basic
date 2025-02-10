package day2010.api.lombokEx;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        Member member1 = new Member("shin","ssg",24);
        System.out.println(member1.getId());
        member1.setId("sss");
        System.out.println(member1.toString());
    }
}
