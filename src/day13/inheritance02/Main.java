package day13.inheritance02;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Phone타입으로 유선전화를 생성하여
        Phone phone = new Phone();
        Phone phone1 = new Phone("LG","PLK1023","회색");
        //1. 전화를 건다
        phone.bell();
        //2. 전화를 받는다
        phone.hangOn();
        //3. 메세지를 전송한다.
        phone.voice("보내기보내기보내기");
        //4. 메세지를 수신한다.
        phone.receiveVoice("받기받기받기");
        //5. 전화를 끊는다.
        phone.hangUp();

        System.out.println();

        //bander : 사과 model:사과15pro color : 화이트 스마트폰을 생성하여
        SmartPhone smartphone = new SmartPhone();
        SmartPhone smartphone1 = new SmartPhone("사과","사과15pro","화이트");
        //0. 와이파이를 연결하고 인터넷을 켠다.
        smartphone.setWifi(true);
        //1. 전화를 건다
        phone.bell();
        //2. 전화를 받는다
        phone.hangOn();
        //3. 메세지를 전송한다.
        phone.voice("보내기보내기보내기");
        //4. 메세지를 수신한다.
        phone.receiveVoice("받기받기받기");
        //5. 전화를 끊는다.
        phone.hangUp();


    }
}
