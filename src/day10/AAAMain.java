package day10;

import day10.AAA.AAA;

public class AAAMain {

    public static void main(String[] args) {


        AAA aaa1 = new AAA();
        System.out.println(aaa1.getDdd());
        System.out.println(aaa1.ssn);
        aaa1.setDdd(10.20);
        aaa1.ssn = "12345679";

        aaa1.setName("신세계");
        String name = aaa1.getName();
        System.out.println(name);

    }
}