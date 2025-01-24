package day13.inheritance02;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class Phone {
    //멤버 변수
    private String bander;
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getBander() {
        return bander;
    }

    public Phone(){}
    public Phone(String bander, String model, String color){
        this.bander = bander;
        this.model = model;
        this.color = color;
    }
    //멤버 메소드

    //벨이 울린다.
    public void bell(){
        System.out.println("벨이 울린다.");
    }
    //음성을 전송한다.
    public void voice(String message){
        System.out.println("음성"+ message);

    }

    //전송된 음성을 상대방이 들을 수 있다.
    public void receiveVoice(String message){

        System.out.println("상대방음성"+message);
    }
    //벨이 울리면 전화를 받는다.
    public void hangOn(){
        System.out.println("전화받기");
    }
    //전화를 끊는다.
    public void hangUp(){
        System.out.println("전화끊기");
    }
}
