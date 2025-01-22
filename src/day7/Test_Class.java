package day7;

import java.util.Scanner;

class Car{
    String color;
    void ColorReturn(){
        System.out.println("자동차 색은 "+ this.color);

    }
}


public class Test_Class {
    public static void main(String[] args) {
//        int num = 1;
//        Scanner sc = new Scanner(System.in);
        Car car1 = new Car();
        Car car2 = new Car();
//        System.out.println(num);
//        System.out.println(sc.toString());
//        System.out.println(car1.toString());
        car1.color = "red";
        car2.color = "blue";
        System.out.println(car1.color);
        System.out.println(car2.color);


    }
}
