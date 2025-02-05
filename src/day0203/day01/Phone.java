package day0203.day01;

public class Phone  {
    //필드선언
    public String model;
    public String color;

    //생성자선언
    public Phone(){}
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone (medel, color) 생성자 실행");
    }


    //메소드
    public void bell(){
        System.out.println("벨이 따르릉 울린다.");
    }

    public final void volumeUp(){
        System.out.println("볼륨을 높입니다.");
    }


}
