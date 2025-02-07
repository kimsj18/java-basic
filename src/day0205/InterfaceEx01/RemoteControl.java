package day0205.InterfaceEx01;

import java.security.PublicKey;

public interface RemoteControl {

    //상수선언
    //가장 큰 볼륨을 저장할 멤버 30값 할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0값 할당
    int MIN_VOLUME = 0; //컴파일러가 알아서 public static final 붙여줌
    public abstract void turnOn();  //추상메소드는 바디{} 구현부 없음
    public void turnOff();          //abstract없어도 자동으로 추상메소드

    public abstract void setVolume(int volume); //볼륨 세팅

    //내가 사용했던 이전 볼륨을 기억했다가 쉿모드 해제 이후에 다시 복원
//    void setMute(boolean mute);

    default void setMute(boolean mute) {     //디폴트 구현 객체가 필요한 메소드
        if (mute) {
            System.out.println("쉿 모드 전환");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("쉿 모드 해제");
        }
    }
    //배터리 교체 기능을 정적메소드를 통하여 구현 changeBattert()
    public static void changBattert(){
        System.out.println("배터리교체");
    }
    

        
}
