package day13.inheritance03;

public class Phone {
    //멤버 변수
    private String bander;
    private String model;
    private String color;

    public String getBander() {
        return bander;
    }

    public String getColor() {
        return color;
    }

    public Phone(){
        System.out.println("Phone() 생성자 실행");
    }



}
