package day0203.day01;

public class SmartPhoneMain {
    public static void main(String[] args) {

        SmartPhone myphone = new SmartPhone("갤럭시", "흰색");

        //Phone 으로부터 상속받은 필드 읽어서 출력
        System.out.println(myphone.model);
        System.out.println(myphone.color);

        //SmartPhone 의 필드 읽어서 출력
        System.out.println(myphone.wifi);
        
        //Phone으로부터 상속받은 메소드 호출
        myphone.bell();
        
        //SmartPone으로부터 상속받은 메소드 호출
        myphone.setWifi(true);;
    }
}
