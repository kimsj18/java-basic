package day0205.InterfaceEx01;

public interface RemoteControl {

    //상수선언
    //가장 큰 볼륨을 저장할 멤버 30값 할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0값 할당
    int MIN_VOLUME = 0; //컴파일러가 알아서 public static final 붙여줌
    public abstract void turnOn();  //추상메소드는 바디{} 구현부 없음
    public void turnOff();          //abstract없어도 자동으로 추상메소드

    public abstract void setVolume(int volume); //볼륨 세팅

}
