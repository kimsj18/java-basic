package day0206.InterfaceEx02;

import day0203.day01.Car1;
import day0203.day01.HankookTire;
import day0203.day01.KumhoTire;
import day0203.day01.Tire;

//필드 다형성
public class Car1Main {
    public static void main(String[] args) {
        Car1 mycar = new Car1();

        //자동차에 타이어를 장착
        mycar.tire = new Tire();
        mycar.run();

        //한국타이어로 교환
        mycar.tire = new HankookTire();
        mycar.run();


    }
}
